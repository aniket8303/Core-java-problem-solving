// Types of RuntimeException
// 3.NullPointerException

class UncheckedException3{
	public static void main(String[] args) {
		String str = new String("Hello");
		System.out.println(str.isEmpty());
		try{
		str = null ;
	    }catch(NullPointerException e){
		System.out.println(str.isEmpty());
	   }
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException3.java

// D:\java\Exception-Handling>java UncheckedException3
// false
// empty string ____
