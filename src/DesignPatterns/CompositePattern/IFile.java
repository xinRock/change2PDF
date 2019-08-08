package DesignPatterns.CompositePattern;

import java.util.List;

/**
 *
 * �ļ��ڵ�������ļ���Ŀ¼�ĸ��ࣩ
 **/
public abstract class IFile {
	protected String name;
    public IFile(String name){
        this.name=name;
    }
    
    //��ʾ�ļ������ļ��е�����
    public abstract  void display();
    
    //���
    public abstract  boolean add(IFile iFile);

    //�Ƴ�
    public abstract  boolean remove(IFile iFile);

    //����ӽڵ�
    public abstract  List<IFile> getChild();
    
}
