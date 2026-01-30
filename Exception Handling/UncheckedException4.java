// Types of RuntimeException
// 4.NegativeArraySizeException

import java.util.Arrays;
class UncheckedException4{
	public static void main(String[] args) {
		int [] arr = null;
	    try{
	    	arr = new int[-10];
	    }catch(NegativeArraySizeException e){
	    	System.out.println("Requested array size is invalid");
	    }
	    System.out.println(Arrays.toString(arr));
	}
}


// OUTPUT
// D:\java\Exception-Handling>javac UncheckedException4.java

// D:\java\Exception-Handling>java UncheckedException4
// Requested array size is invalid
// null
