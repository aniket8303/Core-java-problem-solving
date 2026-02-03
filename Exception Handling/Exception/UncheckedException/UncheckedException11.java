class UncheckedException11{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
			System.out.println(args[1]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		System.out.println("Ends");
	}
}

// //OUTPUT

// D:\java\Exception-Handling>javac UncheckedException11.java

// D:\java\Exception-Handling>java UncheckedException11
// Starts
// try
// ArithmeticException
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 0
//         at UncheckedException11.main(UncheckedException11.java:10)
