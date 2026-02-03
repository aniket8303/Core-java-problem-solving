class Example6{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(1/0);
		}
		catch(ArithmeticException e){
			System.out.println("catch");
			try{
				System.out.println("inner try");
				System.out.println(args[0]);
			}catch(NullPointerException ne){
				System.out.println("inner catch");
			}
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Outer catch 2");
		}
		finally{
			System.out.println("outer finally");
		}
		System.out.println("ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Example6.java

// D:\java\Exception-Handling>java Example6
// Starts
// try
// catch
// inner try
// outer finally
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at Example6.main(Example6.java:12)
