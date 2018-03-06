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
			//ָ���λ��
			System.out.println(raf.getFilePointer());
			
			raf.write('A');//ֻдһ���ֽ�
			System.out.println(raf.getFilePointer());
			raf.write('B');
			System.out.println(raf.getFilePointer());
			
			int i=0x7fffffff;
			//��write����ÿ��ֻдһ���ֽڣ����Ҫ��iд��ȥ�͵�д4��
			raf.write(i>>>24);//�߰�λ
			raf.write(i>>>16);
			raf.write(i>>>8);
			raf.write(i);
			System.out.println(raf.getFilePointer());
			
			//����ֱ��дһ��int
			raf.writeInt(i);
			
			String s="��";
			byte[] gbk=s.getBytes("gbk");
			raf.write(gbk);
			System.out.println(raf.length());
			System.out.println(raf.getFilePointer());
			
			//���ļ��������ָ���Ƶ�ͷ��
			raf.seek(0);
			//һ���Զ�ȡ�����ļ��е��������ݶ������ֽ�������
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
