package tool.object;

public class ObjectClass {
	//private���η�����װ��Ա����
	private int 	 objectid;
	private String objectname;
	
	//set/get����
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
		System.out.println("�޲ι��췽��");
	}

	public void ObjectClass(int objectid) {
		System.out.println(objectid);
	}
	
}
