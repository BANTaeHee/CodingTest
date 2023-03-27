package Programmers;

public class FindNum {
	public int solution(int num, int k) {
        // 주어진 매개변수 int를 String으로 변경
        String s_num = Integer.toString(num);
        String s_k = Integer.toString(k);
        
        if (s_num.indexOf(s_k) == -1) {
        	return -1;
        } else {
        	return s_num.indexOf(s_k)+1;
        }
        
    }
}
