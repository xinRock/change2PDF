package com.excel;

import java.io.IOException;

import com.jxcell.CellException;
import com.jxcell.View;

public class EncryptDecryptUtil {
	/**
     * ��ȡexcel�������м���
     * 
     * @param url
     *            excel�ļ�·�� ����D:\\word.xls
     * @param pwd
     *            ��������
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
     * excel ����
     * 
     * @return void
     * @author rock
     * @date 2019-8-1 ����09:15:49
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
        // ����1��2 ����������ֿ�ִ�У����Կ���Ч��
        //
        //1. ��g:\\test.xls ��Ӵ�����123
        //EncryptDecryptUtil.encrypt("D:\\ZZZ\\������1.xls", "123");
    	EncryptDecryptUtil.encrypt("D:\\ZZZ\\SSM����.xlsx", "123");
        //2. ��g:\\test.xls ����123 ȥ��
        //EncryptDecryptUtil.decrypt("D:\\ZZZ\\������1.xls", "123");
        System.out.println("������");

    }

}
