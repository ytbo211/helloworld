package tool.javaio;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		String s="Ľ��ABC";
		//ת�����ֽ����У��õ�����ĿĬ�ϵı���gbk
		byte[] bytes1=s.getBytes();
		for (byte b : bytes1) {
			//���ֽ�ת����int��16���Ƶķ�ʽ��ʾ
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		//gbk��������ռ�������ֽڣ�Ӣ��ռ��һ���ֽ�
		byte[] bytes2=s.getBytes("gbk");
			for (byte b : bytes2) {
				System.out.print(Integer.toHexString(b&0xff)+" ");
			}
		System.out.println();
		
		//utf��������ռ��3���ֽڣ�Ӣ��ռ��һ���ֽ�
		byte[] bytes3=s.getBytes("utf-8");
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b&0xff)+" ");			
		}
		System.out.println();
		
		//java��˫�ֽڱ��� utf-16be.utf-16be����ռ�������ֽڣ�Ӣ��ռ�������ֽ�
		byte[] bytes4=s.getBytes("utf-16be");
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*
		 * ������ֽ�������ĳ�ֱ���ʱ�����ʱ������ֽ����б��
		 * �ַ�����Ҳ��Ҫ�����ֱ��뷽ʽ��������������
		 */
		
		String s1=new String(bytes4);//����ĿĬ�ϱ���
		System.out.println(s1);
		String s2=new String(bytes4,"utf-16be");
		System.out.println(s2);
		
		/*
		 * �ı��ļ� �����ֽ�����
		 * ���������������ֽ�Ѫ��
		 * ��������ĵĻ����ϴ����ı��ļ�����ô�ı��ļ�ֻ��ANSI����
		 * ��ͨ������һ���ɺϣ��������÷�����utf-8�ı������
		 */
		
		
	}

}
