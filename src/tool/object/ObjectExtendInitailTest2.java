package tool.object;

public class ObjectExtendInitailTest2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
		//���ö�̬
		//���������ָ����Ķ���
		ObjectExtendPTest p=new ObjectExtendPTest();
		//���������ָ������Ķ���
		ObjectExtendPTest s=new ObjectExtendSTest1();
		//��������ò���ָ����Ķ���
		//ObjectExtendSTest1 s1=new ObjectExtendPTest();
		
		
		//������̬
		//�����������ʱ�����õ��Ǳ���Ϊ����ķ���
		p.dosomething();
		//�����������ʱ�����õ�������Ϊ������д�ķ������߼̳еķ���
		s.dosomething();
		//���������ָ������Ķ���ʱ�����ܵ���������еķ���
		//s.haochi();
		
	}

}
