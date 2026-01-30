class InvalidPinException extends Exception {
	InvalidPinException(String desc)
	{
		super(desc);
	}
}

class CustomException{
	static int pin = 1234;
	static double balance = 20000;
	public static void main(String[] args) {
		System.out.println("execution starts");
		System.out.println("Enter a pin : ");
		int pin = new java.util.Scanner(System.in).nextInt();
		try{
			checkedbalance(pin);
		}
		catch(InvalidPinException e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("execution ends");
	}
	public static void checkedbalance(int userPin) throws InvalidPinException
	{
		if(userPin==pin){
			System.out.println("Your account balance is : "+balance);
		}
		else{
			throw new InvalidPinException("Enter pin is invalid");
		}
	}
}

//OUTPUT

// D:\java\Exception-Handling>javac CustomException.java

// D:\java\Exception-Handling>java CustomException
// execution starts
// Enter a pin :
// 1234
// Your account balance is : 20000.0
// execution ends

// D:\java\Exception-Handling>java CustomException
// execution starts
// Enter a pin :
// 1254
// Exception Handled
// execution ends
