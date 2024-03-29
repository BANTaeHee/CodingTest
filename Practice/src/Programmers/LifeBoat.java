 package Programmers;

import java.util.Arrays;

public class LifeBoat {

	public int solution8(int[] people, int limit) {
		int answer = 0;
		
		Arrays.sort(people);
		
		int m = 0;		// 정렬된 배열에서 가장 작은 값
		
		// 가장 큰 수부터 차례대로 내려와서 가장 작은 m까지 반복
		for (int i = people.length-1; i <= people[m]; i--) {
			// 가장 큰 수와 가장 작은 수를 더해서 limit보다 작으면
			if (i + people[m] <= limit) {
				answer++; m++;		// 보트의 수 answer가 1 증가, 최소의 인덱스m이 증가.
			} else {
				answer++;
				// limit 보다 큰 경우 최소 m은 유지하되, 가장 큰 수만 보트에 태우므로 answer가 1 증가
			}
		}
		
        return answer;
	}
  
}