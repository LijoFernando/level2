package extest;
import java.util.Scanner;
public class TextEx2 {
	public static void main(String[] args) {
		System.out.println("Enter the string 1 & 2:");
		Scanner scr = new Scanner(System.in);
		String str1 = scr.nextLine();
		String str2 = scr.nextLine();
		String print1="";
		String print2="";
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(i)) {
				if(print1!=""){
					System.out.println(print1+","+print2);
					print1="";
					print2="";
				}
			}
			else{
				print1 = print1 + str1.charAt(i);
				print2 = print2 + str2.charAt(i);
			}
		}
	}
}



