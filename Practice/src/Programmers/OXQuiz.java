package Programmers;

public class OXQuiz {
	public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i=0; i < quiz.length; i++) {
        	
        	String[] numarr = quiz[i].split(" ");
            
        	int x = Integer.parseInt(numarr[0]);
        	int y = Integer.parseInt(numarr[2]);
        	int z = Integer.parseInt(numarr[4]);
            
        	// System.out.println(Arrays.toString(numarr));
        	if (numarr[1].equals("+")) {
        		if(x + y == z) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        	}
        	if (numarr[1].equals("-")) {
        		if(x - y == z) {
        			answer[i] = "O";
        		}else {
        			answer[i] = "X";
        		}
        	}
        }
        return answer;
        
    }
	
	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -1"};
		System.out.println(solution(quiz));
		System.out.println(quiz);
		System.out.println(quiz.length);
		int[] arr1 = {1, 2, 3, 4};
		
	}
}
