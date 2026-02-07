class AgeNotValidException extends Exception {
	private int age;
	AgeNotValidException(int age, String desc){
		super(desc);
		this.age = age;
	}

	public int getAge() {
        return age;
    }
}

class Person {

	private String name;
	private int age;

	Person(String name, int age){
		this.name = name;
		this.age = age;
	}


	public String toString(){
		return "name : "+name +" , age : "+age;
	}

	public void validateAge() throws AgeNotValidException{
		if(age < 18){
			throw new AgeNotValidException(age , "Age is not valid for voting");
		}

		System.out.println(name + " is eligible.");
	}
}

class CustomException11{
	public static void main(String[] args) {
		Person obj = new Person("Ramesh", 10);
        System.out.println(obj.toString());

        try{
        	obj.validateAge();
        }
        catch(AgeNotValidException e){
        	System.out.println("Exception caught:"+e.getMessage());
        	System.out.println("Invalid age: "+e.getAge());
        }		
	}
}
//OUTPUT

// D:\java\Exception-Handling>javac CustomException11.java

// D:\java\Exception-Handling>java CustomException11
// name : Ramesh , age : 21
// Ramesh is eligible.

// D:\java\Exception-Handling>javac CustomException11.java

// D:\java\Exception-Handling>java CustomException11
// name : Ramesh , age : 10
// Exception caught:Age is not valid for voting
// Invalid age: 10

// D:\java\Exception-Handling>



