class Example2{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(10%0);
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
// D:\java\Exception-Handling>javac Example2.java

// D:\java\Exception-Handling>java Example2
// Starts
// try
// catch
// finally
// ends
