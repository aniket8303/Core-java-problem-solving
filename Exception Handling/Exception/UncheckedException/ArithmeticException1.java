//Types of RuntimeException
//1. ArithmeticException

class ArithmeticException1{
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

//OUTPUT
// D:\java\Exception-Handling>javac ArithmeticException1.java

// D:\java\Exception-Handling>java ArithmeticException1
// Hello
// Hello i am m1()
// Java
