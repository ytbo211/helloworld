package function.loop;

public class IfWithSwitchTest1 {

	public static void If() {
		int day = 3;

        // �ж�
        if (day == 1) {
            System.out.println("��������һ");
        } else if (day == 2) {
            System.out.println("�������ڶ�");
        } else if (day == 3) {
            System.out.println("����������");
        } else if (day == 4) {
            System.out.println("����������");
        } else if (day == 5) {
            System.out.println("����������");
        } else if (day == 6) {
            System.out.println("����������");
        } else if (day == 7) {
            System.out.println("����������");
        } else {
            System.out.println("����1-7��Χ�ڵ�����");
        }		
	}
	
	public static void Switch() {
		int a = 3;

        switch (a) {
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4:
            System.out.println("4");
            break;
        case 5:
            System.out.println("5");
            break;
        // ����ִ��
        default:
            System.out.println("������");
            break;
        }
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
	   	  If();
		  System.out.println("************�ֽ���**************");
		  Switch();
	}

}
