package Programmers;

public class MaxMin {
	
	public String solution(String s) {
		String answer = "";
		String[] arr = s.split(" ");	// 빈칸을 기준으로 비교
		int[] nums = new int[arr.length];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
				
		for (int i=0; i < arr.length; i++) {
			nums[i] = Integer.parseInt(arr[i]);
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		answer = min+" "+max;
		
		return answer;
	} 
}
