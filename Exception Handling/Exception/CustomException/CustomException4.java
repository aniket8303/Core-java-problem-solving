class Demo1{}
class Demo2 extends RuntimeException{}
class Demo3 extends Throwable{}
class Demo4 extends Error{}
class Demo5 extends Demo3{}
class Demo6 extends Object{}
class CustomException4{
	public static void main(String[] args) {
		throw new ArithmeticException();
		// throw new Demo1();
		throw new Demo2();
		throw new Demo3();
		throw new Demo4();
		throw new Demo5();
	}
}

//
// OUTPUT
// D:\java\Exception-Handling>java CustomException4.java                                      |
// CustomException4.java:10: error: incompatible types: Demo1 cannot be converted to Throwable|
//                 throw new Demo1();                                                         |          =>   throw new Demo1();
//                 ^                                                                          |
// 1 error                                                                                    |
// error: compilation failed                                                                  |


// D:\java\Exception-Handling>java CustomException4.java
// CustomException4.java:11: error: unreachable statement
//                 throw new Demo2();
//                 ^
// CustomException4.java:12: error: unreachable statement
//                 throw new Demo3();
//                 ^
// CustomException4.java:13: error: unreachable statement
//                 throw new Demo4();
//                 ^
// CustomException4.java:14: error: unreachable statement
//                 throw new Demo5();
//                 ^
// 4 errors
// error: compilation failed
