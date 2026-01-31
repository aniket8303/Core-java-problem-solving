class Demo7{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
		try{
			System.out.println("try");
			System.out.println("Hello1");
		    Thread.sleep(2200);
		    System.out.println("Hello2");
		}catch(InterruptedException e){
			System.out.println("catch");
		}
		System.out.println("Execution Ends");
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac Demo7.java

// D:\java\Exception-Handling>java Demo7
// Execution Starts
// try
// Hello1
// Hello2
// Execution Ends
