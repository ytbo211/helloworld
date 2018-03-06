package tool.object;

public class ObjectInnerTest1 {

    // �ⲿ���еľ�̬����score
    private static int score = 84;
    //�ⲿ���˽������name
    private String name = "imooc";    
    //�ⲿ��ĳ�Ա����
    int age = 20;
    
/*	���ڲ������Ҫ�������£�

	1. �ڲ����ṩ�˸��õķ�װ�����԰��ڲ����������ⲿ��֮�ڣ�������ͬһ�����е���������ʸ���

	2. �ڲ���ķ�������ֱ�ӷ����ⲿ����������ݣ�����˽�е�����

	3. �ڲ�����ʵ�ֵĹ���ʹ���ⲿ��ͬ������ʵ�֣�ֻ����ʱʹ���ڲ��������
*/
	
    // �ڲ���Inner����Inner����HelloWorld���ڲ�
    public class Inner {
        
		// �ڲ���ķ���
		public void show() {
			System.out.println("welcome to imooc!");
		}
	}


/*    1�� Inner �ඨ���� Outer ����ڲ����൱�� Outer ���һ����Ա������λ�ã�Inner �����ʹ��������ʿ��Ʒ����� public �� protected �� private ��

    2�� Inner ���ж���� test() ��������ֱ�ӷ��� Outer ���е����ݣ������ܷ��ʿ��Ʒ���Ӱ�죬��ֱ�ӷ��� Outer ���е�˽������a

    3�� �����˳�Ա�ڲ���󣬱���ʹ���ⲿ������������ڲ�����󣬶�����ֱ��ȥ new һ���ڲ�����󣬼����ڲ��� ������ = �ⲿ�����.new �ڲ���( );

    4�� ��������ĳ���󣬻ᷢ�ֲ��������� .class �ļ�
	
*/	
    //��Ա�ڲ���Inner
    public class Inner1 {
		String name = "��Ľ��";
        //�ڲ����еķ���
		public void show() { 
			System.out.println("�ⲿ���е�name��" +ObjectInnerTest1.this.name                  );
			System.out.println("�ڲ����е�name��" +name                  );
			System.out.println("�ⲿ���е�age��" + age);
		}
	}
    
/*    1�� ��̬�ڲ��಻��ֱ�ӷ����ⲿ��ķǾ�̬��Ա��������ͨ�� new �ⲿ��().��Ա �ķ�ʽ���� 

    2�� ����ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա������ͬ����ͨ��������.��̬��Ա�������ⲿ��ľ�̬��Ա������ⲿ��ľ�̬��Ա���ڲ���ĳ�Ա���Ʋ���ͬ�����ͨ������Ա����ֱ�ӵ����ⲿ��ľ�̬��Ա

    3�� ������̬�ڲ���Ķ���ʱ������Ҫ�ⲿ��Ķ��󣬿���ֱ�Ӵ��� �ڲ��� ������= new �ڲ���();    
*/
    // ������̬�ڲ���
	public  static class SInner {
        // �ڲ����еı���score
        int score = 91;
        
		public void show() {
			System.out.println("�����ⲿ���е�score��" +ObjectInnerTest1.score            );
			System.out.println("�����ڲ����е�score��" + score);
		}
	}    
	
	
    // �ⲿ���е�show����
    public void show1() { 
		// ���巽���ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// ���������ڲ���Ķ���
        MInner mi=new MInner();
        
        // �����ڲ���ķ���
		mi.getScore();
        
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + mi.getScore());	
    }
    
	public static void main(String[] args) {
        
        // �����ⲿ�����
		ObjectInnerTest1 OIT1 = new ObjectInnerTest1();
        // �����ڲ������
		Inner i = OIT1.new Inner();
        // �����ڲ������ķ���
		i.show();
		
	    //�����ڲ���Ķ���
		Inner1 inn1 =OIT1.new Inner1();
	        
	    //�����ڲ�������show����
		inn1.show();	
		
		// �����ⲿ��ķ���
		OIT1.show1();
	}
}
