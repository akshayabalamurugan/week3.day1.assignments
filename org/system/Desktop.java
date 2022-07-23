package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("The destop size is returned");
	}
	
	
public static void main(String[] args) {
	Desktop myDesktop= new Desktop();
	myDesktop.desktopSize();
	myDesktop.computerModel();
			
}
}
