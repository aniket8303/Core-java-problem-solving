class Example4{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			return ;
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
// D:\java\Exception-Handling>javac Example4.java

// D:\java\Exception-Handling>java Example4
// Starts
// try
// finally
