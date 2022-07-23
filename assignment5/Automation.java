package week3.day1.assignment5;

public class Automation extends MultipleLangauge implements Language, TestTool  {

	public void Java() {
		System.out.println("The language is Java");
		
	}

	public void Selenium() {
		System.out.println("The automation tool is selenium");
		
	}
			
	@Override
	public void ruby() {
		System.out.println("The language is ruby");
		
	}
	
	public static void main(String[] args) {
		Automation myAutomation= new Automation();
		myAutomation.Java();
		myAutomation.Selenium();
		myAutomation.python();
		myAutomation.ruby();
		
	}
	

}
