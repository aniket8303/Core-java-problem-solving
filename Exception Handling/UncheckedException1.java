//Types of RuntimeException
//1. ArithmeticException

class UncheckedException1{
	public static void main(String[] args) {
		System.out.println("Hello");
		m1();
		System.out.println("Java");
	}
	public static void m1() throws ArithmeticException
	{
		System.out.println("Hello i am m1()");
	}
}
