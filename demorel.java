import java.io.*;

class sample
 {
   DataInputStream din=new DataInputStream(System.in);  
   public void getdata()
	{
	  try{ 
		 int x=Integer.valueOf(din.readLine()).intValue();
		 int y=Integer.valueOf(din.readLine()).intValue();

		 if(x<y)
		  {
	             System.out.println("x is less than y");
		  }
	
	     }catch(Exception d){}
	
	
	}
 }


class demorel
 {
   public static void main(String asd[])
	{
	    new sample().getdata();
	}
 }