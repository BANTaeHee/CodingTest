package Programmers;

import java.util.Arrays;

public class MinRectangle {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int[] w_array = new int[sizes.length];
        int[] h_array = new int[sizes.length];
		
        for (int i = 0; i < sizes.length; i++) {
//        	int w_max = w_array[i];
//        	int h_min = h_array[i];
        	
        	if (sizes[i][0] < sizes[i][1]) {
        		w_array[i] = sizes[i][1];
        		h_array[i] = sizes[i][0];
        	} else {
        		w_array[i] = sizes[i][0];
        		h_array[i] = sizes[i][1];
        	}
//        	w_max = Math.max(sizes[i][0], sizes[i][1]);
//        	h_min = Math.min(sizes[i][0], sizes[i][1]);
//        	w_max = w_array[i];
//        	h_min = h_array[i];
        }
        Arrays.sort(w_array);
        Arrays.sort(h_array);
        
        System.out.println(Arrays.toString(w_array));
        System.out.println(Arrays.toString(h_array));
        return w_array[w_array.length - 1] * h_array[h_array.length - 1];
    }
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30},{80, 40}};
		System.out.println(solution(sizes));
	}
}
