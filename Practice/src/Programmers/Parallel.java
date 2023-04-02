package Programmers;

import java.util.Arrays;

public class Parallel {
	public static int solution(int[][] dots) {
        int answer = 0;
        float[] m_line = new float[6];		// 기울기를 담을 배열 생성
        int idx = 0;
        
        for (int i = 0; i < dots.length-1; i++) {
        	for(int j = i + 1; j < dots.length; j++) {
        		
        		float x = dots[i][0] - dots[j][0];
        		float y = dots[i][1] - dots[j][1];
        		
        		m_line[idx] = y / x;
        		idx++;
        	}
        }
        // System.out.println(Arrays.toString(m_line));
       
        for (int i = 0; i < m_line.length-1; i++) {
        	for(int j = i + 1; j < m_line.length; j++) {
        		if(m_line[i] == m_line[j])
        			return 1;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int [][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
		System.out.println(solution(dots));
	}
}
