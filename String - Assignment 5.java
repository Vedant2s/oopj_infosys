class Tester{
    public static String removeDuplicatesandSpaces(String str){
         // Remove white spaces from the string
        str = str.replaceAll("\\s+", "");
        
        // Remove duplicate characters
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String currentChar = Character.toString(str.charAt(i));
            if (sb.indexOf(currentChar) == -1) {
                sb.append(currentChar);
            }
        }
        
        return sb.toString();
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}
