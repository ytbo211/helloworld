package tool.object;

public class ObjectExtendInitailTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//��ʼ��˳�򣺸����ȳ�ʼ����Ȼ���������ʼ�������Եĳ�ʼ����ִ�У����췽���ĳ�ʼ����ִ��
		ObjectExtendSTest1 OEST1=new ObjectExtendSTest1();
		ObjectExtendSTest1 OEST2=new ObjectExtendSTest1();
		
		ObjectExtendPTest OESP=new ObjectExtendPTest();
		System.out.println("id="+OESP.id);
		
		OEST1.id=1;
		OEST1.name="ceshi";
		OEST2.id=1;
		OEST2.name="ceshi";		
		//���ܼ̳�private���εĳ�Ա����
		//OEST1.address="cceshi";
		OEST1.dosomething();
		OESP.dosomething();
		
		OEST1.suibian();
		System.out.println(OEST1);
		
		//equals���Ժ�==�ȼ�ʹ��
		if(OEST1.equals(OEST2)) {
			System.out.println("����������ͬһ������");
		}else {
			System.out.println("����������ͬһ������");
		}
		
		EqualsTest2 et2=new EqualsTest2();
		et2.id=1;
		et2.name="123";
		EqualsTest2 et1=new EqualsTest2();
		et1.id=1;
		et1.name="123";
		
		EqualsTest2 et3=(EqualsTest2)et2;
		
		if (et1.name == null) 
			System.out.println("null");
			if (et3.name != null)
				System.out.println("right");

		
		if(et1.equals(et2)) {
			System.out.println("et1==et2");
		}else {
			System.out.println("et1<>et2");
		}
		
		
	}

}
