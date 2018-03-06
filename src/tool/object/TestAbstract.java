package tool.object;

public abstract class TestAbstract {
	//抽象类约束子类有哪些方法，不关心子类怎么实现
	//abstract定义抽象类
	//abstract定义抽象方法，只有声明，不需要实现
	//包含抽象方法的类是抽象类
	//抽象类可以包含普通的方法，也可以不包含抽象方法
	//抽象类不能直接创建，可以定义引用变量指向一个子类对象
	public abstract void call();
	
	public abstract void sendmessage();
		
	
}
