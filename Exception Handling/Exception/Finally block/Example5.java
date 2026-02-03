class Example5{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("try");
			System.out.println(1/0);
		}
		catch(ArithmeticException e){
			System.out.println("catch");
			return ;
		}
		finally{
			System.out.println("finally");
		}
		System.out.println("ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Example5.java

// D:\java\Exception-Handling>java Example5
// Starts
// try
// catch
// finally
