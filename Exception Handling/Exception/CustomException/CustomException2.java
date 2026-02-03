class InvalidMarksException extends Exception{
	InvalidMarksException(String desc){
		super(desc);
	}
}

class Student{
	String name;
	double marks;
	double percentage;

	Student(String name , double marks) throws InvalidMarksException{
          if(marks<0)
          	    throw new InvalidMarksException("Entered marks is invalid");
          	this.name = name;
          	this.marks = marks;
          	this.percentage = calculatePercentage(marks);
	}

	public String toString(){
		return name + " , Marks :  "+marks+" , Percentage : "+percentage;
	}
	public double calculatePercentage(double marks){
		return (marks/500)*100;
	}
}
class CustomException2{
	public static void main(String[] args) {
		Student obj = null;
		try{
			obj = new Student("Ramesh Kumar",-470);
		}
		catch(InvalidMarksException e){
			System.out.println("Enter marks was invalid");
		}
		System.out.println(obj);
	}
}

//OUTPUT

// D:\java\Exception-Handling>javac CustomException2.java

// D:\java\Exception-Handling>java CustomException2
// Enter marks was invalid
// null


//OUTPUT2
// When marks is 12
  
// D:\java\Exception-Handling>javac CustomException2.java

// D:\java\Exception-Handling>java CustomException2
// Ramesh Kumar , Marks :  12.0 , Percentage : 2.4
