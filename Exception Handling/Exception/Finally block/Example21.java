class Example21{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                try{
                     int a = 10/0;
                }
                finally{
                     String str = null;
                     str.isEmpty();
                }
                System.out.println("main() Ends");
        }
}

//OUTPUT
// D:\java\Exception-Handling>javac Example21.java

// D:\java\Exception-Handling>java Example21
// main() Starts
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "<local3>" is null
//         at Example21.main(Example21.java:9)

