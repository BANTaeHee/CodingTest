package Programmers2;

public class String_N {
	
	public static String solution(String my_string, int n) {
        String answer = "";
        
        answer = my_string.substring(0, n);
        
        return answer;
    }
	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		System.out.println(solution(my_string, n));
	}
}



