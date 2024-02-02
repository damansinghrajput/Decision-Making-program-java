package test.com;
   // You are tasked with implementing the functionality of a Student class which calculates and assigns 
 //   the student's grade based on the provided marks.
public class GardeStudent {
	                                          
	 int marks;
	
	 GardeStudent(int marks) {
		this.marks= marks;
		
	}

	 public char assignGrade() {
	        if(marks<0 || marks>100){
	           return 'X' ;}
	        else if (marks>=90){
	             return 'A';}
	        else if (marks>=80){
	             return 'B';}
	        else if (marks>=70){
	             return 'C';}    
	         else if (marks>=60){
	             return 'D';}
	          else if (marks>=50){
	             return 'E';}  
	             else if (marks<50){
	             return 'F';
	             }
	        return 'D';
	 }
	 
	 
	 
	public static void main(String[] args) {
		GardeStudent stud  = new GardeStudent(49);
        System.out.println(stud.assignGrade());  
	}

}
