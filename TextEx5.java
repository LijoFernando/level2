package extest;
import java.util.*;
public class TextEx5 {

	
	       int c=0;
	      void print()
	      {
	          System.out.println(c);
	      }
	       void count(String f[],String k)
	      { 
	          for(int i=0;i<f.length;i++)
	          {
	              if(k.equals(f[i]))
	                  c++;
	          }
	      }
	      void check(String c[],String f[],String r)
	      {  int k=0;
	          for(int i=0;i<f.length;i++)
	          {
	              if(r.equals(f[i]))
	              {   k=1;
	                  count(f,c[i]);
	              }
	          }
	      }
		
	      public static void main(String args[])
	      {
	          Scanner s=new Scanner(System.in);
	          TextEx5 ob=new TextEx5();
	          int n=s.nextInt();
	          String c[]=new String[n];
	          String f[]=new String[n];
	          for(int i=0;i<n;i++)
	          {
	             
	              c[i]=s.next();
	              f[i]=s.next();
	          }s.nextLine();
	                  String r="";
	                  r=s.nextLine();
	          ob.check(c, f, r);
	          ob.print();
	      }
	   
	}
