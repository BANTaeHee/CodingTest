package Programmers2;

public class String_replace {
	public static String solution(String rny_string) {
        String answer = "";
        answer = rny_string.replace("m", "rn");
        return answer;
    }
	public static void main(String[] args) {
		String rny_string = "programmers";
		System.out.println(solution(rny_string));
	}
}
