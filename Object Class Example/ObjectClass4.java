//Implement Mobile class with equals and hashCode methods
// public native int hashCode();

class Mobile{
	String brand ;
	String model;
	Double price;

	Mobile(String brand , String model , double price){
		this.brand = brand;
		this.model = model ;
		this.price = price ;
	}

    @Override
	public String toString(){
		return brand+" : "+model+", Price : "+price;
	}
    
    @Override
	public boolean equals(Object obj){
		return this.hashCode() == obj.hashCode();
	}
	@Override
	public int hashCode(){
		int hc = brand.hashCode()+model.hashCode()+price.hashCode();
		return hc<0? hc*= -1:hc;
	}
}

class ObjectClass4{
	public static void main(String[] args)
	 {
		Mobile  obj1 = new Mobile("SAMSUNG", "S23",60000);
        Mobile  obj2 = new Mobile("sAMSUNG", "S23",60000);
		Mobile  obj3 = new Mobile("SAMSUNG", "S23",60000);
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

// D:\java>javac ObjectClass4.java

// D:\java>java ObjectClass4
// SAMSUNG : S23, Price : 60000.0
// sAMSUNG : S23, Price : 60000.0
// SAMSUNG : S23, Price : 60000.0
// false
// 622668370
// 2007645646
// 622668370
