package tool.object;

public class ObjectExtendInitailTest3 {

	public static void main(String args[]) {
		TestAbstract TA=new TestAbstractSon();
		TA.call();
		TA.sendmessage();
		
		//�ӿڵ�ʹ�ã��ӿڵ�����ָ��ʵ�ֽӿڵ���
		ITestInterface itt=new TestAbstractSon();
		itt.playgame();

		ITestInterface itt1=new ITestInterface() {
			@Override
			public void playgame() {
				System.out.println("ʹ�������ڲ��෽ʽʵ�ֽӿ�");
			}			
		};
		
		itt1.playgame();
		
		new ITestInterface() {
			@Override
			public void playgame() {
				System.out.println("ʹ�������ڲ��෽ʽʵ�ֽӿ�2");
			}			
		}.playgame();
		


	}


}
