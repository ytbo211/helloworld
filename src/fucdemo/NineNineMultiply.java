package fucdemo;

public class NineNineMultiply {
    // ������ ��̬ �޷���ֵ main���� ����
    public static void main(String[] str) {
        /**
         * �žų˷���
         */
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
            System.out.print(j + "*" + i + " = " + j * i + "\t");            
            }
            System.out.println(" ");
        }
    }
}
