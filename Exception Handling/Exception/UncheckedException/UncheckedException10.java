class UncheckedException10{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
			System.out.println(args[1]);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBoundsException e");
		}
		System.out.println("Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException10.java
// D:\java\Exception-Handling>java UncheckedException10
// Starts
// try
// ArithmeticException
// Ends
