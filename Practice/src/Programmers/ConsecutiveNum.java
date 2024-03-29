package Programmers;

import java.util.Arrays;

public class ConsecutiveNum {
	public static int[] solution(int num, int total) {
        
		int[] answer = new int[num];	// 배열 answer 생성
        int sum = 0;
        int start = 0;
        
        for (int i = 1; i < num; i++) {
        	sum += i;
        }
        // 첫번째 항을 구하는 식
        start = (total - sum) / num;
        // answer 배열에 반복문을 통하여 배열에 요소 추가.
        for (int j = 0; j < num; j++) {
        	answer[j] = start + j;
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
	public static void main(String[] args) {
		int num = 3;
		int total = 12;
		System.out.println(solution(3, 12));
	}
}
