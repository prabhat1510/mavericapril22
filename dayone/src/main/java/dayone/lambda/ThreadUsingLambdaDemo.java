package dayone.lambda;

public class ThreadUsingLambdaDemo {

	public static void main(String[] args) {
		new Thread(
					//Left hand side you have empty paranthesis then arrow then on RHS expression to be evaluated
					()->{ System.out.println("I am new thread using lambda");}
		
				).start();
	}

}
