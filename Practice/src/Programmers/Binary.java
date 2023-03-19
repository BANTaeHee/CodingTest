package Programmers;

import java.util.Arrays;

public class Binary {
	public static int[] solution(String s) {
        int[] answer = new int[2];	// 길이가 2인 배열 생성[반복수, 0 제거 횟수 ]
        
        while(!s.equals("1")) {		// s가 1이 될 때까지 반복
        	answer[0]++;
        	// 문자열에 0을 제거하기위해 문자 대체하기
        	String x_new = s.replaceAll("[0]","");	
        	// System.out.println(x_new);
        	// 0을 제거한 횟수 del_zero 생성
        	int del_zero = s.length() - x_new.length();
        	answer[1] += del_zero;	// 0 제거 횟수 누적
        	s = Integer.toBinaryString(x_new.length()).toString();
        }
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
	public static void main(String[] args) {
		String s = "110010101001";
		System.out.println(solution(s));
	}
}
