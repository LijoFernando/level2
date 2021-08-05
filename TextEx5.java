package extest;
import java.util.*;
public class TextEx5 {
		  int childCount = 0;
		  void printCount(String grandfather) {
	          System.out.println("GrandFather ("+grandfather+") has "+childCount+" grandchild");
	      }
	      void count(String fatherArray[], String findFather) {
	          for(int i=0;i<fatherArray.length;i++) {
	              if(findFather.equals(fatherArray[i]))
	                  childCount++;
	          }
	      }
	      void checkChild(String childArray[], String fatherArray[], String data) {
	      	  int fatherCount = 0;
	          for(int i=0; i<fatherArray.length; i++) {
	              if(data.equals(fatherArray[i])) {
	              	fatherCount = 1;
	                count(fatherArray, childArray[i]);
	              }
	          }
	      }
		
	      public static void main(String args[]) {
	          Scanner input = new Scanner(System.in);
	          TextEx5 obj = new TextEx5();
			  System.out.print("Enter number of data: ");
	          int n = input.nextInt();
	          String childArray[] = new String[n];
	          String fatherArray[] = new String[n];
			  System.out.println("Enter child and father like: childname fathername");
	          for(int i=0; i<n; i++) {
				  childArray[i] = input.next();
	              fatherArray[i] = input.next();
	          }input.nextLine();
			  System.out.println("Enter grand father name: ");
			  String data = input.nextLine();
	          obj.checkChild(childArray, fatherArray, data);
	          obj.printCount(data);
	      }
}
