package tool.javaio;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

//�г�file��һЩ���ò���������ˡ������Ȳ���
/**
 * �г��ƶ�Ŀ¼�£���������Ŀ¼���������ļ�
 * @param idr
 * @throws IOException
 *
 */
public class FileUtils {

	public static void listDirectory(File dir) throws IOException{
		if(!dir.exists()) {
			throw new IllegalArgumentException("Ŀ¼��"+dir+"������.");
		}
		if(!dir.isDirectory()) {
			throw new IllegalArgumentException(dir+"����Ŀ¼");
		}
		String[] filenames=dir.list();
		String[] filenames1=null;
		File[] filenamesdown=dir.listFiles();
		String sb=null;
		String sb1=null;
		
		System.out.println("------------------����dir"+dir+"�µ�����------------------");
		for (String filename : filenames) {			
			sb=dir+"\\"+filename;
			System.out.println(sb.toString());									
		}
		
/*		System.out.println("------------------����dir"+dir+"��Ŀ¼�µ�����------------------");		
		if(filenamesdown!=null&&filenamesdown.length>0) {
			
			for (File file : filenamesdown) {
				if(file.isDirectory()) {
					//��������ʵ�ֵݹ飬dir�������������Ŀ¼��һ�����±���
					listDirectory(file);
				}else {
					System.out.println(file);
				}								
			}
		}*/
		
		System.out.println("------------------����dir"+dir+"Ŀ¼��------------------");		
		if(filenamesdown!=null&&filenamesdown.length>0) {			
			for (File file : filenamesdown) {
				if(file.isDirectory()) {
					//�ݹ�
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
