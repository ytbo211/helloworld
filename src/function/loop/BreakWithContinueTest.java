package function.loop;

public class BreakWithContinueTest {
       public static void Break() {
		      int [] numbers = {10, 20, 30, 40, 50};

		      for(int x : numbers ) {
		         if( x == 30 ) {
			      break;
		         }
		         System.out.print( x );
		         System.out.println("");
		      }    	   
       }
       
       public static void Continue() {
    	      int [] numbers = {10, 20, 30, 40, 50};

    	      for(int x : numbers ) {
    	         if( x == 30 ) {
    		      continue;
    	         }
    	         System.out.print( x );
    	         System.out.println("");
    	      }    	   
       }
	
	   public static void main(String args[]) {
		   	  Break();
			  System.out.println("************·Ö½çÏß**************");
			  Continue();
		   }
		
}
