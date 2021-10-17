package week3.day1.assignments;

public class Students {

	public void getStudentInfo(int id)
	{
		System.out.println("Id is "+id);
	}
	
	public void getStudentInfo(int id,String Name)
	{
		System.out.println("Id is "+id);
		System.out.println("Name is "+Name);
	}
	
	public void getStudentInfo(String email,String ph)
	{
		System.out.println("Id is "+ph);
		System.out.println("Email is "+email);
	}
	
	
	public static void main(String[] args) {
		
		
		Students stud=new Students();
		stud.getStudentInfo(1);
		stud.getStudentInfo(10, "Sivaranjani");
		stud.getStudentInfo("sivaranjani1406@gmail.com", "9876789098");

	}

}
