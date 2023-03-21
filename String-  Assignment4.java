class Tester {

	public static int findHighestOccurrence(String str){
		//Implement your code here and change the return value accordingly
		int a=0,count=0;
		for(int i=0;i<str.length();i++){
		    for(int p=0;p<str.length();p++){
		        if(str.charAt(i)==str.charAt(p))
		        count++;
		    }
		    if(a<count)
		    a=count;
		    count=0;
		}
        return a;
	}
	
	public static void main(String args[]){
	    String str = "success";
	    System.out.println(findHighestOccurrence(str));
	}
}
