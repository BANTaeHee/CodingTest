package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 1. 빈도수가 1인것 찾기 
 * 2. 해당하는 것을 answer 에 추가
 */

public class FrequencyWord {
	
	public static String solution(String s) {
        String answer = "";
        String answer1 = "";
        // 주어진 문자열 s를 split을 이용해 문자열 배열 arr에 저장.
        String[] arr = s.split("");	 
        // 문자열 배열 arr을 list 형식으로 word에 저장(Collections.frequency를 사용하기 위해)
        ArrayList<String> word = new ArrayList<>(Arrays.asList(arr));
        // System.out.println(word);- [a, b, c, a, b, c, a, d, c, h]으로 출력.
        for (int i = 0; i < word.size(); i++) {	// 인덱스 별로 빈도 수를 구하기
        	// list 형식 word에 word.get(i) 해당 i번째 인덱스의 빈도 수 구하기
        	int freq = Collections.frequency(word, word.get(i));
        	//System.out.println(freq);
        	if(freq == 1) {	// 인덱스 별 빈도 수를 구하고 빈도 수가 1인 경우 {}를 실행
        		//System.out.println(list.get(i));
        		answer += word.get(i);	// 빈도 수 가 1인 해당 인덱스 값을 answer에 저장 
        	}
        }
        String[] array = answer.split(""); // answer를 array 배열로 변환
        Arrays.sort(array);	// 배열 array를 오름차순으로 정렬
        //System.out.println(Arrays.toString(array));
        //answer = Arrays.toString(array);
        for (int i = 0 ; i < array.length; i++) {
        	answer1 += array[i];	// 배열 array를 answer1 문자열에 담기
        }
        return answer1;
    }
	
	public static void main(String[] args) {
		
		String s = "abcabcadch";
		
		System.out.println(solution(s));
	}
}
