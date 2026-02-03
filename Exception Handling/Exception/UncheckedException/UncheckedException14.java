class UncheckedException14{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("Outer try");
			try{
			   System.out.println("inner try");
			   System.out.println(10/0);
            }
            catch(Exception e){
            	System.out.println("Inner catch");
            	System.out.println(args[0]);
           }		}
		catch(Throwable e){
			System.out.println("Outer catch");
		}
		
		System.out.println("Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException14.java

// D:\java\Exception-Handling>java UncheckedException14
// Starts
// Outer try
// inner try
// Inner catch
// Outer catch
// Ends
