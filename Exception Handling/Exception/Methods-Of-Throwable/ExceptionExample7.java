//5.public java.lang.StackTraceElement[] getStackTrace();

class ExceptionExample7{
	public static void main(String[] args) {
		System.out.println("main starts");
		m1();
		System.out.println("main ends");
	}
	public static void m1(){
		try{
			System.out.println("try");
			m2();
		}
		catch(Exception e){
			System.out.println("catch");
			StackTraceElement [] arr = e.getStackTrace();
			for(StackTraceElement ele : arr){
				System.out.println(ele);
			}
		}
	}
	public static void m2(){
		System.out.println("m2()");
		Example2.m3();
	}
}
class Example2{
	public static void m3(){
		System.out.println("m3()");
		m4();
	}
	public static void m4(){
		System.out.println("m4()");
		throw new ClassCastException("Something went wrong");
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample7.java

// D:\java\Exception-Handling>java ExceptionExample7
// main starts
// try
// m2()
// m3()
// m4()
// catch
// Example2.m4(ExceptionExample7.java:32)
// Example2.m3(ExceptionExample7.java:28)
// ExceptionExample7.m2(ExceptionExample7.java:22)
// ExceptionExample7.m1(ExceptionExample7.java:10)
// ExceptionExample7.main(ExceptionExample7.java:4)
// main ends
