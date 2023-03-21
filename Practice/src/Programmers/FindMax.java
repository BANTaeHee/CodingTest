package Programmers;

import java.util.Arrays;

public class FindMax {
	public static int[] solution(int[] array) {
		
		int [] answer = new int [2];
        
		int max = Integer.MIN_VALUE;
        int idx = 0;
        
        for (int i = 0; i < array.length; i++) {
        	if (max < array[i]) {
        		max = array[i];
        		idx = i;
        	}
        }
        
        answer[0] = max;
        answer[1] = idx;

//        System.out.println(idx);
//        System.out.println(max);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		System.out.println(solution(array));
	}
}
