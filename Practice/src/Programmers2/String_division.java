package Programmers2;

import java.util.Arrays;

public class String_division {
	public static String[] solution(String my_string) {
        
		String[] answer = my_string.split(" ");
        // System.out.println(Arrays.toString(answer));
        return answer;
    }
	public static void main(String[] args) {
		String my_string = "i love you";
		System.out.println(solution(my_string));
	}
}
