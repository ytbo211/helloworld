package tool.javaio;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class EncodeDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		String s="慕课ABC";
		//转换成字节序列，用的是项目默认的编码gbk
		byte[] bytes1=s.getBytes();
		for (byte b : bytes1) {
			//把字节转换成int以16进制的方式显示
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		//gbk编码中文占用两个字节，英文占用一个字节
		byte[] bytes2=s.getBytes("gbk");
			for (byte b : bytes2) {
				System.out.print(Integer.toHexString(b&0xff)+" ");
			}
		System.out.println();
		
		//utf编码中文占用3个字节，英文占用一个字节
		byte[] bytes3=s.getBytes("utf-8");
		for (byte b : bytes3) {
			System.out.print(Integer.toHexString(b&0xff)+" ");			
		}
		System.out.println();
		
		//java是双字节编码 utf-16be.utf-16be中文占用两个字节，英文占用两个字节
		byte[] bytes4=s.getBytes("utf-16be");
		for (byte b : bytes4) {
			System.out.print(Integer.toHexString(b&0xff)+" ");
		}
		System.out.println();
		
		/*
		 * 当你的字节序列是某种编码时，这个时候想把字节序列变成
		 * 字符串，也需要用这种编码方式，否则会出现乱码
		 */
		
		String s1=new String(bytes4);//用项目默认编码
		System.out.println(s1);
		String s2=new String(bytes4,"utf-16be");
		System.out.println(s2);
		
		/*
		 * 文本文件 就是字节序列
		 * 可以是任意编码的字节血猎
		 * 如果在中文的机器上创建文本文件，那么文本文件只认ANSI编码
		 * 联通、联是一种巧合，它们正好符合了utf-8的编码规则
		 */
		
		
	}

}
