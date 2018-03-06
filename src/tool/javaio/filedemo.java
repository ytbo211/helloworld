package tool.javaio;

import java.io.File;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) {
		//了解构造函数的情况
		File file=new File("F:\\work\\workspace\\filetest");
		System.out.println(file.exists());
		if(!file.exists()) {
			//创建
			file.mkdir();
			//创建多级目录
			//file.mkdirs();
			System.out.println(file.exists());
		}else {
			//删除
			file.delete();
		}
		
		//是否是一个目录，如果是目录返回true，如果是文件或者目录不存在返回false
		System.out.println(file.isDirectory());
		//是否是一个文件，如果是文件返回true，如果是目录或者文件不存在返回false
		System.out.println(file.isFile());
		
		//创建文件
		File file2=new File("F:"+File.separator+"work"+File.separator+"workspace"+File.separator+"日记.txt");
		//File file2=new File("F:\\work\\workspace"+"日记.txt");//另一种构造方法，父目录+子目录
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}else {
			file2.delete();
			System.out.println("file2被删除");
		}
		
		//常用file对象api
		System.out.println(file2);//打印file2.toString
		System.out.println(file2.toString());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile());
		File file3=file2.getParentFile();
		System.out.println(file3);
		
	}
}
