@FunctionalInterface
interface Demo{
	boolean isPalindrome(String str);
}

class PalindromeString{
	public static void main(String[] args) {
		Demo obj = str -> {
			String res = "";
			for(int i = 0; i<=str.length()-1;i++){
				res = res + str.charAt(i);
			}
			return str.equals(res);
		};
        System.out.println(obj.isPalindrome("Madam"));
	} 
}

//OUTPUT
// D:\java>javac PalindromeString.java

// D:\java>java PalindromeString
// true
