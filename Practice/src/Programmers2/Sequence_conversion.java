package Programmers2;

public class Sequence_conversion {
	public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        
        if (k % 2 != 0 ) {
        	for (int i = 0; i < arr.length; i++) {
        		answer[i] = arr[i]*k;
        	}
        } else {
        	for (int i = 0; i < arr.length; i++) {
        		answer[i] = arr[i]+k;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 100, 99, 98};
		int k = 3;
		System.out.println(solution(arr, k));
	}
}
