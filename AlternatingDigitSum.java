  /*You are given a positive integer n. Each digit of n has a sign according to the following rules:

The most significant digit is assigned a positive sign.
Each other digit has an opposite sign to its adjacent digits.
Return the sum of all digits with their corresponding sign. 

 

Example 1:

Input: n = 521
Output: 4
Explanation: (+5) + (-2) + (+1) = 4.
Example 2:

Input: n = 111
Output: 1
Explanation: (+1) + (-1) + (+1) = 1.
Example 3:

Input: n = 886996
Output: 0
Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.



Code :  */

class Solution {
    public int alternateDigitSum(int n) {
        int rev = 0;
        while(n!=0){
            rev = rev*10 +  n%10;
            n /=10;
        }
     int sum = 0;
     int length = String.valueOf(rev).length();
     for(int i = 1 ; i<=length;i++){
        if(i%2==0){
            sum -=rev%10;
        }else{
            sum +=rev%10;
        }
        rev /=10;
     }
     return sum;
    }
}



