import java.io.DataInputStream;

class demo
 {  
    DataInputStream din=new DataInputStream(System.in);

    demo()
	{

	    try{
		  System.out.println("Enter the name");
 		  din.readLine();
		  System.out.println("Enter the age");
		 int x=Integer.valueOf(din.readLine()).intValue();	
		 int y=Integer.valueOf(din.readLine()).intValue();
	     }catch(Exception d){}
	  
	   
	}
 }


class demoinput1
 {
    public static void main(String asd[])
	{
	   demo obj=new demo();
	}
 }