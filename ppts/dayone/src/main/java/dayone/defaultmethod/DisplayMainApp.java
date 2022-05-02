package dayone.defaultmethod;

public class DisplayMainApp {

	public static void main(String[] args) {
			//Creating an object
			Display displayImpl = new DisplayImpl(); 
			//call the abstract method
			displayImpl.display();
			
			//Calling default method
			displayImpl.displayInfo();
			
			//Calling static method
			Display.printMessage("Pavan");
			
	}

}
