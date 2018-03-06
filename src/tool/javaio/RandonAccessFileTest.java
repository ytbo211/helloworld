package tool.javaio;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandonAccessFileTest {

	public static void main(String[] args) throws IOException{
		File datademo=new File("datademo");
		if(!datademo.exists()) {
			datademo.mkdir();
		}
			File file=new File(datademo, "raf.dat");		
			if(!file.exists()) {
				file.createNewFile();
			}
			RandomAccessFile raf=new RandomAccessFile(file,"rw");
			//指针的位置
			System.out.println(raf.getFilePointer());
			
			raf.write('A');//只写一个字节
			System.out.println(raf.getFilePointer());
			raf.write('B');
			System.out.println(raf.getFilePointer());
			
			int i=0x7fffffff;
			//用write方法每次只写一个字节，如果要把i写进去就得写4次
			raf.write(i>>>24);//高八位
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			System.out.println(raf.getFilePointer());
			
			//可以直接写一个int
			raf.writeInt(i);
			
			String s="中";
			byte[] gbk=s.getBytes("gbk");
			raf.write(gbk);
			System.out.println(raf.length());
			System.out.println(raf.getFilePointer());
			
			//读文件，必须把指针移到头部
			raf.seek(0);
			//一次性读取，把文件中的所有内容都读到字节数组中
			byte[] buff=new byte[(int) raf.length()];
			raf.read(buff);
			System.out.println(Arrays.toString(buff));
			String s1=new String(buff,"gbk");
			System.out.println(s1);
			for (byte b : buff) {
				System.out.print(Integer.toHexString(b & 0xff));
			}
			raf.close();
	}
}
