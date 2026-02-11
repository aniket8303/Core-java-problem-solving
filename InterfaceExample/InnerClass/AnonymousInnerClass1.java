 @FunctionalInterface
interface Demo{
	void m1();
}
class AnonymousInnerClass{
	public static void main(String[] args) {
		Demo obj = new Demo(){
			@Override
			public void m1(){
				System.out.println("m1() implemented");
			}
		};
		obj.m1();
	}
}

//OUTPUT

// D:\java>javac AnonymousInnerClass.java

// D:\java>java AnonymousInnerClass
// m1() implemented
