//public java.lang.String toString();
//public boolean equals(java.lang.Object);
//public native int hashCode();


class Employee{
	String empid ;
	String ename ;
	Double salary ;
	Long contact ;
	String email ;

	Employee(String empid, String ename,double salary,long contact, String email){
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.contact = contact;
		this.email = email;
	}


    @Override
	public String toString(){
		return "EmpID : "+empid+", Ename : "+ename+", Salary : "+salary+", Contact : "+contact+", Email : "+email;
	} 

    @Override
	public boolean equals(Object obj){
		return this.hashCode() == obj.hashCode();
	}

	@Override
	public int hashCode(){
		int hc = empid.hashCode()+ename.hashCode()+salary.hashCode()+contact.hashCode()+email.hashCode();
		return hc<0? hc *= -1 : hc;
	}
}
class ObjectClass5{
	public static void main(String[] args) {
		Employee obj1 = new Employee("E01","Ramesh Kumar",50000,9876543210l,"rameshkumar@gmail.com");
		Employee obj2 = new Employee("E01","Ramesh Kumar",50000,9876543210l,"rameshkumar@gmail.com");
		Employee obj3 = new Employee("E01","Ramesh kumar",50000,9876543210l,"rameshkumar@gmail.com");
	    System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
	}
}


//OUTPUT
// D:\java>javac ObjectClass5.java

// D:\java>java ObjectClass5
// EmpID : E01, Ename : Ramesh Kumar, Salary : 50000.0, Contact : 9876543210, Email : rameshkumar@gmail.com
// EmpID : E01, Ename : Ramesh Kumar, Salary : 50000.0, Contact : 9876543210, Email : rameshkumar@gmail.com
// EmpID : E01, Ename : Ramesh kumar, Salary : 50000.0, Contact : 9876543210, Email : rameshkumar@gmail.com
// true
// 77349465
// 77349465
// 47796793
