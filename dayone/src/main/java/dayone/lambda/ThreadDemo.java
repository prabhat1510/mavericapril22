package dayone.lambda;

public class ThreadDemo {

	public static void main(String[] args) {
	Thread thread = new Thread(new SimpleRunnable());
	thread.start();

	}

}
