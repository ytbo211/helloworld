package tool.object;

public class ObjectExtendSTest1 extends ObjectExtendPTest {
	//���෽������д
	//����ֵ���ͣ����������������ͼ�����
	public int id=10;
	public String name;	
	
	public void haochi() {
		System.out.println("delicious");
	}
	
	public void dosomething() {
		System.out.println("BETTER THAN NEVER!"+id+" "+name);
	}
	public  ObjectExtendSTest1() {
		System.out.println("�����޲ι��췽��ִ��");
	}
	
	public void suibian() {
		System.out.println(super.id);
		super.dosomething();
		
	}
	@Override
	public String toString() {
		return "ObjectExtendSTest1 [id=" + id + ", name=" + name + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectExtendSTest1 other = (ObjectExtendSTest1) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
