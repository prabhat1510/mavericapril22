package dayone.defaultmethod;

public interface Display {
		//abstract method
		void display();
		//Default method
		default void displayInfo() {
			System.out.println("I am into display info which is a default method");
		}
		
		//static method
		public static void printMessage(String name) {
			System.out.println("Hello Good Mornign "+name+ " I am static method in an interface");
		}
}
