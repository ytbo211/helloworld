package tool.javaio;

import java.io.File;
import java.io.IOException;

public class filedemo {

	public static void main(String[] args) {
		//�˽⹹�캯�������
		File file=new File("F:\\work\\workspace\\filetest");
		System.out.println(file.exists());
		if(!file.exists()) {
			//����
			file.mkdir();
			//�����༶Ŀ¼
			//file.mkdirs();
			System.out.println(file.exists());
		}else {
			//ɾ��
			file.delete();
		}
		
		//�Ƿ���һ��Ŀ¼�������Ŀ¼����true��������ļ�����Ŀ¼�����ڷ���false
		System.out.println(file.isDirectory());
		//�Ƿ���һ���ļ���������ļ�����true�������Ŀ¼�����ļ������ڷ���false
		System.out.println(file.isFile());
		
		//�����ļ�
		File file2=new File("F:"+File.separator+"work"+File.separator+"workspace"+File.separator+"�ռ�.txt");
		//File file2=new File("F:\\work\\workspace"+"�ռ�.txt");//��һ�ֹ��췽������Ŀ¼+��Ŀ¼
		if(!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}else {
			file2.delete();
			System.out.println("file2��ɾ��");
		}
		
		//����file����api
		System.out.println(file2);//��ӡfile2.toString
		System.out.println(file2.toString());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file2.getName());
		System.out.println(file2.getParent());
		System.out.println(file2.getParentFile());
		File file3=file2.getParentFile();
		System.out.println(file3);
		
	}
}
