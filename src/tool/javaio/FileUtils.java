package tool.javaio;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

//列出file的一些常用操作比如过滤、遍历等操作
/**
 * 列出制定目录下（包括其子目录）的所有文件
 * @param idr
 * @throws IOException
 *
 */
public class FileUtils {

	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()) {
			throw new IllegalArgumentException("目录："+dir+"不存在.");
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException(dir+"不是目录");
		}
		String[] filenames=dir.list();
		String[] filenames1=null;
		File[] filenamesdown=dir.listFiles();
		String sb=null;
		String sb1=null;
		
		System.out.println("------------------我是dir"+dir+"下的内容------------------");
		for (String filename : filenames) {			
			sb=dir+"\\"+filename;
			System.out.println(sb.toString());									
		}
		
/*		System.out.println("------------------我是dir"+dir+"子目录下的内容------------------");		
		if(filenamesdown!=null&&filenamesdown.length>0) {
			
			for (File file : filenamesdown) {
				if(file.isDirectory()) {
					//调用自身实现递归，dir变量变成了其子目录，一次向下遍历
					listDirectory(file);
				}else {
					System.out.println(file);
				}								
			}
		}*/
		
		System.out.println("------------------我是dir"+dir+"目录树------------------");		
		if(filenamesdown!=null&&filenamesdown.length>0) {			
			for (File file : filenamesdown) {
				if(file.isDirectory()) {
					//递归
					System.out.println(file.getName());
					filenames1=file.list();
					for (String file1 : filenames1) {
						sb1="    "+new File(file1).getName()	;	
						System.out.println(sb1);
					}
				}else {
					sb1=file.getName();
					System.out.println(sb1);
				}								
			}
		}		
	}	
	
/*	public static void main(String[] args) throws IOException {
		listDirectory(new File("F:\\work\\workspace\\SwingDemo"));
	}*/
}
