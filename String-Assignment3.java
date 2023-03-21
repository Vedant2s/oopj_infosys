class Tester {
    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly
	    String b="",c="";
	    int a=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)==' '||i==str.length()-1){
	            for(int c1=i-1;c1>=a;c1--){
	                if(c1==i-1)
	                b=String.valueOf(str.charAt(c1));
	                else
	                b=b+str.charAt(c1);
	                if(c1==a)
	                b=b+str.charAt(i);
	            }
	            c=c.concat(b);
	            a=i+1;
	        }
	    }
        return c;
	}
	
	public static void main(String args[]){
	    String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
	}
}
