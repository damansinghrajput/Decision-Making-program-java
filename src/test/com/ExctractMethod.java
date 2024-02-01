package test.com;

public class ExctractMethod {

	public static void main(String[] args) {
		puzzle3();

	}

	private static void puzzle() {
		
		int number = 4;
		   switch(number) {
			   case 1: System.out.println(1);
			   break;
			   case 2: 
			  break;
			   case 3: System.out.println(3);
			   break;
			   default:  System.out.println("not number");
			   
		   }
	}

      private static void puzzle2() {
		
		int number = 10;
		   switch(number) {
			   case 1: System.out.println(1);
			   break;
			   case 2: System.out.println(2);
			   break;
			   case 3: System.out.println(3);
			   break;
			   default:  System.out.println("print default");
			   
		   }
      }
	
      private static void puzzle3() {
    	  int number = 10;
    	  int i = number * 2;
    	  switch (i) {
    	  case 20:System.out.println(1);
    	  break;
    	  default:  System.out.println("print default");
		   
    	  }
    	  
    	  
      }
}
