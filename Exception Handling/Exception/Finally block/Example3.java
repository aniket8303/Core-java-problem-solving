class Example3{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(10%0);
		}
		catch(NullPointerException e){
			System.out.println("catch");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Example3.java

// D:\java\Exception-Handling>java Example3
// Starts
// try
// finally
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Example1.main(Example1.java:39)
