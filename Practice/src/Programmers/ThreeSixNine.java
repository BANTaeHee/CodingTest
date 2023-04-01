package Programmers;

import java.util.Arrays;
import java.util.stream.Stream;

public class ThreeSixNine {
	public static int solution(int order) {
        int answer = 0;
        int count = 0;
        int [] num = Stream.of(String.valueOf(order).split("")).mapToInt(Integer::parseInt).toArray();
        
        System.out.println(Arrays.toString(num));
        
        for(int i = 0; i < num.length; i++) {
        	if (num[i] == 3 || num[i] == 6 || num[i] == 9 ) {
        		count++;
        	}
        }
        System.out.println(count);
        return answer;
    }
	public static void main(String[] args) {
		int order = 12569843;
		System.out.println(solution(order));
	}
}
