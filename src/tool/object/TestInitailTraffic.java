package tool.object;

public class TestInitailTraffic {
	
	public static void main(String args[]) {
		//���ö�̬
		TestTraffic tb=new TestBus();
		TestTraffic ts=new TestShip();
		TestTraffic tp=new TestPlane();
		
		tb.setCapacity(40);
		tb.setTraffctWay("½��");
		ts.setCapacity(200);
		ts.setTraffctWay("����");
		tp.setCapacity(500);
		tp.setTraffctWay("����");
		
		//������̬
		System.out.println(tb);
		System.out.println(ts);
		System.out.println(tp);
		
		TestTraffic tt=tb;//�Զ�������������������ת��
		
		if(tt instanceof TestBus) {
			TestBus tb1=(TestBus)tt;//��������ת����ǿ������ת��
			System.out.println("tt��TestBus���ͻ����������ͣ����Խ�������ת��");						
		}else {
			System.out.println("�޷���������ת��");			
		}
		if(tt instanceof TestShip) {
			TestShip ts1=(TestShip)tt;//1.����ʱ���ᱨ��2.����ʱ�ᱨ����Ϊtt���ٵ��ڴ�ռ�ΪTestBus���ͣ�ת����TestShip�ᱨ���Ͳ�ƥ��3.��Ҫ����instancof�ж�һ�������Ƿ���ĳ�����ͻ���������
			System.out.println("tt��TestShip���ͻ����������ͣ����Խ�������ת��");
		}else {
			System.out.println("�޷���������ת��");
		}
	}

}
