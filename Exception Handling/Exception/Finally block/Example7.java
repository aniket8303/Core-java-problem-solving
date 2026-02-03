class Example7{
        public static void main(String[] args) {
                System.out.println("Starts");
                try{
                        System.out.println("try");
                        try{
                                System.out.println("inner try");
                                System.out.println(args[0]);
                        }catch(NullPointerException npe){
                                System.out.println("inner catch");
                        }finally{
                                System.out.println("inner finally");
                        }
                }
                catch(ArithmeticException e){
                        System.out.println("catch");
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

//OUTPUT

// D:\java\Exception-Handling>javac Example7.java

// D:\java\Exception-Handling>java Example7
// Starts
// try
// inner try
// inner finally
// Outer catch 2
// outer finally
// ends
