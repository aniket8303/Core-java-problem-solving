class Example20{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                System.out.println(m1());
                System.out.println("main() Ends");
        }public static int m1(){
              try{
                     return 10;
              }
              catch(Exception e){
                     return 30;
              }
              finally{
                     return 40;
              }
        }
}

// //OUTPUT
// D:\java\Exception-Handling>javac Example20.java

// D:\java\Exception-Handling>java Example20
// main() Starts
// 40
// main() Ends
