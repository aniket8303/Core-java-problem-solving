class Demo1{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("Hello1");
			System.out.println("Hello2");
			System.out.println("Hello3");
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT\
// D:\java\Exception-Handling>javac Demo1.java

// D:\java\Exception-Handling>java Demo1
// Execution Starts
// Hello1
// Hello2
// Hello3
// catch
// Execution Ends
