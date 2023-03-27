package Programmers;

import java.util.ArrayList;

public class MultipleOfN {
	public static int[] solution(int n, int[] numlist) {
        int[] answer = {};
        ArrayList<Integer> multiple = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++) {
        	if (numlist[i] % n == 0) {
        		multiple.add(numlist[i]);
        	}
        }
        // System.out.println(multiple);
        answer = multiple.stream().mapToInt(i->i).toArray();
        return answer;
    }
	public static void main(String[] args) {
		int n = 3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		System.out.println(solution(n, numlist));
	}
}
