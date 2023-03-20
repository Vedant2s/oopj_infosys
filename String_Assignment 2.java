class Tester{
    public static boolean checkPalindrome(String str){
	    //Implement your code here and change the return value accordingly
	   
	    int count=0;
	    for(int i=0;i<str.length()/2;i++){
	    if (str.charAt(i)!=str.charAt(str.length()-i-1))
	    count++;
	    }
	    if(count!=0)
        return false;
        else
        return true;
	}
	
	public static void main(String args[]){
		String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
	}
}
