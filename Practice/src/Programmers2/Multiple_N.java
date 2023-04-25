package Programmers2;

public class Multiple_N {

	public static int solution(int num, int n) {
        int answer = 0;
        
        if (num % n == 0) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
		int num = 98;
		int n = 2;
		
		System.out.println(solution(num, n));
	}
}
