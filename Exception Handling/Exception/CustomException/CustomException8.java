import java.util.Scanner;
class UserArithmeticException extends RuntimeException{
	UserArithmeticException(String message){
		super(message);
	}
}

class CustomException8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();

		int output = divide(num1 , num2);
		System.out.println(output);
	}
	public static int divide(int num1 , int num2){
		if(num2==0)
			throw new UserArithmeticException
			("Cannot divide a number by zero");
		 return num1/num2;
		
	}
}

//OUtPUT

// D:\java\Exception-Handling>javac CustomException8.java

// D:\java\Exception-Handling>java CustomException8
// Enter num1 :
// 10
// Enter num2 :
// 5
// 2

// D:\java\Exception-Handling>java CustomException8
// Enter num1 :
// 12
// Enter num2 :
// 0
// Exception in thread "main" UserArithmeticException: Cannot divide a number by zero
//         at CustomException8.divide(CustomException8.java:21)
//         at CustomException8.main(CustomException8.java:16)

// D:\java\Exception-Handling>



