package function.func;

import java.util.Arrays;

public class FuncTest1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		FuncTest1 Ft=new FuncTest1();
		Ft.showMyLove();
		Ft.calcAvg();
		Ft.calcAvg(1,2);
		

	}

	/*
	 * �����޲��޷���ֵ�ķ���
	 */
	public void showMyLove() {
		System.out.println("�Ұ�Ľ����!");
	}
	
	 /*�����޲δ�����ֵ�ķ���*/
	public double calcAvg() {
        
		double java = 92.5;
		double php = 83.0;
		double avg = (java + php) / 2; // ����ƽ��ֵ
        
		// ʹ��return����ֵ
        return avg;
        
	}	
	/*
	 * 
	 * �����в����޷���ֵ�ķ���
	 */
    public void calcAvg(int a,int b){
        double sum=a+b;
    	double avg=sum/2;
    	System.out.println("ƽ����Ϊ��"+avg);
    }	
	/*
	 * 
	 * �����в����з���ֵ�ķ���
	 */
	public int sort( int[] scores ){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
        //����������Ԫ�صĸ���
        return scores.length;
	}
	
	
	/*�����ع�*/
	public void print() {
		System.out.println("�޲ε�print����");
	}

	public void print(String name) {
		System.out.println("����һ���ַ���������print����������ֵΪ��" + name);
	}

	public void print(int age) {
		System.out.println("����һ�����Ͳ�����print����������ֵΪ��" + age);
	}	
	
}
