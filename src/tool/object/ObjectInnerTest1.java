package tool.object;

public class ObjectInnerTest1 {

    // 外部类中的静态变量score
    private static int score = 84;
    //外部类的私有属性name
    private String name = "imooc";    
    //外部类的成员属性
    int age = 20;
    
/*	答：内部类的主要作用如下：

	1. 内部类提供了更好的封装，可以把内部类隐藏在外部类之内，不允许同一个包中的其他类访问该类

	2. 内部类的方法可以直接访问外部类的所有数据，包括私有的数据

	3. 内部类所实现的功能使用外部类同样可以实现，只是有时使用内部类更方便
*/
	
    // 内部类Inner，类Inner在类HelloWorld的内部
    public class Inner {
        
		// 内部类的方法
		public void show() {
			System.out.println("welcome to imooc!");
		}
	}


/*    1、 Inner 类定义在 Outer 类的内部，相当于 Outer 类的一个成员变量的位置，Inner 类可以使用任意访问控制符，如 public 、 protected 、 private 等

    2、 Inner 类中定义的 test() 方法可以直接访问 Outer 类中的数据，而不受访问控制符的影响，如直接访问 Outer 类中的私有属性a

    3、 定义了成员内部类后，必须使用外部类对象来创建内部类对象，而不能直接去 new 一个内部类对象，即：内部类 对象名 = 外部类对象.new 内部类( );

    4、 编译上面的程序后，会发现产生了两个 .class 文件
	
*/	
    //成员内部类Inner
    public class Inner1 {
		String name = "爱慕课";
        //内部类中的方法
		public void show() { 
			System.out.println("外部类中的name：" +ObjectInnerTest1.this.name                  );
			System.out.println("内部类中的name：" +name                  );
			System.out.println("外部类中的age：" + age);
		}
	}
    
/*    1、 静态内部类不能直接访问外部类的非静态成员，但可以通过 new 外部类().成员 的方式访问 

    2、 如果外部类的静态成员与内部类的成员名称相同，可通过“类名.静态成员”访问外部类的静态成员；如果外部类的静态成员与内部类的成员名称不相同，则可通过“成员名”直接调用外部类的静态成员

    3、 创建静态内部类的对象时，不需要外部类的对象，可以直接创建 内部类 对象名= new 内部类();    
*/
    // 创建静态内部类
	public  static class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" +ObjectInnerTest1.score            );
			System.out.println("访问内部类中的score：" + score);
		}
	}    
	
	
    // 外部类中的show方法
    public void show1() { 
		// 定义方法内部类
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// 创建方法内部类的对象
        MInner mi=new MInner();
        
        // 调用内部类的方法
		mi.getScore();
        
		System.out.println("姓名：" + name + "\n加分后的成绩：" + mi.getScore());	
    }
    
	public static void main(String[] args) {
        
        // 创建外部类对象
		ObjectInnerTest1 OIT1 = new ObjectInnerTest1();
        // 创建内部类对象
		Inner i = OIT1.new Inner();
        // 调用内部类对象的方法
		i.show();
		
	    //创建内部类的对象
		Inner1 inn1 =OIT1.new Inner1();
	        
	    //调用内部类对象的show方法
		inn1.show();	
		
		// 调用外部类的方法
		OIT1.show1();
	}
}
