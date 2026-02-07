import java.util.*;

class UserStringIndexOutOfBoundsException
 extends IndexOutOfBoundsException{
 	UserStringIndexOutOfBoundsException(String desc){
 		super(desc);
 	}
}

class UserNullPointerException extends RuntimeException{
	UserNullPointerException(String desc){
		super(desc);
	}
}
class UserString{
	char [] arr;
	UserString(String str){
		arr = str.toCharArray();
	}

	public String toString(){
		return new String(arr);
	}

	public int length(){
		return arr.length;
	}

	public char charAt(int indx){
		if(indx<0 || indx>=arr.length)
			throw new UserStringIndexOutOfBoundsException(
				"Indx : "+indx+" is invalid for length : "+arr.length);
		return arr[indx];
	}
}

class CustomException6{
	public static void main(String[] args) {
		UserString str = new UserString("ABCDEFGHIJKLMNO");
		System.out.println(str);
		for(int i = 0; i<=str.length(); i++){
			try{
				System.out.println(i+" : "+str.charAt(i));
			}
			catch(UserStringIndexOutOfBoundsException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println(str.length());

		UserString str2 = null;
		if(str == null){
			throw new UserNullPointerException
			("Object is pointing towards null");
        }
        System.out.println(str2.length());
	}
}

// //OUTPUT
// D:\java\Exception-Handling>javac CustomException6.java

// D:\java\Exception-Handling>java CustomException6
// ABCDEFGHIJKLMNO
// 0 : A
// 1 : B
// 2 : C
// 3 : D
// 4 : E
// 5 : F
// 6 : G
// 7 : H
// 8 : I
// 9 : J
// 10 : K
// 11 : L
// 12 : M
// 13 : N
// 14 : O
// Indx : 15 is invalid for length : 15
// 15
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "UserString.length()" because "<local2>" is null
//         at CustomException6.main(CustomException6.java:56)
