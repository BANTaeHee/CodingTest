package Programmers;

import java.util.Arrays;

public class Seven {
	public static int solution(int[] array) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
        	String num = Integer.toString(array[i]);
        	String[] n_arr = num.split("");
        	// System.out.println(Arrays.toString(n_arr));
        	for (int j = 0; j < n_arr.length; j++) {
        		if (n_arr[j].equals("7")) {
        			answer++;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		System.out.println(solution(array));
	}
}
