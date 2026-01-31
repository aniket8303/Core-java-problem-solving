class Demo3{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
		    int [] arr = {10,20};
		    System.out.println(arr[3]);
		}catch(NullPointerException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Demo3.java

// D:\java\Exception-Handling>java Demo3
// Execution Starts
// try
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 2
//         at Demo3.main(Demo3.java:7)
