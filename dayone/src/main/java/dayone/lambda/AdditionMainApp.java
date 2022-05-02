package dayone.lambda;

public class AdditionMainApp {

	public static void main(String[] args) {
		 //implementation of an abstract method of an interface Addition
		Addition addition = (a,b) -> a+b;
		System.out.println(addition);
		int result = addition.add(15, 10);
		System.out.println(result);

	}

}
