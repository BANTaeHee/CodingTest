package Programmers;

import java.util.Arrays;

public class IndexSwitch {

	public static String solution(String my_string, int num1, int num2) {
//        String answer = "";
        char[] charArr = my_string.toCharArray();

        charArr[num1] = my_string.charAt(num2);
//      System.out.println(Arrays.toString(charArr));
        charArr[num2] = my_string.charAt(num1);

//        System.out.println(Arrays.toString(charArr));
        
        return String.valueOf(charArr);
    }
	public static void main(String[] args) {
		String my_string = "I love you";
		int num1 = 3;
		int num2 = 6;
		
		System.out.println(solution(my_string, num1, num2));
	}


}
