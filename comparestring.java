package week3.day1.assignments;

public class comparestring {

	public void strcmp()
	{
		
				 String str3 = new String("Kutty");
						 String str4 = new String("Kutty");
						 
						 if(str3.equals(str4)) {//when giving equals it compare the exact strings
							 System.out.println(" Same text");
						 }
						 else
							 System.out.println("Diff text");
						 
						 System.out.println("***");
	}
	

	public void strcmp1()
	{
		
				 String str3 = new String("Kutty");
						 String str4 = new String("Kutty");
						 
						 if(str3==str4) { //when giving == it compares by memory location of strings
							 System.out.println(" Same text");
						 }
						 else
							 System.out.println("Diff text");
						 
						 System.out.println("***");
	}
	
	public static void main(String[] args) {
		
		comparestring cmp=new comparestring();
		cmp.strcmp1();
		cmp.strcmp();
	
		
	}

}
