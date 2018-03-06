package function.func;

import java.util.Arrays;

public class FuncTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FuncTest1 Ft=new FuncTest1();
		Ft.showMyLove();
		Ft.calcAvg();
		Ft.calcAvg(1,2);
		

	}

	/*
	 * 定义无参无返回值的方法
	 */
	public void showMyLove() {
		System.out.println("我爱慕课网!");
	}
	
	 /*定义无参带返回值的方法*/
	public double calcAvg() {
        
		double java = 92.5;
		double php = 83.0;
		double avg = (java + php) / 2; // 计算平均值
        
		// 使用return返回值
        return avg;
        
	}	
	/*
	 * 
	 * 定义有参数无返回值的方法
	 */
    public void calcAvg(int a,int b){
        double sum=a+b;
    	double avg=sum/2;
    	System.out.println("平均分为："+avg);
    }	
	/*
	 * 
	 * 定义有参数有返回值的方法
	 */
	public int sort( int[] scores ){
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores));
		
        //返回数组中元素的个数
        return scores.length;
	}
	
	
	/*方法重构*/
	public void print() {
		System.out.println("无参的print方法");
	}

	public void print(String name) {
		System.out.println("带有一个字符串参数的print方法，参数值为：" + name);
	}

	public void print(int age) {
		System.out.println("带有一个整型参数的print方法，参数值为：" + age);
	}	
	
}
