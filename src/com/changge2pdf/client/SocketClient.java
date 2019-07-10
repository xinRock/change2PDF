package com.changge2pdf.client;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketClient {
	public static void main(String[] args) throws Exception 
    {  
     //���������Socket  
     ServerSocket ss = new ServerSocket(10005);  
     //���տͻ���Socket  
     Socket fileLoaderSocket = ss.accept();  

     //��ӡ������Ϣ  
     String ip = fileLoaderSocket.getInetAddress().getHostAddress();  
     System.out.println(ip + "...conncected");  

     //�����ļ���������  
     InputStream in = fileLoaderSocket.getInputStream();  
     //ʵ��������fileSave
     OutputStream fileSave = new FileOutputStream("D:\\xuniji\\new\\1.pdf");  
     //��������buf
     byte[] buf = new byte[1024];  
     int len = 0;  
     //�ж��Ƿ�����ļ�ĩβ
      while((len=in.read(buf)) != -1) 
        {  
         fileSave.write(buf, 0, len);  
         //ˢ��
         fileSave.flush();  
        }  
     //�����ļ����������Ϣ  
     BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fileLoaderSocket.getOutputStream()));  
     out.write("�ļ��ϴ��ɹ�");  
     //ˢ��
     out.flush();  
     //��Դ�ر�  
     ss.close();  
     fileLoaderSocket.close();  
     fileSave.close();  
   }  
}
