class Demo6{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
		    thread.sleep(2200);
		}catch(ArithmeticException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
//C.T.E
// D:\java\Exception-Handling>javac Demo6.java
// Demo6.java:6: error: cannot find symbol
//                     thread.sleep(2200);
//                     ^
//   symbol:   variable thread
//   location: class Demo6
// 1 error
