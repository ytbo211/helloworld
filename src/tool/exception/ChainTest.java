package tool.exception;

/**
 * ʵ���쳣��
 * test1():�׳�ExceptionTest�Զ����쳣
 * test2():����test1(),����ExceptionTest�Զ����쳣,���ұ�֤������ʱ�쳣,�����׳�
 * main()�����У�����test2(),���Բ���test2()�����׳����쳣
 * @author Administrator
 *
 */
public class ChainTest {
	public void test1() throws ExceptionTest{
		throw new ExceptionTest("�Զ����쳣ִ����");
	}
	
	public void test2() {
		
		try {
			test1();
		} catch (ExceptionTest e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
			RuntimeException newExc =new RuntimeException("�Զ�������ʱ�쳣ִ����");
			newExc.initCause(e);
			throw newExc;
		}		
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ChainTest ct=new ChainTest();
		try {
			ct.test2();
		}catch(RuntimeException r){
			r.printStackTrace();
			System.out.println("test2�������Զ�������ʱ�쳣ִ����");
		}
		
	}

}
