class Example16{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                 try{
                        System.out.println("try");
                        System.out.println(10/0);
                 }catch(ArithmeticException e){
                        System.out.println("catch");
                        for (; ; );
                 }finally{
                        System.out.println("finally");
                 }
                System.out.println("main() Ends");
        }
}

// // OUTPUT
// D:\java\Exception-Handling>javac Example16.java

// D:\java\Exception-Handling>java Example16
// main() Starts
// try
// catch








