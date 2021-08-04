package extest;
import java.util.*;
public class TextEx5 {

	
	       int childCount=0;
	      void printCount()
	      {
	          System.out.println(childCount);
	      }
	       void count(String fatherArray[],String findFather)
	      { 
	          for(int i=0;i<fatherArray.length;i++)
	          {
	              if(findFather.equals(fatherArray[i]))
	                  childCount++;
	          }
	      }
	      void checkChild(String childArray[],String fatherArray[],String data)
	      {  int fatherCount=0;
	          for(int i=0;i<fatherArray.length;i++)
	          {
	              if(data.equals(fatherArray[i]))
	              {   fatherCount=1;
	                  count(fatherArray,childArray[i]);
	              }
	          }
	      }
		
	      public static void main(String args[])
	      {
	          Scanner input=new Scanner(System.in);
	          TextEx5 obj=new TextEx5();
	          int n=input.nextInt();
	          String childArray[]=new String[n];
	          String fatherArray[]=new String[n];
	          for(int i=0;i<n;i++)
	          {
	             
	              childArray[i]=input.next();
	              fatherArray[i]=input.next();
	          }input.nextLine();
	                  String data="";
	                  data=input.nextLine();
	          obj.checkChild(childArray, fatherArray, data);
	          obj.printCount();
	      }
	   
	}
