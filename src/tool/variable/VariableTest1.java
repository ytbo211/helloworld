package tool.variable;

public class VariableTest1 {
    // ���徲̬����score1
    static int score1 = 86;
    // ���徲̬����score2
	static int score2 = 92; 
	
	int score3=99;

    // ���徲̬����sum������ɼ��ܷ֣��������ܷ�
	public  static   int sum() { 
      return score1+score2;            
	}
	public     int sum1() { 
	      return score1+score2;            
		}  
	
	//����ͨ��Ա�����У������ֱ�ӷ���ͬ��ķǾ�̬�����;�̬����
	public void how() {
		System.out.println(score1);
		System.out.println(score3);
	}
	
/*	����������У����԰��������ʼ���飬���������ʵ��ʱ���ͻ�����ִ����Щ����顣���ʹ�� static ���γ�ʼ���飬�ͳ�Ϊ��̬��ʼ���顣
	��Ҫ�ر�ע�⣺��̬��ʼ����ֻ�������ʱִ�У���ֻ��ִ��һ�Σ�ͬʱ��̬��ʼ����ֻ�ܸ���̬������ֵ�����ܳ�ʼ����ͨ�ĳ�Ա������*/
	{
		int a=5;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		VariableTest1 VT1=new VariableTest1();
		
		//ֱ��ʹ���������þ�̬����
		int allScore = VariableTest1.sum();
		//ͨ��������þ�̬����
		int allScore1=VT1.sum();
		System.out.println("�ܷ֣�" + allScore);

		//��̬��������ֱ�ӵ��÷Ǿ�̬����������ͨ����������Ȼ����������ʷǾ�̬����
		//System.out.println("�ܷ֣�" + score3);

		System.out.println("�ܷ֣�" + VT1.score3);
		
		//��̬�����в���ֱ�ӵ��÷Ǿ�̬��������Ҫͨ�����������ʷǾ�̬����
		VT1.how();
		//��̬��������ֱ�ӵ��÷Ǿ�̬������Ҳ������Ҫͨ�����������ʷǾ�̬����
		sum();
		
	}

}
