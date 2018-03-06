package tool.binary;

/**
 * @author Administrator
 * java中二进制多用在跨平台处理：如文件读写，数据通信
 * 1byte=8bit
 *
 * byte 8 bits -128 - + 127 
 * 1 bit = 1 二进制数据 
 * 1 byte = 8 bit 
 * 1 英文字符 = 1 byte = 8 bit(位) 
 * 1 汉字(因为java是双字节编码utf-16be) 1 中文字符= 2 byte = 16 bit   
 * 4种整型：byte short int long； 2种浮点型 单精度float 双进度；  1种布尔型 boolean；1种字符型：char
 *  byte：一个字节（8位）（-128~127）（-2的7次方到2的7次方-1）
 *  short：两个字节（16位）（-32768~32767）（-2的15次方到2的15次方-1）
 *  int：四个字节（32位）（一个字长）（-2147483648~2147483647）（-2的31次方到2的31次方-1）
 *  long：八个字节（64位）（-9223372036854774808~9223372036854774807）（-2的63次方到2的63次方-1）
 *  float：四个字节（32位）（3.402823e+38 ~ 1.401298e-45）（e+38是乘以10的38次方，e-45是乘以10的负45次方）
 *  double：八个字节（64位）（1.797693e+308~ 4.9000000e-324）
 *  boolean：true（1） false（0）
 *  char：unicode字符（16位）
 *  对应类对象：Byte,Short,Integer,Long,Float,Double,Boolean,Character
 */
public class Convofnum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=10;
		//十进制转成二进制
		System.out.println(Integer.toBinaryString(i));
		//十进制转成八进制
		System.out.println(Integer.toOctalString(i));
		//十进制转换成十六进制
		System.out.println(Integer.toHexString(i));
		//十六进制转成十进制
		System.out.println(Integer.valueOf("FFFF",16).toString());
		//八进制转换成十进制
		System.out.println(Integer.valueOf("376",8).toString());
		//二进制转换成十进制
		System.out.println(Integer.valueOf("0101",2).toString());
	}

}
