class Example17{
        public static void main(String[] args) throws InterruptedException {
                System.out.println(" Starts");
                Thread curr = Thread.currentThread();
                 try{
                        System.out.println("try");
                        System.out.println(10/0);
                 }catch(Exception e){
                        System.out.println("catch");
                        curr.join();
                 }finally{
                        System.out.println("finally");
                 }
                System.out.println("main() Ends");
        }
}

// //OUTPUT
// D:\java\Exception-Handling>javac Example17.java

// D:\java\Exception-Handling>java Example17
// Starts
// try
// catch
