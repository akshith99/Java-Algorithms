package algorithms.recursion;

public class CallStack {

	private static void methodThree() {
		System.out.println("Three");
	}
	
	private static void methodTwo() {
		methodThree();
		System.out.println("Two");
	}
	
	public static void methodOne() {
		methodTwo();
		System.out.println("One");
	}
	
	public static void main(String[] args) {
		methodOne();
	}

}
