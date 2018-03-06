package fucdemo;

import java.math.*;
import java.util.*;

public class GeometricPrintLoopTest1 {

	public static void IsoscelesTriangle() {
		//��������
		int i;
		int j;
		int z;
		for(i=0;i<5;i++) {
			for(j=i+1;j<5;j++) {
				System.out.print(" ");				
			}
		for(z=0;z<=i;z++) {
				System.out.print("* ");
			}
		System.out.println();
		}		
	}
	
	public static void Rectangle() {
		int i;
		int j;
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				System.out.print("* ");				
			}
		System.out.println("");	
		}
	}
	
	public static void RightTriangle() {
		int i;
		int j;
		for(i=0;i<5;i++) {
			for(j=0;j<=i;j++) {
				System.out.print("* ");				
			}
		System.out.println("");	
		}
	}	

	public static void Rhombus(int size) {
		
        if (size % 2 == 0) {
            size++; // �������δ�С
        }
        //System.out.println(size / 2);
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // ������Ͻ�λ�õĿհ�
            }
            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*"); // ��������ϰ벿��Ե

            }
            System.out.println(); // ����
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // ����������½ǿհ�
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {

                System.out.print("*"); // ��������°벿��Ե

            }
            System.out.println(); // ����
        }
    }

	public static void Parallelogram(int length,int heighth) {
		for(int i=0;i<heighth;i++) {
			for(int k=0;k<=i-1;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<length;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

    }

/*	public static void Trapezoid(int uplength,int downlength) {
		Random ran1 = new Random((downlength-uplength)+uplength);
		int a=ran1.nextInt((downlength-uplength)+uplength);		
		
		if(uplength<downlength) {
		for(int i=0;i<downlength-uplength;i++) {
			
			for(int k=0;k<=a;k++) {
				for(int m=a;m>0;a--) {
				System.out.print(" ");
				}
			}
			for(int j=0;j<uplength;j++) {
				for(int n=uplength;n<downlength;uplength++)
				System.out.print("*");
			}
			System.out.println("");
		  }
		}else {
			System.out.println("�ϵױ߳���ҪС���µױ߳�");
		}
    }*/
		
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		IsoscelesTriangle();
		System.out.println("**********�ֽ���*********");
		Rectangle();
		System.out.println("**********�ֽ���*********");
		RightTriangle();
		System.out.println("**********�ֽ���*********");
		Rhombus(7);
		System.out.println("**********�ֽ���*********");	
		Parallelogram(7,5);
		System.out.println("**********�ֽ���*********");	
		
		
	}

}
