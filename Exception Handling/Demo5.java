class Demo5{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
		    System.out.println(10/0);
		}catch(InterruptedException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
//C.T.E
// D:\java\Exception-Handling>javac Demo5.java
// Demo5.java:7: error: exception InterruptedException is never thrown in body of corresponding try statement
//                 }catch(InterruptedException e){
//                  ^
// 1 error
