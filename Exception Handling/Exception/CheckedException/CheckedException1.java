//CheckedException  
//1.Throwable

//first way of handling exception  i.e try-catch

// class CheckedException1{
// 	public static void main(String[] args) {
// 		System.out.println("Hello");
// 		try{
// 			m1();
// 		}catch(Throwable e){
// 			System.out.println("Exception handled");
// 		}
// 		System.out.println("Java");
// 	}
// 	public static void m1() throws Throwable{
//         System.out.println("Hello i am m1()");
// 	}
// }

//Second ways of handling exception i.e. using throws
class CheckedException1{
	public static void main(String[] args) throws Throwable {
		System.out.println("Hello");
		m1();
		System.out.println("Java");
	}
	public static void m1() throws Throwable{
        System.out.println("Hello i am m1()");
	}
}

// OUTPUT
// D:\java\Exception-Handling>javac CheckedException1.java

// D:\java\Exception-Handling>java CheckedException1
// Hello
// Hello i am m1()
// Java
