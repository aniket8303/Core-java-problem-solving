// Types of RuntimeException
// 2.IndexOutOfBoundsException

class UncheckedException2{
	public static void main(String[] args) {
		String str = "abcdefghijklmn";
		for (int i = 0; ;i++ ) {
			char ch = ' ';
			try{
			ch = str.charAt(i);
		    }catch(IndexOutOfBoundsException e){
		    	break;
		    }
			System.out.println(ch);
		}
	}
	
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException2.java

// D:\java\Exception-Handling>java UncheckedException2
// a
// b
// c
// d
// e
// f
// g
// h
// i
// j
// k
// l
// m
// n
