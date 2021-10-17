package week3.day1.assignments;

public class checkequals {

	
	public void equals1()
	{
		String charArray="I am Learning Java";
				String charArray2="I am learning java?";
				
				char[]  s1= charArray.toCharArray();
				char[]  s2= charArray2.toCharArray();
				String string = s1.toString();
				String string2 = s2.toString();
				
				if(string==string2)
				{
					System.out.println("== condition is checking");
					System.out.println("s1 value "+string+"s2 value "+string2);
				}
				else if(string.equals(string2))
				{
					System.out.println("equals condition is checking");
					System.out.println("s1 value "+string+"s2 value "+string2);
				}
				else if(string.equalsIgnoreCase(string2))
				{
					System.out.println("equals ignore case is checking");
					System.out.println("s1 value is "+charArray+"s value is "+charArray2);
				}
				else
				{
					System.out.println("Program is not executed");
				}
				
	}
	
	
	
	public static void main(String[] args) {
		checkequals check=new checkequals();
		check.equals1();

	}

}
