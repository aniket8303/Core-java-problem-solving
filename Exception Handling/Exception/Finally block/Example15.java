class Example15{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                 try{
                        System.out.println("try");
                        System.out.println(10/0);
                 }catch(ArithmeticException e){
                        System.out.println("catch");
                        System.exit(0);
                 }finally{
                        System.out.println("finally");
                 }
                System.out.println("main() Ends");
        }
}

//OUTPUT

// D:\java\Exception-Handling>javac Example15.java

// D:\java\Exception-Handling>java Example15
// main() Starts
// try
// catch
