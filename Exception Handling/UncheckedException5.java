// Types of RuntimeException
// 5. ClassCastException

class Parent{}
class Child extends Parent{}
class GrandChildA extends Child{}
class GrandChildB extends Child{}
class UncheckedException5{
	public static void main(String[] args) {
		Child obj = new GrandChildB();
		Parent obj1 = (GrandChildB)obj;
		try{
			GrandChildA obj2 = (GrandChildA)obj1;
		}
		catch(ClassCastException e){
			System.out.println("Handled ClassCastException");
      	}
	
	}
}

//OUTPUT

// D:\java\Exception-Handling>javac UncheckedException5.java

// D:\java\Exception-Handling>java UncheckedException5
// Handled ClassCastException
