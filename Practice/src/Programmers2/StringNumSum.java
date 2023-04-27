
package Programmers2;

public class StringNumSum {
	
	public static int solution(String num_str) {
        int answer = 0;
        String[] num = num_str.split("");
        for(int i = 0; i < num_str.length(); i++) {
        	answer += Integer.parseInt(num[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		String num_str = "123456789";
		System.out.println(solution(num_str));
	}
}










