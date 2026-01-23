class OuterClass{
	static String a = "Outer class static var";
	String b = "Outer class non-static var";
	OuterClass(){
		System.out.println("OuterClass constructor");
	}
	static class InnerClass {
		static String c = "Inner class static var";
		String d = "Inner class non-static var";

		InnerClass(){
			super();
			System.out.println("InnerClass constructor");
		}
		public static void m1(){
			System.out.println(a);
            System.out.println("m1() static from static InnerClass");
		}
		public void m2(){
			System.out.println(new OuterClass().b);
			System.out.println("m2() non-static from static InnerClass");
		}
	}
	public static void m3(){
		System.out.println("m3() static from OuterClass");
	}
	public void m4(){
		System.out.println("m4() non-static from OuterClass");
	}
}

class StaticInnerClass{
	public static void main(String[] args) {
	System.out.println(OuterClass.a);
	OuterClass.m3();
	OuterClass obj = new OuterClass();
	obj.m4();
	System.out.println(obj.b);

	System.out.println("_______________________________");

	System.out.println(OuterClass.InnerClass.c);
	OuterClass.InnerClass.m1();

	OuterClass.InnerClass.m1();
	OuterClass.InnerClass obj1 = new OuterClass.InnerClass();
	obj1.m2();
	System.out.println(obj1.d);
	
	}
}


//OUTPUT
// D:\java>javac StaticInnerClass.java

// D:\java>java StaticInnerClass
// Outer class static var
// m3() static from OuterClass
// OuterClass constructor
// m4() non-static from OuterClass
// Outer class non-static var
// _______________________________
// Inner class static var
// Outer class static var
// m1() static from static InnerClass
// Outer class static var
// m1() static from static InnerClass
// InnerClass constructor
// OuterClass constructor
// Outer class non-static var
// m2() non-static from static InnerClass
// Inner class non-static var

