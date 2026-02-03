class Example13{
        public static void main(String[] args) {
                System.out.println("main() Starts");
                for(int i = 1; i<=3 ; i++){
                        try{
                                System.out.println("try : "+i);
                                if(i%2!=0)
                                        System.out.println(10/0);
                        }catch(ArithmeticException e){
                                System.out.println("catch : "+i);
                                break;
                        }finally{
                                System.out.println("finally: "+i);
                                continue;
                        }
                }
                System.out.println("main() Ends");
        }
}

//OUTPUT
// D:\java\Exception-Handling>javac Example13.java

// D:\java\Exception-Handling>java Example13
// main() Starts
// try : 1
// catch : 1
// finally: 1
// try : 2
// finally: 2
// try : 3
// catch : 3
// finally: 3
// main() Ends
