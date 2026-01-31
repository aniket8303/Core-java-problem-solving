class Demo4{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
		    int [] arr = {10,20};
		    System.out.println(arr[3]);
		}catch(Throwable e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Demo4.java

// D:\java\Exception-Handling>java Demo4
// Execution Starts
// try
// catch
// Execution Ends
