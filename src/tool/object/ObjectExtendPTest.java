package tool.object;

public class ObjectExtendPTest {

	public int id=10;
	public String name;
/*	private String address;
*/	
	public void dosomething() {
		System.out.println("TO DO SOMETHING!"+id+name);
	}
	
	public  ObjectExtendPTest() {
		System.out.println("父类无参构造方法执行");
		id=20;
	}
}
