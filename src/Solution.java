import java.lang.reflect.Array;

public class Solution {
	public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        int l = chars.length;
        char[] reverseChars = new char[l];
        for(int j = 0; j < l; j++ ){
        	reverseChars[l-1-j] = chars[j];
        }
       
        String reverseS = new String(reverseChars);
        
        return reverseS;
    }
	
	public static void main(String args[]){
		String s = "hello";
		System.out.println(reverseString(s));
	}

}
