package dayone.functionalinterface;

public class PrintInformationMainApp {

	public static void main(String[] args) {
		PrintInformationImpl pil = new PrintInformationImpl();
		pil.printMessage("I am functional interface"); // calling the abstract method
		
		//Writing implementation of an abstract method using lambda expression
		PrintInformation printInfo = message->System.out.println(message);
		printInfo.printMessage("I am using lambda expression to show you how to implement an abstract method of an Interface");
		
		PrintInformation.printInformation();
		printInfo.printInfo();
	
	}

}
