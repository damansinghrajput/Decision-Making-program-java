package test.com;

public class IfElseLadder {

	public static void main(String[] args) {
           int i =25;
		
		
		if(i==25) {
			System.out.println("i==25 outer if ");
		}
		else if (i==27) {
			System.out.println("i==27 inner if else ");
		}
		
		else if (i==26) {
			System.out.println("i==26");
		}
		else  {
			System.out.println("not equals");
		}
	}

}