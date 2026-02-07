class InvalidCredentialsException extends RuntimeException{
	InvalidCredentialsException(String desc){
		super(desc);
	}
}

class Credentials{
	String userName;
	String password;
	long phoneNo;

	Credentials(String userName, String password, long phoneNo){
		this.userName = userName;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	public void login(long phoneNo , int pin , String passsword){
		if(phoneNo != pin){
			throw new InvalidCredentialsException("entered credentials was invalid");

		}
	}

}

class CustomException10 {
	public static void main(String[] args) {
		Credentials obj =
		 new Credentials("Ramesh","1234",8668943955l);

		 obj.login(8668943955l,1234,"1234");


	}
}

//OUTPUT

// D:\java\Exception-Handling>javac CustomException10.java

// D:\java\Exception-Handling>java CustomException10
// Exception in thread "main" InvalidCredentialsException: entered credentials was invalid
//         at Credentials.login(CustomException10.java:20)
//         at CustomException10.main(CustomException10.java:32)


