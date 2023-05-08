package Programmers2;

public class Practice {
	public static int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
	public static void main(String[] args) {
		String n_str = "8542";
		System.out.println(solution(n_str));
	}
}
