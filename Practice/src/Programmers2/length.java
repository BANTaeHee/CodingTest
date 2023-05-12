package Programmers2;

public class length {
	public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        
        for(int i = 0; i < strlist.length; i++ ) {
        	answer[i] = strlist[i].length();
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		System.out.println(solution(strlist));
	}
}
