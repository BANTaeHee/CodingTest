package Programmers;

public class StringPush {
	public static int solution(String A, String B) {
        int answer = 0;
        
        for (int i = 0; i < A.length(); i++) {
        	if (A.equals(B)) {
        		return answer;
        	}
        	String a = A.substring(A.length() -1);
        	A = a + A.substring(0,A.length() - 1);
        	answer++;
//        	System.out.println(answer);
        }
        return -1;
    }
	
	public static void main(String[] args) {
		String A = "Hello";
		String B = "loHel";
		System.out.println(solution(A, B));
	}
}
