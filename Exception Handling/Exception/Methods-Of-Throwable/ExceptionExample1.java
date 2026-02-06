//1. public java.lang.String getMessage();

class ExceptionExample1{
	public static void main(String[] args) {
		try{
			System.out.println("try");
			int [] arr = {10,20};
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException i){
			System.out.println(i.getMessage());
		}
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample1.java

// D:\java\Exception-Handling>java ExceptionExample1
// try
// Index 2 out of bounds for length 2
