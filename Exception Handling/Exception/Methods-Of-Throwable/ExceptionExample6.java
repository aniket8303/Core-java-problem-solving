//4. public synchronized java.lang.Throwable getCause();

class ExceptionExample6{
	public static void main(String[] args) {
		System.out.println("Starts");
		try{
			System.out.println("main try");
			m1();
		}
		catch(Throwable exc){
			System.out.println("main catch");
			System.out.println(exc.getCause());
		}
		System.out.print("ends");
	}
	public static void m1() throws Exception, Throwable{
		try{
			System.out.println("try m1()");
			m2();
		}
		catch(Exception exc){
			System.out.println("catch m1()");
			System.out.println(exc.getCause());
			throw new Throwable("something",exc);
		}
	}
	public static void m2() throws Exception{
		try{
			System.out.println("try m2()");
			int a = 10/0;
		}
		catch(ArithmeticException ae){
			System.out.println("catch m2()");
			throw new Exception("kuchtoh",ae);
		}
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample6.java

// D:\java\Exception-Handling>java ExceptionExample6
// Starts
// main try
// try m1()
// try m2()
// catch m2()
// catch m1()
// java.lang.ArithmeticException: / by zero
// main catch
// java.lang.Exception: kuchtoh
// ends
