//3.  public java.lang.String toString();

import java.util.Scanner;
class AgeNotValidException extends RuntimeException{

	AgeNotValidException(String message){
		super(message);
	}
	@Override
	public String toString(){
		return this.getClass().getName()+":"+getMessage();
	}
}

class ExceptionExample4{
	public static void main(String[] args) {
		int age = new Scanner(System.in).nextInt();
		if(age>=18){
			System.out.println("Eligible for voting");
		}else{
			try{
				throw new AgeNotValidException(age+" ");
			}
			catch(AgeNotValidException e){
				System.out.println(e);
			}
		}
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac ExceptionExample4.java

// D:\java\Exception-Handling>java ExceptionExample4
// 11
// AgeNotValidException:11

// D:\java\Exception-Handling>java ExceptionExample4
// 21
// Eligible for voting

