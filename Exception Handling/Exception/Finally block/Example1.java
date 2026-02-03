class Example1{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
		}
		catch(ArithmeticException e){
			System.out.println("catch");
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("ends");
	}
}
//OUTPUT
// D:\java\Exception-Handling>javac Example1.java

// D:\java\Exception-Handling>java Example1
// Starts
// try
// finally
// ends
