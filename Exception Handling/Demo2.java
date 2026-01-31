class Demo2{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("Hello1");
		    System.out.println(10/0);
			System.out.println("Hello2");
			System.out.println("Hello3");
		}catch(ArithmeticException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUTD:\java\Exception-Handling>javac Demo2.java

// D:\java\Exception-Handling>java Demo2
// Execution Starts
// Hello1
// catch
// Execution Ends
