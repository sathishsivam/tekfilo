import java.util.*;


class sample
 {
   Scanner s=new Scanner(System.in);
   sample()
	{
	  System.out.println("Enter the number");
 	  int x= s.nextInt();
	
	   if(x>0)
	    {
	     System.out.println("Positive number");
	    }
           else if(x<0) 
	    {
              System.out.println("Negative number");
            }
	   else
		{
	          System.out.println("Zero");
		}
	}
 }

class demoinputt
 { 
   public static void main(String asd[])
	{
	   sample ob=new sample();
	}
 }
  