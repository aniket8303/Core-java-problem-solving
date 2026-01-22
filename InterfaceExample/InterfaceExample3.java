interface Iterable {
	void forEach();
}
interface Collection extends Iterable{
	void add(int ele);
	void remove(int indx);
	void isEmpty();
}
interface List extends Collection{

}
interface Queue extends Collection{
	void offer();
	void poll();
}
interface Deque extends Queue{}
interface RandomAccess{}

class Stack extends Vector{
	@Override
	public void remove(int indx){
		System.out.println("remove from Stack"+indx);
	}
	public void isEmpty(){
		System.out.println("isEmpty from Stack");
	}
}
abstract class Vector implements List , RandomAccess{
	public void forEach(){
		System.out.println("forEach from Vector");
	}
	public void add(int ele){
		System.out.println("add from Vector");
	}
	
}
class ArrayList implements List , RandomAccess{
	public void forEach(){
		System.out.println("forEach from ArrayList");
	}
	public void add(int ele){
		System.out.println("add from ArrayList");
	}
	public void remove(int indx){
		System.out.println("remove from ArrayList"+indx);
	}
	public void isEmpty(){
		System.out.println("isEmpty from ArrayList");
	}
}
class LinkedList implements List , Deque{
	public void forEach(){
		System.out.println("forEach from LinkedList");
	}
	public void add(int ele){
		System.out.println("add from LinkedList");
	}
	public void remove(int indx){
		System.out.println("remove from LinkedList"+indx);
	}
	public void isEmpty(){
		System.out.println("isEmpty from LinkedList");
	}
	public void offer(){
		System.out.println("offer from LinkedList");
	}
	public void poll(){
		System.out.println("poll from LinkedList");
	}
}
class PriorityQueue implements Queue{
	public void forEach(){
		System.out.println("forEach from PriorityQueue");
	}
	public void add(int ele){
		System.out.println("add from PriorityQueue");
	}
	public void remove(int indx){
		System.out.println("remove from PriorityQueue"+indx);
	}
	public void isEmpty(){
		System.out.println("isEmpty from PriorityQueue");
	}
	public void offer(){
		System.out.println("offer from PriorityQueue");
	}
	public void poll(){
		System.out.println("poll from PriorityQueue");
	}

}
class ArrayDeque implements Deque{
	public void forEach(){
		System.out.println("forEach from ArrayDeque");
	}
	public void add(int ele){
		System.out.println("add from ArrayDeque");
	}
	public void remove(int indx){
		System.out.println("remove from ArrayDeque"+indx);
	}
	public void isEmpty(){
		System.out.println("isEmpty from ArrayDeque");
	}
	public void offer(){
		System.out.println("offer from ArrayDeque");
	}
	public void poll(){
		System.out.println("poll from ArrayDeque");
	}
}



class InterfaceExample2{
	public static void main(String[] args) {
		Stack obj1 = new Stack();
		obj1.forEach();
		obj1.add(9);
		obj1.remove(1);
		obj1.isEmpty();
	   System.out.println("_______________________________");

		ArrayList obj2 = new ArrayList();
		obj2.forEach();
		obj2.add(12);
		obj2.remove(13);
		obj2.isEmpty();

		System.out.println("_______________________________");

		LinkedList obj3 = new LinkedList();
		obj3.forEach();
		obj3.add(1);
		obj3.remove(23);
		obj3.isEmpty();
		obj3.offer();
		obj3.poll();
		System.out.println("_______________________________");

		ArrayDeque obj4 = new ArrayDeque();
		obj4.forEach();
		obj4.add(3);
		obj4.remove(22);
		obj4.isEmpty();
		obj4.offer();
		obj4.poll();

		System.out.println("_______________________________");
		PriorityQueue obj5 = new PriorityQueue();
		obj5.forEach();
		obj5.add(12);
		obj5.remove(24);
		obj5.isEmpty();
		obj5.offer();
		obj5.poll();

	}
}



// OUTPUT : 

// D:\java>javac InterfaceExample2.java

// D:\java>java InterfaceExample2
// forEach from Vector
// add from Vector
// remove from Stack1
// isEmpty from Stack
// _______________________________
// forEach from ArrayList
// add from ArrayList
// remove from ArrayList13
// isEmpty from ArrayList
// _______________________________
// forEach from LinkedList
// add from LinkedList
// remove from LinkedList23
// isEmpty from LinkedList
// offer from LinkedList
// poll from LinkedList
// _______________________________
// forEach from ArrayDeque
// add from ArrayDeque
// remove from ArrayDeque22
// isEmpty from ArrayDeque
// offer from ArrayDeque
// poll from ArrayDeque
// _______________________________
// forEach from PriorityQueue
// add from PriorityQueue
// remove from PriorityQueue24
// isEmpty from PriorityQueue
// offer from PriorityQueue
// poll from PriorityQueue
