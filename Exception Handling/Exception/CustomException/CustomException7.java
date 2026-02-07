class InvalidInputException extends Exception{
	InvalidInputException(){
		super();
	}
}

class UserArithmeticException extends Exception{
	UserArithmeticException(){
		super();
	}
}
class CustomException7{
	public static void main(String[] args) {
		System.out.println("main");
		m2(1);
	}

	public static void m1(int ip, int num1, int num2)
	throws InvalidInputException,UserArithmeticException{
		System.out.println("m1()");
		if(ip<10)
			throw new InvalidInputException();
		if(num2==0)
			throw new UserArithmeticException();
		System.out.println(ip);
	} 

	public static void m2(int ip) throws InvalidInputException{
		System.out.println("m2()");
		try{
			m1(ip,10,0);
		}
		catch(UserArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
//OUTPUT
D:\java\Exception-Handling>javac CustomException7.java
CustomException7.java:15: error: unreported exception InvalidInputException; must be caught or declared to be thrown
                m2(1);
                  ^
1 error
