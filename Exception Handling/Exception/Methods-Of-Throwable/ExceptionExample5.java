//3.public void printStackTrace();

class Demo{
    public static void m1(){
        System.out.println("Starts");
        try{
            System.out.println("try");
            int a = 10/0;
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("ends");
    }
}

class ExceptionExample5{
    public static void main(String[] args) {
        m2();
    }
    public static void m2(){
        Demo.m1();
    }
}

//OUTPUT

// D:\java\Exception-Handling>javac ExceptionExample5.java

// D:\java\Exception-Handling>java ExceptionExample5
// Starts
// try
// java.lang.ArithmeticException: / by zero
//         at Demo.m1(ExceptionExample5.java:6)
//         at ExceptionExample5.m2(ExceptionExample5.java:20)
//         at ExceptionExample5.main(ExceptionExample5.java:17)
// ends
