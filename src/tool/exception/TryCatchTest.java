package tool.exception;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TryCatchTest tct=new TryCatchTest();
		int b=tct.test();
		System.out.println("test方法执行完毕，返回值是:"+b);
		int b2=tct.test2();
		System.out.println("test2方法执行完毕，返回值是:"+b2);
		int b3=tct.test3();
		System.out.println("test3方法执行完毕，返回值是:"+b3);
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
			e.printStackTrace();//打印异常具体信息
			System.out.println("循环抛出异常");
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
			e.printStackTrace();//打印异常具体信息
			System.out.println("循环抛出异常");
			return b=999;
		}finally {
			System.out.println("这是finally，哈哈！");
			System.out.println("我是b:"+b);			
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
			e.printStackTrace();//打印异常具体信息
			System.out.println("循环抛出异常");
		}finally {
			System.out.println("这是finally，哈哈！");
			System.out.println("我是b:"+b);			
		}
		return b=1111;//如果try...catch...finally块内没有return语句，则返回块外的return语句

	}		
}
