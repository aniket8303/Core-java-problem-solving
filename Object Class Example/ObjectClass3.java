
// public boolean equals(java.lang.Object);

class Instagram implements Cloneable{
	String username ; 
	String bio;
	int followers;
	int following ;

	Instagram(String username , String bio , int followers , int following){
		this.username = username;
		this.bio = bio ;
		this.followers = followers ;
		this.following = following ;
	}

    @Override
	public String toString(){
		return "Username : "+username+", Bio : "+bio+", Followers : "+followers+", Following : "+following;
	}
    
    @Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public boolean equals(Object obj1){
		Instagram cloneObj = (Instagram)obj1;
		if(this.username.equals(cloneObj.username) && this.bio.equals(cloneObj.bio) && this.followers==cloneObj.followers && this.following == cloneObj.following){
			return true;
		}
		return false;
	}
}

class ObjectClass1{
	public static void main(String[] args)
	throws CloneNotSupportedException
	 {
		Instagram obj1 = new Instagram("Aniket", "Software Engineer",700,700);
		System.out.println(obj1);
        

        Instagram cloneObj = (Instagram)obj1.clone();
        System.out.println(cloneObj);
       

        //Clone implemented
        // Instagram cloneObj = null;
		// try{
		// 	cloneObj = (Instagram)obj1.clone();
		// 	System.out.println(cloneObj);
		// }
		// catch(CloneNotSupportedException e){
        //     System.out.println("CLONE IS NOT SUPPORTED FOR STUDENT");
		// }

		System.out.println("________________________Changes in Clone______________________");

		cloneObj.bio = "Computer Engineer";
		cloneObj.username="Ganesh Jadhav";
		cloneObj.followers=400;
		cloneObj.following=500;
		System.out.println(cloneObj);

		System.out.println(obj1==cloneObj);
		System.out.println(obj1.equals(cloneObj));//false

	}
}

//OUTPUT
// D:\java>javac ObjectClass3.java

// D:\java>java ObjectClass3
// Username : Aniket, Bio : Software Engineer, Followers : 700, Following : 700
// Username : Aniket, Bio : Software Engineer, Followers : 700, Following : 700
// ________________________Changes in Clone______________________
// Username : Ganesh Jadhav, Bio : Computer Engineer, Followers : 400, Following : 500
// false
// false
