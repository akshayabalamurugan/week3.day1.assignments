package week3.day1.assignment4;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("The Student id is "+ id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student id and name is " +id+ " and "+ name);
	}
	public void getStudentInfo(int id, String email, String phoneNumber) {
		System.out.println("The Student id, emailId and Phonenumber is "+ id+" and "+ email+" and "+ phoneNumber );
	}
	
	public static void main(String[] args) {
		Students myStudent= new Students();
		myStudent.getStudentInfo(563242);
		myStudent.getStudentInfo(563242, "Akshaya Balamurugan");
		myStudent.getStudentInfo(563242, "akshayabalamurugan12@gmail.com", "9500194552");
	}
	
}
