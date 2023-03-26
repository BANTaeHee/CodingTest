package Programmers;

import java.util.ArrayList;

public class Divisor {

	public static ArrayList<Integer> solution11(int n) {
//        int[] answer = {};
        int idx = 0;
		ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                idx++;			// 인덱스 값만 증가시켜 약수의 개수 파악.(idx+1)
                answer.add(i);
            }
            
        }
        
//        for (int j = 0; j < idx; j++) {
//        	
//        	answer[j] = ;
//        }
        
//        System.out.println(Arrays.toString(answer));
        System.out.println(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		solution11(12);
	}
}
 