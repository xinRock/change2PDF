package com.excel;

import java.io.IOException;

import com.jxcell.CellException;
import com.jxcell.View;

public class EncryptDecryptUtil {
	/**
     * 读取excel，并进行加密
     * 
     * @param url
     *            excel文件路径 例：D:\\word.xls
     * @param pwd
     *            加密密码
     */
    public static void encrypt(String url, String pwd) {
        View m_view = new View();
        try {
            // read excel
            m_view.read(url);
            // set the workbook open password
            m_view.write(url, pwd);
        } catch (CellException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * excel 解密
     * 
     * @return void
     * @author rock
     * @date 2019-8-1 下午09:15:49
     */
    public static void decrypt(String url, String pwd) {
        View m_view = new View();
        try {
            // read the encrypted excel file
            m_view.read(url, pwd);

            // write without password protected
            m_view.write(url);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String args[]) {
        // 下面1与2 两个方法请分开执行，可以看到效果
        //
        //1. 把g:\\test.xls 添加打开密码123
        //EncryptDecryptUtil.encrypt("D:\\ZZZ\\工作簿1.xls", "123");
    	EncryptDecryptUtil.encrypt("D:\\ZZZ\\SSM坐标.xlsx", "123");
        //2. 把g:\\test.xls 密码123 去除
        //EncryptDecryptUtil.decrypt("D:\\ZZZ\\工作簿1.xls", "123");
        System.out.println("结束了");

    }

}
