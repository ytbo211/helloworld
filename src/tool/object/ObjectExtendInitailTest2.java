package tool.object;

public class ObjectExtendInitailTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		//引用多态
		//父类的引用指向本类的对象
		ObjectExtendPTest p=new ObjectExtendPTest();
		//父类的引用指向子类的对象
		ObjectExtendPTest s=new ObjectExtendSTest1();
		//子类的引用不能指向父类的对象
		//ObjectExtendSTest1 s1=new ObjectExtendPTest();
		
		
		//方法多态
		//创建本类对象时，调用的是本类为本类的方法
		p.dosomething();
		//创建子类对象时，调用的是子类为子类重写的方法或者继承的方法
		s.dosomething();
		//父类的引用指向子类的对象时，不能调用子类独有的方法
		//s.haochi();
		
	}

}
