package tool.exception;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		TryCatchTest tct=new TryCatchTest();
		int b=tct.test();
		System.out.println("test����ִ����ϣ�����ֵ��:"+b);
		int b2=tct.test2();
		System.out.println("test2����ִ����ϣ�����ֵ��:"+b2);
		int b3=tct.test3();
		System.out.println("test3����ִ����ϣ�����ֵ��:"+b3);
	}
	
	public static int test() {
		int a=10;
		int b=100;
		try {
		while(a>-1) {
			a--;
			b=b+100/a;
		}
			return b;
		}catch(Exception e) {
			e.printStackTrace();//��ӡ�쳣������Ϣ
			System.out.println("ѭ���׳��쳣");
			return -1;
		}		
	}

	public static int test2() {
		int a=10;
		int b=100;
		try {
		while(a>-1) {
			a--;
			b=b+100/a;
		}
			return b;
		}catch(Exception e) {
			e.printStackTrace();//��ӡ�쳣������Ϣ
			System.out.println("ѭ���׳��쳣");
			return b=999;
		}finally {
			System.out.println("����finally��������");
			System.out.println("����b:"+b);			
		}		
	}
	
	public static int test3() {
		int a=10;
		int b=100;
		try {
		while(a>-1) {
			a--;
			b=b+100/a;
		}
		}catch(Exception e) {
			e.printStackTrace();//��ӡ�쳣������Ϣ
			System.out.println("ѭ���׳��쳣");
		}finally {
			System.out.println("����finally��������");
			System.out.println("����b:"+b);			
		}
		return b=1111;//���try...catch...finally����û��return��䣬�򷵻ؿ����return���

	}		
}
