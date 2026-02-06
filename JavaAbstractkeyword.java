
import java.util.Scanner;
class B extends A {
 
  @Override
   public void m1(int p, int q) {
      prod = p*q;
   }
}
class Solution{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        B obj = new B();
        obj.m1(p,q);
    }
}

//OUTPUT
// Example:
// Input:
// 2
// 9 2
// 8 4

// Output:
// 18
// 32
 

