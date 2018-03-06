package tool.javaio;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtil {

	public static void printHex(String fileName) throws IOException{
		FileInputStream in =new FileInputStream(fileName);
		int b;
		int i=1;
		while((b=in.read())!=-1) {
			if(b<=0xf) {
				//单位数前面补零
				System.out.print(0);
			}
			System.out.print(Integer.toHexString(b)+"  ");
			if(i++%10==0) {
				System.out.println();
			}
		}
		in.close();
	}
	
	public static void printHexByByteArray(String fileName) throws IOException{
		FileInputStream in=new FileInputStream(fileName);
		byte[] buf=new byte[20*1024];
/*		int bytes=in.read(buf, 0, buf.length);
		int j=1;
		for(int i=0;i<bytes;i++) {
			if(buf[i]<0xf) {
				System.out.print(0);
			}
			System.out.print(Integer.toHexString(buf[i])+" ");
			if(j++%10==0) {
				System.out.println();
			}
		}*/
		
		int bytes1=0;
		int k=1;
		while((bytes1=in.read(buf, 0, buf.length))!=-1) {
			for(int i=0;i<bytes1;i++) {
				if(buf[i]<0xf) {
					System.out.print(0);
				}
				System.out.print(Integer.toHexString(buf[i]&0xff)+"  ");
				if(k++%10==0) {
					System.out.println();
				}
			}
		}
	}
	


}
