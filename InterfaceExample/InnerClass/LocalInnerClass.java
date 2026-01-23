class Demo{
	static String a = "Static var";
	String b = "non-static var";

	public void m1(){
		System.out.println(a);
		Demo obj = new Demo();
		System.out.println(obj.b);

		class LocalInnerClass {
			static String c = "Local inner class static var";
			String d = "Local inner class non-static var";

			public void m2(){
				System.out.println("m2() from LocalInnerClass");
			}
			public static void m3(){
				System.out.println("m3() from LocalInnerClass");
			}
		}
		System.out.println(LocalInnerClass.c);
		LocalInnerClass.m3();
		new LocalInnerClass().m2();
		System.out.println(new LocalInnerClass().d);
	}
}

class LocalInnerClass{
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.m1();
	}
} 

//OUTPUT

// D:\java>javac LocalInnerClass.java

// D:\java>java LocalInnerClass
// Static var
// non-static var
// local inner class static var
// m3() from LocalInnerClass
// m2() from LocalInnerClass
// Local inner class non-static var
