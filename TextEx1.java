package extest;
import java.util.*;
public class TextEx1 {
	public static void main(String[] args) {
		String str1 = "";
		int[] nAry = {7,6,8};
		int[] sAry = new int[nAry.length];
		System.out.println("Input :"+Arrays.toString(nAry));
		//Calculating factors 
		for (int i = 0; i < nAry.length; i++) {

			for (int j = 1; j <= nAry[i]; ++j) {
				if (nAry[i] % j == 0) {
					str1 += Integer.toString(j);
				}
			}
			sAry[i] = Integer.parseInt(str1);
			str1 = "";
		}
		//sort the Factors Elements
		Arrays.sort(sAry);
		//Print the values in Descending Order
		for(int k=0; k<sAry.length; k++) {
			int a=sAry[k]%10;
			nAry[sAry.length-1-k]=a;
		}
		System.out.println("Output:"+Arrays.toString(nAry));
	}
}
