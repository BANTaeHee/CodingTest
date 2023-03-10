package Programmers;

public class SquareNum {
	public static int solution(int n) {
        int answer = 0;
        int cnt = 0;	// 약수의 개수
        
        for (int i = 1; i <= n; i++ ) {
        	if (n % i == 0) {
        		cnt++;
        	}
        	if (cnt % 2 == 0 ) {
        		answer = 2;
        	} else {
        		answer = 1;
        	}
        }
        
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(25));
	}
	
}
