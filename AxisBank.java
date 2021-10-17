package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("Deposit method overridden");
	}

	public static void main(String[] args) {
		
		AxisBank obj=new AxisBank();
		obj.deposit();

	}

}
