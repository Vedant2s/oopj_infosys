import java.util.*;
class Tester{
    
    public static String moveSpecialCharacters(String str){
		//Implement your code here and change the return value accordingly
		String a=null,c=null;
		int b=0,d=0;
		for(int i=0;i<str.length();i++){
		if(!Character.isLetter(str.charAt(i)))
		{
		if(b==0)
	    {a = String.valueOf(str.charAt(i));
	    //System.out.println(a);
	    }
		else
		{a=a+str.charAt(i);
		   // System.out.println(a);
		}
		b++;
		}
		else{
		if(d==0)
		c= String.valueOf(str.charAt(i));
		else
		c=c+str.charAt(i);
		d++;
		}
		}
		//System.out.println(a+c);
		if(a!=null&&c!=null)
		str=c.concat(a);
		else if(a==null)
		str=c;
		else if(c==null)
		str=a;
        return str;
	}
	
	public static void main(String args[]){
	    String str = "He@#$llo!*&";
	    System.out.println(moveSpecialCharacters(str));
	}
	
}
