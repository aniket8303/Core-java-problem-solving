@FunctionalInterface
interface Demo{
	boolean isPrime(int num);
}

class PrimeNumberExample{
	public static void main(String[] args) {
		// Demo obj =num -> isPrime1(num);

		Demo obj1 = num -> {
			if(num < 2 )return false;
			for(int i = 2; i<=num/2; i++){
				if(num%i==0)return false;
			}
			return true;

		};
        // int num = 5 ;
		// System.out.println(obj.isPrime(5)? num+" is prime" : num+"is NOT prime");
		System.out.println(obj1.isPrime(7));
	}
	// public static boolean isPrime1(int num){
	// 	if(num <2 )return false;
	// 		for(int i = 2; i<=num/2; i++){
	// 			if(num%i==0)return false;
	// 		}

	// 		return true;
	// }
	
}



//OUTPUT 

// D:\java>javac PrimeNumberExample.java

// D:\java>java PrimeNumberExample
// true
