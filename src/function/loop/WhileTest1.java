package function.loop;

public class WhileTest1 {

	public static void While() {
		  int x = 10;

	      while( x < 20 ) {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.println("");
	      }
	}

	public static void DoWhile() {
		  int x = 10;

		  do{
		         System.out.print("value of x : " + x );
		         x++;
		         System.out.println("");
		      }while( x < 20 );
	}
	public static void main(String args[]) {
		While();
		System.out.println("************·Ö½çÏß**************");
		DoWhile();
	   }
	}
