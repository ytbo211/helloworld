package tool.object;

public class ObjectClass {
	//private修饰符，封装成员变量
	private int 	 objectid;
	private String objectname;
	
	//set/get方法
	public int getObjectid() {
		return objectid;
	}
	public void setObjectid(int objectid) {
		this.objectid = objectid;
	}
	public String getObjectname() {
		return objectname;
	}
	public void setObjectname(String objectname) {
		this.objectname = objectname;
	}
	
	
	public void ObjectClass() {
		System.out.println("无参构造方法");
	}

	public void ObjectClass(int objectid) {
		System.out.println(objectid);
	}
	
}
