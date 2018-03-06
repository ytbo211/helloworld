package function.loop;

public class ForTest1 {
	  public static void For() {
		  for(int x = 10; x < 20; x = x+1) {
		         System.out.print("value of x : " + x );
		         System.out.println("");
		      }
	  }
	  
	  public static void Foreach() {
		  int [] numbers = {10, 20, 30, 40, 50};
		  for(int x : numbers ){
		         System.out.print( x );
		         System.out.print(",");
		      }
		      System.out.println("");
		      String [] names ={"James", "Larry", "Tom", "Lacy"};
		      for( String name : names ) {
		         System.out.print( name );
		         System.out.print(",");
		      }
	  }

	  public static void main(String args[]) {
		  For();
		  System.out.println("************·Ö½çÏß**************");
		  Foreach();
	      
	   }
	}
