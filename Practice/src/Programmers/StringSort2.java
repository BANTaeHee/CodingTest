package Programmers;

import java.util.Arrays;

public class StringSort2 {
	public static String solution(String my_string) {
        String answer = "";
        String w_string = my_string.toLowerCase();
        
        // System.out.println(w_string);
        char[] charArr = w_string.toCharArray();	//String to Char Array
        Arrays.sort(charArr);			//Char Array 알파벳 순 정렬
        // System.out.println(charArr);
        // Char Array to String
        String result = new String(charArr);	// 또는 String.valueOf(charArr)	
        return result;
    }
	public static void main(String[] args) {
		String my_string = "Bcad";
		System.out.println(solution(my_string));
	}
}
