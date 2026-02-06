//1. public java.lang.String getMessage();

import java.util.*;
class ExceptionExample2{
	public static void main(String[] args) {
		Stack stack = new Stack();
		try{
			System.out.println(stack.pop());
		}
		catch(EmptyStackException e){
			System.out.println(e.getMessage());
		}
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample2.java

// D:\java\Exception-Handling>java ExceptionExample2
// null
