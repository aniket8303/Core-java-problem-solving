//Type of RuntimeException
//UncheckedException
//InputMismatchException 

import java.util.Scanner;
class UncheckedException6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int num = 0;
		try{
			num = sc.nextInt();
		}catch(java.util.InputMismatchException e){
			System.out.println("Invalid Response");
		}
		System.out.println("num : "+num);
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException6.java

// D:\java\Exception-Handling>java UncheckedException6
// Enter a value :
// 234
// num : 234

// D:\java\Exception-Handling>java UncheckedException6
// Enter a value :
// hello
Invalid Response
num : 0
