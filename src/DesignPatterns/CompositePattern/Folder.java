package DesignPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;
/**
 * 文件夹下还有可能有文件
 * @author menggq
 *
 */
public class Folder extends IFile {
	
	private List<IFile> children;
	public Folder(String name) {
		super(name);
		children = new ArrayList<IFile>();
	}

	

	@Override
	public void display() {
		System.out.println("Folder的name=" + name);
	}

	@Override
	public boolean add(IFile iFile) {
		
		return children.add(iFile);
	}

	@Override
	public boolean remove(IFile iFile) {
		return children.remove(iFile);
	}

	@Override
	public List<IFile> getChild() {
		return children;
	}

}
