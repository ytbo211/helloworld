package tool.variable;

public class VariableTest1 {
    // 定义静态变量score1
    static int score1 = 86;
    // 定义静态变量score2
	static int score2 = 92; 
	
	int score3=99;

    // 定义静态方法sum，计算成绩总分，并返回总分
	public  static   int sum() { 
      return score1+score2;            
	}
	public     int sum1() { 
	      return score1+score2;            
		}  
	
	//在普通成员方法中，则可以直接访问同类的非静态变量和静态变量
	public void how() {
		System.out.println(score1);
		System.out.println(score3);
	}
	
/*	在类的声明中，可以包含多个初始化块，当创建类的实例时，就会依次执行这些代码块。如果使用 static 修饰初始化块，就称为静态初始化块。
	需要特别注意：静态初始化块只在类加载时执行，且只会执行一次，同时静态初始化块只能给静态变量赋值，不能初始化普通的成员变量。*/
	{
		int a=5;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		VariableTest1 VT1=new VariableTest1();
		
		//直接使用类名调用静态方法
		int allScore = VariableTest1.sum();
		//通过对象调用静态方法
		int allScore1=VT1.sum();
		System.out.println("总分：" + allScore);

		//静态方法不能直接调用非静态变量，可以通过创建对象，然后对象来访问非静态变量
		//System.out.println("总分：" + score3);

		System.out.println("总分：" + VT1.score3);
		
		//静态方法中不能直接调用非静态方法，需要通过对象来访问非静态方法
		VT1.how();
		//静态方法可以直接调用非静态方法，也可以需要通过对象来访问非静态方法
		sum();
		
	}

}
