class InsufficientFundsException extends RuntimeException{
	InsufficientFundsException(String desc){
		super(desc);
	}
}
class Bank{
	String name;
	double balance;
	int pin;

	Bank(String name, double balance, int pin){
		this.name = name;
		this.balance = balance;
		this.pin = pin;
	}
}

class CustomException5{
	public static void main(String[] args) {
		Bank bank = new Bank("Ramesh",10000,123);
		System.out.println("Enter amount:");
		double amount = new java.util.Scanner(System.in).nextDouble();

		if(amount <= bank.balance){
			bank.balance -= amount ;
			System.out.println("Amount debited succesfully");
		}
		else{
			try{
				throw new InsufficientFundsException
				("account doesnt have requested funds.");
			}
			catch(InsufficientFundsException e){
				System.out.println(e.getMessage());
			}
		}
	}
}

//OUTPUT

// D:\java\Exception-Handling>javac CustomException5.java
// D:\java\Exception-Handling>java CustomException5
// Enter amount:
// 5000
// Amount debited succesfully

// D:\java\Exception-Handling>java CustomException5
// Enter amount:
// 20000
// account doesnt have requested funds.


UT
