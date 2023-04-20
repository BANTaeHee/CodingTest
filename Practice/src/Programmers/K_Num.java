package Programmers;

public class K_Num {
	public static int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int x = i; x <= j; x++) {
        	String num = Integer.toString(x);
        	// System.out.println(num);
        	System.out.println("a :" + num.length());
        	for (int y = 0; y < num.length(); y++) {
        		if (Integer.toString(k).equals(num.substring(y,y+1))) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int i = 1;
		int j = 13;
		int k = 1;
		
		System.out.println(solution(i, j, k));
	}
}
