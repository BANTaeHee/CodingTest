package Programmers;

public class AddFraction {
	
	public static int gcd(int a, int b) {
		if (a % b == 0) {
			return b;
		}
		return gcd(b, a % b);
	}
	public int[] solution4 (int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int numer = (numer1*denom2)+(numer2*denom1);
		int denom = denom1 * denom2;
		
		int num = gcd(numer, denom);
		answer[0] = numer/num;
		answer[1] = denom/num;
		
		return answer;
	}
}
