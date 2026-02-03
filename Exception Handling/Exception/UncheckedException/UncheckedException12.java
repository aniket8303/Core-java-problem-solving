class UncheckedException12{
	public static void main(String[] args) {
		System.out.println("Starts");
		
		try{
          System.out.println("try");
	      try{
			System.out.println("inner try");
			String str = null;
			System.out.println(str.charAt(0));
          }
          catch(ClassCastException e){
          	System.out.println("Inner catch");
          }
		}
		catch(ArithmeticException ae){
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException");
		}
		System.out.println("Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException12.java

// D:\java\Exception-Handling>java UncheckedException12
// Starts
// try
// inner try
// NullPointerException
// Ends
