

class Solution {
    public static int nextPrime(int n) {
        if (n < 2) return 2;

        int num = n + 1;
        while (!isPrime(num)) {
            num++;
        }
        return num;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

class NextPrimeNumber{
	public static void main(String[]args){
	Solution obj = new Solution();
	int result = obj.nextPrime(15);
	System.out.println(result);
	}
}
