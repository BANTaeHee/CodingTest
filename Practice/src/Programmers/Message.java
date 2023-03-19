package Programmers;

public class Message {
	public static int solution(String message) {
        int answer = 0;
        
        int m_length = message.length();
        answer = m_length * 2;
        //System.out.println(m_length);
        return answer;
    }
	public static void main(String[] args) {
		String message = "happy Birthday!";
		System.out.println(solution(message));
	}
}
