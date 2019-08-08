package DesignPatterns.CompositePattern;

import java.util.List;
import java.util.Objects;

/**
 * CompositeģʽҲ�����ģʽ���ǹ����͵���
��ģʽ֮һ��ͨ���ݹ��ֶ����������εĶ����
����������ͨ��һ����������������������
 * @author menggq
 *
 */
public class Test {

	public static void main(String[] args) {
        Folder root = new Folder("c:");
        Folder rootFolder = new Folder("program files");
        File cmdFile = new File("cmd.exe");

        root.add(rootFolder);
        rootFolder.add(cmdFile);

        displayTree(root);
    }

    public static void displayTree(IFile root){
        if(Objects.isNull(root)){
            return;
        }
        root.display();
        List<IFile> child = root.getChild();
        if(Objects.isNull(child)||child.size()<=0){
            return;
        }
        //��������д�����ֶ�����
        //old
//        for (IFile iFile2 : child) {
//        	displayTree(iFile2);
//		}
        //jdk1.8�Ժ�
        child.stream().forEach(iFile->displayTree(iFile));;
    }
}
