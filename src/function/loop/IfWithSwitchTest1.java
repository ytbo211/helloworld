package function.loop;

public class IfWithSwitchTest1 {

	public static void If() {
		int day = 3;

        // 判断
        if (day == 1) {
            System.out.println("今天星期一");
        } else if (day == 2) {
            System.out.println("今天星期二");
        } else if (day == 3) {
            System.out.println("今天星期三");
        } else if (day == 4) {
            System.out.println("今天星期四");
        } else if (day == 5) {
            System.out.println("今天星期五");
        } else if (day == 6) {
            System.out.println("今天星期六");
        } else if (day == 7) {
            System.out.println("今天星期七");
        } else {
            System.out.println("不是1-7范围内的数字");
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
        // 最终执行
        default:
            System.out.println("都不是");
            break;
        }
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	   	  If();
		  System.out.println("************分界线**************");
		  Switch();
	}

}
