package Programmers;

public class NextNum {
	public static int solution(int[] common) {
        int answer = 0;
        
        if (common[1]-common[0] == common[2]-common[1]) {	// 등차수열의 조건
        	// 주어진 등차수열에서 마지막 수와 공차를 더한 값
        	answer = common[common.length-1] + (common[1]-common[0]);
        }
        if (common[1]/common[0] == common[2]/common[1]) {	// 등비수열의 조건
        	// 주어진 등비수열에서 마지막 수와 공비를 더한 값
        	answer = common[common.length-1] * (common[1]/common[0]);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] common = {1, 2, 3, 4};
		System.out.println(solution(common));
	}
}
