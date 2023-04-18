package Programmers;

import java.util.Arrays;

public class UpperLower {
	public static String solution(String my_string) {
        String answer = "";
        // String[] word = my_string.split("");
        // System.out.println(Arrays.toString(word));
        for(int i = 0; i < my_string.length(); i++) {
        	char word = my_string.charAt(i);
        	if((word >= 97) && (word <= 122)) {
        		answer += String.valueOf(word).toUpperCase();
        		//System.out.println(answer);
        	} else {
        		answer += String.valueOf(word).toLowerCase();
        		//System.out.println(answer);
        	}
        }
        //System.out.println(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		String my_string = "abCdEfghIJ";
		System.out.println(solution(my_string));
	}
}
