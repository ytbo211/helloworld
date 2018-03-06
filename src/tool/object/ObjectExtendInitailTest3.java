package tool.object;

public class ObjectExtendInitailTest3 {

	public static void main(String args[]) {
		TestAbstract TA=new TestAbstractSon();
		TA.call();
		TA.sendmessage();
		
		//接口的使用：接口的引用指向实现接口的类
		ITestInterface itt=new TestAbstractSon();
		itt.playgame();

		ITestInterface itt1=new ITestInterface() {
			@Override
			public void playgame() {
				System.out.println("使用匿名内部类方式实现接口");
			}			
		};
		
		itt1.playgame();
		
		new ITestInterface() {
			@Override
			public void playgame() {
				System.out.println("使用匿名内部类方式实现接口2");
			}			
		}.playgame();
		


	}


}
