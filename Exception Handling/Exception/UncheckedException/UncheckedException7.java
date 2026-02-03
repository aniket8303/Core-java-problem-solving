//UncheckedException
// Type of Runtime Exception
//Arithmetuc Exception


class Mobile {
	String brand ;
	String model ;
	double price ;

	Mobile(String brand , String model , double price){
		this.brand = brand ;
		this.model = model ; 
		this.price = price ;
	}

	public String toString(){
		return brand+" , "+model +" , Price : "+price;
	}
	// @SuppressWarnings("removal")                                 |   OUTPUT
	// public void finalize(){                                      |    Starts
	// 	System.out.println("Mobile object got destroyed");          |   Samsung , S24 , Price : 56000.0
	// 	int [] arr = new int[-1];                                   |   ends
  // }                                                            |   Mobile object got destroyed
	@SuppressWarnings("removal")
	public void finalize(){
		System.out.println("Mobile object got destroyed");
		try{
			System.out.println("try starts");
			System.out.println(10/0);
			System.out.println("try ends");
		}
		catch(ArithmeticException e){
			System.out.println("catch");
		}
	}
}

class UncheckedException7{
	public static void main(String[] args) {
		System.out.println("Starts");
		Mobile obj1 = new Mobile("Samsung" , "S24" , 56000);
		System.out.println(obj1);
		obj1 = null ;
		System.gc();
		System.out.println("ends");
	}
}


//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException7.java

// D:\java\Exception-Handling>java UncheckedException7
// Starts
// Samsung , S24 , Price : 56000.0
// ends
// Mobile object got destroyed
// try starts
// catch
