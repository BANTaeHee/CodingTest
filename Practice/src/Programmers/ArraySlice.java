package Programmers;

public class ArraySlice {

	public static int[] solution(int n, long left, long right) {
       
		int[] answer = new int[(int) (right-left+1)];	//  출력하는 배열의 개수 
        
//		long row = left/n + 1;		// 주어진 left에서 시작하는(행,열)
//		long col = left%n + 1;
        
		for (int i = 0; i<answer.length; i++) {
			int matrix = Math.max((int)(left+i)/n +1, (int)(left+i)%n +1);
			
			answer[i] = matrix;
		}
		
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(4, 5, 10));
	}
}
