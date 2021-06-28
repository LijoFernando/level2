package extest;
import java.util.Scanner;
public class TextEx3 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int r = 1;
		String str = Integer.toBinaryString(n);
		//System.out.println(str);
		for (int i = 0; i <= str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				r = 0;
				break;
			}
		}
		System.out.println(n+" binary Representation is "+str);
		if (r == 1) {
			//print yes when brinary reprenation of n is palindrome.
			System.out.println("YES");
		} else {
			//print No when brinary reprenation of n is not palindrome.
			System.out.println("NO");
		}

	}
}
