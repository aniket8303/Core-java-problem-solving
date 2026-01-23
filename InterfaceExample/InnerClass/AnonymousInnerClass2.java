abstract class Demo{
	public abstract int addition(int num1 , int num2);
	public abstract int min(int num1 , int num2 , int num3);
}

class AnonymousInnerClass{
	public static void main(String[] args) {
		Demo obj = new Demo(){
			@Override 
			public int addition(int num1, int num2){
				return num1+num2;
			}
			@Override
			public int min(int num1 , int num2 , int num3){
				return num1<num2&&num1<num3? num1 : num2<num1&&num2<num3? num2 : num3 ;
			}
		};
		System.out.println(obj.addition(10,20));
		System.out.println(obj.min(10,20,30));
	}
}

//OUTPUT


// D:\java>javac AnonymousInnerClass.java

// D:\java>java AnonymousInnerClass
// 30
// 10
