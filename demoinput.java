
import java.io.DataInputStream;

class demo
 {  
    DataInputStream din=new DataInputStream(System.in);

    demo()
	{
	  System.out.println("Enter the name");
	   try{	
	    din.readLine();
           }catch(Exception s){}
	}
 }


class demoinput
 {
    public static void main(String asd[])
	{
	   demo obj=new demo();
	}
 }