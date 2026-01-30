// FullyCheckedException
//2.InterruptedException

class CheckedException2
{
	public static void main(String[] args)
  {
		String str = "HELLO JAVA";
		for (int i = 0; i<str.length() ; i++ ) 
    {
			System.out.println(str.charAt(i));
			try{
				Thread.sleep(2000);
			}
      catch(InterruptedException e){
				System.out.println("Exception Handled");
			}
		}
	}
}

//OUTPUT
// D:\java\Exception-Handling>javac CheckedException2.java

// D:\java\Exception-Handling>java CheckedException2
// H
// E
// L
// L
// O

// J
// A
// V
// A
