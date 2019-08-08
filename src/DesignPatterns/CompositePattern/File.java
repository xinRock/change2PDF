package DesignPatterns.CompositePattern;

import java.util.List;
/**
 * 文件节点没有子目录了
 * @author menggq
 *
 */
public class File  extends IFile{
	
	public File(String name){
        super(name);
    }
	@Override
    public void display() {
        System.out.println(name);
    }
	
	@Override
	public boolean add(IFile iFile) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(IFile iFile) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<IFile> getChild() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
