class Example14{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                for(int i = 1; i<=3 ; i++){
                        try{
                                System.out.println("try : "+i);
                                System.out.println(10/0);
                        }catch(ArithmeticException e){
                                System.out.println("catch : "+i);
                                break;
                        }finally{
                                System.out.println("finally: "+i);
                        }
                }
                System.out.println("main() Ends");
        }
}

//OUTPUT
// D:\java\Exception-Handling>javac Example14.java

// D:\java\Exception-Handling>java Example14
// main() Starts
// try : 1
// catch : 1
// finally: 1
// main() Ends
