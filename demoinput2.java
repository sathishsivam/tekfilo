import java.io.*;


class sample
 {
   DataInputStream din=new DataInputStream(System.in);

   sample()
	{
	  try{
		  int x=Integer.valueOf(din.readLine()).intValue();
		  int y=Integer.valueOf(din.readLine()).intValue();
	          int z=Integer.parseInt(din.readLine());
	          int sum=x+y+z;
                  System.out.println("Addition="+sum);
	    }catch(Exception d){}
	}
 }


class demoinput2
 {
    public static void main(String adas[])
	{
	   sample obj=new sample();
	}
 }