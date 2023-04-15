package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CloserNum {

	public static int solution(int[] array, int n) {
        //int answer = 0;
        int min = 100;
        
    	for (int i = 0; i < array.length; i++) {
    		if (Math.abs(array[i]-n) < min) {
        		min = Math.abs(array[i]-n);
        	}
    	}
    	
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        
    	for (int i = 0; i < array.length; i++) {
        	if (Math.abs(array[i]-n) == min) {
        		arr.add(array[i]);
        	}
        }
        System.out.println(arr);
        Collections.sort(arr);
        
        return arr.get(0);
    }
	
	public static void main(String[] args) {
		int[] array = {3, 30, 31, 10};
		int n = 20;
		System.out.println(solution(array, n));
	}
}
