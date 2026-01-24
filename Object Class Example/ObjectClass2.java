
//public boolean equals(java.lang.Object);

class Mobile{
	String brand ;
	String model;
	double price;

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
		Mobile obj2 = (Mobile)obj;
		if(this.brand.equals(obj2.brand) && this.model.equals(obj2.model) && this.price==obj2.price)
		{
			return true;
		}
		return false;
	}
}

class ObjectClass3{
	public static void main(String[] args)
	throws CloneNotSupportedException
	 {
		Mobile  obj1 = new Mobile("SAMSUNG", "S23",60000);
		System.out.println(obj1);
        

        Mobile obj2 = new Mobile("SAMSUNG", "S24",60000);
        System.out.println(obj2);
        System.out.println(obj1==obj2);//false
        System.out.println(obj1.equals(obj2));//false

	}
}


//OUTPUT


// D:\java>javac ObjectClass2.java

// D:\java>java ObjectClass2.java
// SAMSUNG : S23, Price : 60000.0
// SAMSUNG : S24, Price : 60000.0
// false
// false
