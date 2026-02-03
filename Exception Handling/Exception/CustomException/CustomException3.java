class InvalidAmountDepositException extends Exception{
	InvalidAmountDepositException(String desc){
		super(desc);
	}
}

class Bank{
	String name;
	double balance;
	int pin;

	Bank(String name , double balance , int pin){
		this.name = name;
		try{
			this.balance = depositAmountCheck(balance);
		}
		catch(InvalidAmountDepositException e){
			System.out.println(e.getMessage());
		}
		this.pin = pin;
	}
	public String toString(){
		return name + " , balance : "+balance+" ,Pin : "+pin;
	}
	public double depositAmountCheck(double balance) throws InvalidAmountDepositException{
		if(balance<500)
			throw new InvalidAmountDepositException("Enter amount should be min 500");
		return balance;
	}
}

class CustomException3{
	public static void main(String[] args) {
		Bank obj = new Bank("Ramesh Kumar",200,1234);
		System.out.println(obj);
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac CustomException3.java

// D:\java\Exception-Handling>java CustomException3
// Enter amount should be min 500
// Ramesh Kumar , balance : 0.0 ,Pin : 1234
