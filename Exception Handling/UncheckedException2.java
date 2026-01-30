// Types of RuntimeException
// 2.IndexOutOfBoundsException

class UncheckedException2{
	public static void main(String[] args) {
		String str = "abcdefghijklmn";
		for (int i = 0; ;i++ ) {
			char ch = ' ';
			try{
			ch = str.charAt(i);
		    }catch(IndexOutOfBoundsException e){
		    	break;
		    }
			System.out.println(ch);
		}
	}
	
}
