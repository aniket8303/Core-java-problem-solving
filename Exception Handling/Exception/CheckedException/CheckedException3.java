class Task{
	public void printNumbers(String threadName){
		for(int i = 1; i<=10 ; i++){
			System.out.println(threadName+" : "+i);
			try{
				System.out.println("try ramesh : "+i);
				Thread.sleep(120);
			}catch(Exception e){

			}finally{
				System.out.println("finally from ramesh "+i);
			}
		}
	}
}
class MyThread extends Thread{
	@Override 
	public void run(){
		Task task = new Task();
		task.printNumbers("ramesh");
	}
}

class CheckedException3{
	public static void main(String[] args) throws InterruptedException
	{
	    MyThread t1 = new MyThread();
	    t1.setDaemon(true);
	    t1.start();
	    for(int i = 1; i<=10;i++){
	    	Thread.sleep(80);
	    	System.out.println("main : "+i);
	    }	
	}
}

// //OUTPUT


// D:\java\Exception-Handling>javac CheckedException3.java

// D:\java\Exception-Handling>java CheckedException3
// ramesh : 1
// try ramesh : 1
// main : 1
// finally from ramesh 1
// ramesh : 2
// try ramesh : 2
// main : 2
// main : 3
// finally from ramesh 2
// ramesh : 3
// try ramesh : 3
// main : 4
// finally from ramesh 3
// ramesh : 4
// try ramesh : 4
// main : 5
// main : 6
// finally from ramesh 4
// ramesh : 5
// try ramesh : 5
// main : 7
// finally from ramesh 5
// ramesh : 6
// try ramesh : 6
// main : 8
// main : 9
// finally from ramesh 6
// ramesh : 7
// try ramesh : 7
// main : 10
