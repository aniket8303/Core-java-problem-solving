class UncheckedException9{
	public static void main(String[] args) {
		System.out.println("Execution Starts");
        try{
        	System.out.println("try");
        	System.out.println("hii".charAt(3));
        }
        catch(IndexOutOfBoundsException e){
        	System.out.println("IndexOutOfBoundsException");
        }
        catch(ArrayIndexOutOfBoundsException e){
        	System.out.println("ArrayIndexOutOfBoundsException");
        }
        System.out.println("Execution Ends");
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac UncheckedException9.java
// UncheckedException9.java:11: error: exception ArrayIndexOutOfBoundsException has already been caught
//         catch(ArrayIndexOutOfBoundsException e){
//         ^
// 1 error
