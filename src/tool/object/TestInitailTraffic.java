package tool.object;

public class TestInitailTraffic {
	
	public static void main(String args[]) {
		//引用多态
		TestTraffic tb=new TestBus();
		TestTraffic ts=new TestShip();
		TestTraffic tp=new TestPlane();
		
		tb.setCapacity(40);
		tb.setTraffctWay("陆地");
		ts.setCapacity(200);
		ts.setTraffctWay("海上");
		tp.setCapacity(500);
		tp.setTraffctWay("天上");
		
		//方法多态
		System.out.println(tb);
		System.out.println(ts);
		System.out.println(tp);
		
		TestTraffic tt=tb;//自动类型提升，向上类型转换
		
		if(tt instanceof TestBus) {
			TestBus tb1=(TestBus)tt;//向下类型转换，强制类型转换
			System.out.println("tt是TestBus类型或者其子类型，可以进行类型转换");						
		}else {
			System.out.println("无法进行类型转换");			
		}
		if(tt instanceof TestShip) {
			TestShip ts1=(TestShip)tt;//1.编译时不会报错2.运行时会报错，因为tt开辟的内存空间为TestBus类型，转换成TestShip会报类型不匹配3.需要加上instancof判断一个引用是否是某个类型或者其子类
			System.out.println("tt是TestShip类型或者其子类型，可以进行类型转换");
		}else {
			System.out.println("无法进行类型转换");
		}
	}

}
