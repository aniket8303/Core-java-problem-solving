class Example10{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                m1();
                System.out.println("main() Ends");
        }
        public static void m1(){
                System.out.println("m1() Starts");
                try{
                        System.out.println("try");
                        System.out.println(10/0);
                }
                catch(ArithmeticException e){
                        System.out.println("outer catch 1");
                }
                finally{
                        System.out.println("outer finally");
                }
                System.out.println("m1() ends");
        }
}

//OUTPUT

// D:\java\Exception-Handling>javac Example10.java

// D:\java\Exception-Handling>java Example10
// main() Starts
// m1() Starts
// try
// outer catch 1
// outer finally
// m1() ends
// main() Ends
