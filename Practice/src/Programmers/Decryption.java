package Programmers;

import java.util.Arrays;

public class Decryption {
	public static String solution(String cipher, int code) {
        String answer = "";
        //System.out.println(Arrays.toString(cipherArr));
        //System.out.println(cipher.charAt(code-1));
        for (int i = code-1; i < cipher.length(); i += code) {
        	answer += cipher.charAt(i);
        }
        return answer;
    }

	public static void main(String[] args) {
		String cipher = "dfjardstddetckdaccccdegk";
		int code = 4;
		System.out.println(solution(cipher, code));
	}
}
