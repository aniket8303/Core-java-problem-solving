
class HelmetNotFoundException extends Exception {

}
class AssignmentNotCompletedException extends RuntimeException{

}
class DailyRoutine{
	public static void main(String[] args) {
		try{
			travelling();
		}
		catch(HelmetNotFoundException e)
		{
			System.out.println("Exception Handled");
		}
		attenBatch(true);
	}
	public static void travelling() throws HelmetNotFoundException
	{
		System.out.println("Travelling Started");
	}
	public static void attenBatch(boolean assignment)
	{
		if(assignment){
			try{
				checkAssignment();
			}
			catch(AssignmentNotCompletedException e)
			{
				System.out.println("throw him/her out");
			}
		}
		System.out.println("Class Completed");
	}
	public static void checkAssignment()
	{
		System.out.println("Enter your response: ");
		String resp = new java.util.Scanner(System.in).next().toUpperCase();

		if(resp.equals("YES"))
		{
			System.out.println("CONTINUE YOUR CLASS");
		}
		else{
			throw new AssignmentNotCompletedException();
		}
	}
}


//OUTPUT 1
// D:\java\Exception-Handling>javac DailyRoutine.java

// D:\java\Exception-Handling>java DailyRoutine
// Travelling Started
// Enter your response:
// yes
// CONTINUE YOUR CLASS
// Class Completed

//OUTPUT2
// D:\java\Exception-Handling>java DailyRoutine
// Travelling Started
// Enter your response:
// nahi
// throw him/her out
// Class Completed
