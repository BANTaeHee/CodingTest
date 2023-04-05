package Programmers;

public class CutPaper {

	public int solution(int M, int N) {
       
		int answer = (M-1) + M * (N-1);			// M은 가로, N은 세로
        
        return answer;
    }

}
