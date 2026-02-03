class UncheckedException8{
  public static void main(String[]args){
    System.out.println("Starts");
    try{
      System.out.println("try");
      System.out.println(10/0.0);
    }
    catch(ArithmeticException e){
      System.out.println("catch");
    }
    System.out.println("Ends");
  }
}

//OUTPUT
// D:\java\Exception-Handling>javac UncheckedException8.java

// D:\java\Exception-Handling>java UncheckedException8
// Starts
// try
// Infinity
// Ends
