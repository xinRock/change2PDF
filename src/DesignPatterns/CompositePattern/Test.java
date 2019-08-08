package DesignPatterns.CompositePattern;

import java.util.List;
import java.util.Objects;

/**
 * Composite模式也叫组合模式，是构造型的设
计模式之一。通过递归手段来构造树形的对象结
构，并可以通过一个对象来访问整个对象树
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
        //以下两种写法哪种都可以
        //old
//        for (IFile iFile2 : child) {
//        	displayTree(iFile2);
//		}
        //jdk1.8以后
        child.stream().forEach(iFile->displayTree(iFile));;
    }
}
