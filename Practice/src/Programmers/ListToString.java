package Programmers;

public class ListToString {

	public static String solution(String[] arr) {
        String answer = String.join("", arr);
        
        return answer;
    }
	public static void main(String[] args) {
		String[] arr = {"a", "b", "c"};
		System.out.println(solution(arr));
	}

}
