class Demo6{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
		    Thread.sleep(2200);
		}catch(ArithmeticException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
//C.T.E
// D:\java\Exception-Handling>javac Demo6.java
// Demo6.java:6: error: unreported exception InterruptedException; must be caught or declared to be thrown
//                     Thread.sleep(2200);
//                                 ^
// 1 error

