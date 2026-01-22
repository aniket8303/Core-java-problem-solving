interface A {
	void m1();
	void m2();
}
interface B {
	void m3();
}
interface C {

}
abstract class D implements B {
	
	public void m1(){
		System.out.println("m1() from classD");
	}
	
	public void m2(){
		System.out.println("m2() from classD");
	}

}
class E extends D{
	public void m3(){
		System.out.println("m3() from classE");
	}
}
class F implements C {
	
	public void m1(){
		System.out.println("m1() from class F");
	}
	
	public void m2(){
		System.out.println("m2() from class F");
	}
	
	public void m3(){
		System.out.println("m3() from class F");
	}
}
class InterfaceExample{
	public static void main(String[] args) {
		E obj = new E();
		obj.m1();
		obj.m2();
		obj.m3();
		F obj1 = new F();
		obj1.m1();
		obj1.m2();
		obj1.m3();
	}
}


// Output
// D:\java>javac InterfaceExample.java

// D:\java>java InterfaceExample
// m1() from classD
// m2() from classD
// m3() from classE
// m1() from class F
// m2() from class F
// m3() from class F
