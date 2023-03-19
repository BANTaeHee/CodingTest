package Programmers;

public class MinRectangle2 {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int w_max = 0;
        int h_min = 0;
        
        for (int i = 0; i < sizes.length; i++) {
        	int w = Math.max(sizes[i][0], sizes[i][1]);
        	int h = Math.min(sizes[i][0], sizes[i][1]);
        	
        	w_max = Math.max(w_max, w);
        	h_min = Math.max(h_min, h);
        }
//        System.out.println(w_max);
//        System.out.println(h_min);
        return w_max * h_min;
    }
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30},{80, 40}};
		System.out.println(solution(sizes));
	}
}
