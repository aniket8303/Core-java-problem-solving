
// protected native java.lang.Object clone() throws java.lang.CloneNotSupportedException

class Address
{
	String area;
	String city;
	String state;
	int pin;
	Address(String area,String city,String state,int pin){
		this.area = area;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	@Override
	public String toString()
	{
       return "Area : "+area+", City : "+city+",state : "+state+", Pincode : "+pin;
	}
}

class Education
{
	String name;
	int passout;
	double cgpa;
	String university;
    
    Education(String name , int passout , double cgpa , String university)
    {
    	this.name = name;
    	this.passout = passout;
    	this.cgpa = cgpa;
    	this.university = university;    	
    }

    @Override
    public String toString()
    {
    	return "name : "+name+", passout : "+passout+", cgpa : "+cgpa+", university : "+university;
    }
}
class Student implements Cloneable{
	String name ;
	String email;
	long contact;
	Address address;
	Education []education;

	Student(String name , String email , long contact , Address address , Education []education){
		this.name = name ;
		this.email = email ;
		this. contact = contact;
		this.address = address;
		this.education = education;
	}

	@Override
	public String toString()
	{
		return "Name : "+name+", Email : "+email+", Contact : "+contact ;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
    	return super.clone();
    }
}
class ObjectClass2 {
	public static void main(String[] args) {
		Education edu1 = new Education("SSC" , 2021 , 9.5 , "Mah State Board");
		Education edu2 = new Education("HSC" , 2023 , 8.9 , "Mah State Board");
		Education edu3 = new Education("BE" , 2027 , 7.5 , "SPPU");

		Education []education = {edu1 , edu2 , edu3};

		Address address = new Address("Deccan JM Road", "Pune", "MH" , 411004);

		Student student1 = new Student("Ramesh Kumar" , "ramesh@gmail.com", 9876543210l, address , education);

		System.out.println(student1);
		System.out.println(student1.address);
		System.out.println(java.util.Arrays.toString(student1.education));

		System.out.println("______________________________________________________________");

		//Clone implemented
		Student cloneObj = null;
		try{
			cloneObj = (Student)student1.clone();
			System.out.println(cloneObj);
			System.out.println(cloneObj.address);
			System.out.println(java.util.Arrays.toString(cloneObj.education));
		}
		catch(CloneNotSupportedException e){
            System.out.println("CLONE IS NOT SUPPORTED FOR STUDENT");
		}

		System.out.println("________________________Changes in Clone______________________");

		cloneObj.address.area = "KARVE NAGAR";
		System.out.println(cloneObj.address);

		System.out.println("________________________ORG OBJ________________________________");
		System.out.println(student1.address);
	}
}


//OUTPUT
// D:\java>javac ObjectClass1.java

// D:\java>java ObjectClass1.java
// Name : Ramesh Kumar, Email : ramesh@gmail.com, Contact : 9876543210
// Area : Deccan JM Road, City : Pune,state : MH, Pincode : 411004
// [name : SSC, passout : 2021, cgpa : 9.5, university : Mah State Board, name : HSC, passout : 2023, cgpa : 9.5, university : Mah State Board, name : BE, passout : 2027, cgpa : 9.5, university : SPPU]
// ______________________________________________________________
// Name : Ramesh Kumar, Email : ramesh@gmail.com, Contact : 9876543210
// Area : Deccan JM Road, City : Pune,state : MH, Pincode : 411004
// [name : SSC, passout : 2021, cgpa : 9.5, university : Mah State Board, name : HSC, passout : 2023, cgpa : 9.5, university : Mah State Board, name : BE, passout : 2027, cgpa : 9.5, university : SPPU]
// ________________________Changes in Clone______________________
// Area : KARVE NAGAR, City : Pune,state : MH, Pincode : 411004
// ________________________ORG OBJ________________________________
// Area : KARVE NAGAR, City : Pune,state : MH, Pincode : 411004
