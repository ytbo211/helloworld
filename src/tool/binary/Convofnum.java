package tool.binary;

/**
 * @author Administrator
 * java�ж����ƶ����ڿ�ƽ̨�������ļ���д������ͨ��
 * 1byte=8bit
 *
 * byte 8 bits -128 - + 127 
 * 1 bit = 1 ���������� 
 * 1 byte = 8 bit 
 * 1 Ӣ���ַ� = 1 byte = 8 bit(λ) 
 * 1 ����(��Ϊjava��˫�ֽڱ���utf-16be) 1 �����ַ�= 2 byte = 16 bit   
 * 4�����ͣ�byte short int long�� 2�ָ����� ������float ˫���ȣ�  1�ֲ����� boolean��1���ַ��ͣ�char
 *  byte��һ���ֽڣ�8λ����-128~127����-2��7�η���2��7�η�-1��
 *  short�������ֽڣ�16λ����-32768~32767����-2��15�η���2��15�η�-1��
 *  int���ĸ��ֽڣ�32λ����һ���ֳ�����-2147483648~2147483647����-2��31�η���2��31�η�-1��
 *  long���˸��ֽڣ�64λ����-9223372036854774808~9223372036854774807����-2��63�η���2��63�η�-1��
 *  float���ĸ��ֽڣ�32λ����3.402823e+38 ~ 1.401298e-45����e+38�ǳ���10��38�η���e-45�ǳ���10�ĸ�45�η���
 *  double���˸��ֽڣ�64λ����1.797693e+308~ 4.9000000e-324��
 *  boolean��true��1�� false��0��
 *  char��unicode�ַ���16λ��
 *  ��Ӧ�����Byte,Short,Integer,Long,Float,Double,Boolean,Character
 */
public class Convofnum {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int i=10;
		//ʮ����ת�ɶ�����
		System.out.println(Integer.toBinaryString(i));
		//ʮ����ת�ɰ˽���
		System.out.println(Integer.toOctalString(i));
		//ʮ����ת����ʮ������
		System.out.println(Integer.toHexString(i));
		//ʮ������ת��ʮ����
		System.out.println(Integer.valueOf("FFFF",16).toString());
		//�˽���ת����ʮ����
		System.out.println(Integer.valueOf("376",8).toString());
		//������ת����ʮ����
		System.out.println(Integer.valueOf("0101",2).toString());
	}

}
