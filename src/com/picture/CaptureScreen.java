package com.picture;

import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
/**
 * 一个简单的全屏截屏
 * @author menggq
 *
 */
public class CaptureScreen {
	
	public static void captureScreen(String fileName, String folder) throws Exception {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenRectangle = new Rectangle(screenSize);
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		// 保存路径
		File screenFile = new File(fileName);
		if (!screenFile.exists()) {
			screenFile.mkdir();
		}
		File f = new File(screenFile, folder);
		ImageIO.write(image, "png", f);
		
		// 自动打开 调用默认打开方式打开
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN))
		{	Desktop.getDesktop().open(f);}
	}

	public static void main(String[] args) {
		try {
			captureScreen("D:\\zPoi\\pic", "11.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
