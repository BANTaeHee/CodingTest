package Programmers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class StringSort1 {

	public static int[] solution(String my_string) {
        // int[] answer = {};
		ArrayList<Integer> answer = new ArrayList<>(); 
        String num = "";
        
        for (int i = 0; i < my_string.length(); i++) {
        	char str = my_string.charAt(i);
        	if (48 <= str && 57 >= str) {
        		answer.add(Integer.parseInt(String.valueOf(str)));
        	}
        }
        answer.sort(null);
        
        return answer.stream().mapToInt(i->i).toArray();
    }
	public static void main(String[] args) {
		String my_string = "p2o4i8gj2";
		System.out.println(Arrays.toString(solution(my_string)));
	}
}
