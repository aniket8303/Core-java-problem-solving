class Example9{
        public static void main(String[] args) {
                System.out.println("Starts");
                System.out.println(10/0);
                try{
                        System.out.println("try");
                }
                catch(ArithmeticException e){
                        System.out.println("outer catch 1");
                }
                finally{
                        System.out.println("outer finally");
                }
                System.out.println("ends");
        }
}
//OUTPUT
// D:\java\Exception-Handling>javac Example9.java

// D:\java\Exception-Handling>java Example9
// Starts
// Exception in thread "main" java.lang.ArithmeticException: / by zero
//         at Example9.main(Example9.java:4)
