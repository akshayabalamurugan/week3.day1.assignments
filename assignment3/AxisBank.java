package week3.day1.assignment3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("The deposit should be restricted for the Axis bank customer");
	}
	
	public static void main(String[] args) {
		AxisBank myBank= new AxisBank();
		myBank.saving();
		myBank.fixed();
		myBank.deposit();
		
	}

}
