import java.util.Arrays;
import java.util.*;

interface UserCollection {
	void display();
	void add(int ele);
	int remove();
}
interface UserList extends UserCollection{

}
class UserStack implements UserList{
	private int [] arr;
	int indx = 0;
	public UserStack(){
		arr = new int[10];
	}
	@Override
	public void display(){
		if(indx == 0){
			System.out.println("[]");
		}
		else{
			String op = "[";
			int i = 0;
			for(; i<indx-1 ; i++)
			{
				op += arr[i]+", ";
			}
			op += arr[i]+"]";
			System.out.println(op);
		}
	}
	@Override
	public void add(int ele){
		arr[indx] = ele;
		indx++;
	}

	@Override
	public int remove(){
		int temp = arr[indx - 1];

		arr[indx - 1] = 0;
		indx--;
		return temp;
	}
}
interface UserQueue extends UserCollection{

}
class UserPriorityQueue implements UserQueue{
	private int [] arr;
	int indx = 0;
	public UserPriorityQueue(){
		arr = new int[10];
	}
	@Override
	public void display(){
		if(indx == 0){
			System.out.println("[]");
		}
		else{
			String op = "[";
			int i = 0;
			for(; i<indx-1 ; i++)
			{
				op += arr[i]+", ";
			}
			op += arr[i]+"]";
			System.out.println(op);
		}
	}
	@Override
	public void add(int ele){
		arr[indx] = ele;
		indx++;
	}

	@Override
	public int remove(){
		int temp = arr[0];
		for(int i = 1 ; i<indx ; i++){
			arr[i-1] = arr[i];
		}

		arr[indx - 1] = 0;
		indx--;
		return temp;
	}

}
class InterfaceExample1{
	public static void main(String[] args) {
		UserStack obj = new UserStack();
		obj.display();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.display();
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		obj.display();

        System.out.println("________________________________________");

        UserPriorityQueue pq = new UserPriorityQueue();
        pq.display();
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.display();
        System.out.println(pq.remove());
        pq.display();

        PriorityQueue obj1 = new PriorityQueue();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        System.out.println(obj1);
        System.out.println(obj1.remove());
        System.out.println(obj1.remove());
        System.out.println(obj1);
	}
}
