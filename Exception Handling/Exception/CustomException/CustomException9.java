import java.util.Scanner;
import java.io.*;

class UserInputMismatchException extends RuntimeException{
	UserInputMismatchException(){
		this("");
	}

	UserInputMismatchException(String message){
		super(message);
	}
}

class UserScanner{
	InputStream in;

	Scanner sc = new Scanner(System.in);
	UserScanner(InputStream in){
		this.in = in;
	}

	public int userNextInt(){
		String ip = sc.next();
		int num = 0;
		try{
			num = Integer.parseInt(ip);
		}
		catch(Exception e){
			throw new UserInputMismatchException();
		}
		return num;
	}
}

class CustomException9{
	public static void main(String[] args) {
		UserScanner sc = new UserScanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.userNextInt();
		System.out.println(num);
	}
}




//OUTPUT
// D:\java\Exception-Handling>javac CustomException9.java

// D:\java\Exception-Handling>java CustomException9
// Enter a number :
// 123
// 123

// D:\java\Exception-Handling>java CustomException9
// Enter a number :
// 123a
// Exception in thread "main" UserInputMismatchException:
//         at UserScanner.userNextInt(CustomException9.java:29)
//         at CustomException9.main(CustomException9.java:39)

// D:\java\Exception-Handling>



