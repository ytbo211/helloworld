package tool.exception;

/**
 * 实现异常链
 * test1():抛出ExceptionTest自定义异常
 * test2():调用test1(),捕获ExceptionTest自定义异常,并且保证成运行时异常,继续抛出
 * main()方法中，调用test2(),尝试捕获test2()方法抛出的异常
 * @author Administrator
 *
 */
public class ChainTest {
	public void test1() throws ExceptionTest{
		throw new ExceptionTest("自定义异常执行了");
	}
	
	public void test2() {
		
		try {
			test1();
		} catch (ExceptionTest e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			RuntimeException newExc =new RuntimeException("自定义运行时异常执行了");
			newExc.initCause(e);
			throw newExc;
		}		
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ChainTest ct=new ChainTest();
		try {
			ct.test2();
		}catch(RuntimeException r){
			r.printStackTrace();
			System.out.println("test2方法中自定义运行时异常执行了");
		}
		
	}

}
