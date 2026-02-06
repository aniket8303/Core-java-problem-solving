class Example19{
        public static void main(String[] args) {
                System.out.println("main() Starts");
               
                 try{
                        System.out.println("try");
                        int [] arr = new int[Integer.MAX_VALUE];
                 }finally{
                        System.out.println("finally");
                 }
                System.out.println("main() Ends");
        }
}

//OUTPUT
// D:\java\Exception-Handling>javac Example19.java

// D:\java\Exception-Handling>java Example19
// main() Starts
// try
// finally
// Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
//         at Example19.main(Example19.java:7)
