class ExceptionExample3{
	public static void main(String[] args) {
		try{
			System.out.println("try");
			int a = 10/0;
		}
		catch(ArithmeticException i){
			System.out.println(i.toString());
			System.out.println(i);
		}
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample3.java

// D:\java\Exception-Handling>java ExceptionExample3
// try
// java.lang.ArithmeticException: / by zero
// java.lang.ArithmeticException: / by zero
