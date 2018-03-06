package tool.object;

public class ObjectExtendInitailTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//初始化顺序：父类先初始化，然后是子类初始化。属性的初始化先执行，构造方法的初始化后执行
		ObjectExtendSTest1 OEST1=new ObjectExtendSTest1();
		ObjectExtendSTest1 OEST2=new ObjectExtendSTest1();
		
		ObjectExtendPTest OESP=new ObjectExtendPTest();
		System.out.println("id="+OESP.id);
		
		OEST1.id=1;
		OEST1.name="ceshi";
		OEST2.id=1;
		OEST2.name="ceshi";		
		//不能继承private修饰的成员变量
		//OEST1.address="cceshi";
		OEST1.dosomething();
		OESP.dosomething();
		
		OEST1.suibian();
		System.out.println(OEST1);
		
		//equals可以和==等价使用
		if(OEST1.equals(OEST2)) {
			System.out.println("两个对象是同一个对象");
		}else {
			System.out.println("两个对象不是同一个对象");
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
