class Example8{
        public static void main(String[] args) {
                System.out.println("Starts");
                try{
                        System.out.println("try");
                        System.out.println(10/0);
                        try{
                                System.out.println("inner try");
                        }finally{
                                System.out.println("inner finally");
                        }
                }
                catch(ArithmeticException e){
                        System.out.println("outer catch 1");
                }
                catch(ArrayIndexOutOfBoundsException ae){
                        System.out.println("Outer catch 2");
                }
                finally{
                        System.out.println("outer finally");
                }
                System.out.println("ends");
        }
}

// //OUTPUT


// D:\java\Exception-Handling>javac Example8.java

// D:\java\Exception-Handling>java Example8
// Starts
// try
// outer catch 1
// outer finally
// ends
