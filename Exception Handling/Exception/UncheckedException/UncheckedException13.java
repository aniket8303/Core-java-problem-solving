class UncheckedException13{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
			try{
			   System.out.println("inner try");
			   String str = null;
			   System.out.println(str.charAt(0));
            }
            catch(ClassCastException e){
            	System.out.println("Inner catch");
           }
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
		}
		System.out.println("Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException13.java

// D:\java\Exception-Handling>java UncheckedException13
// Starts
// try
// ArithmeticException
// inner try
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "<local2>" is null
//         at UncheckedException13.main(UncheckedException13.java:13)
