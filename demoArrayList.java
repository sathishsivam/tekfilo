import java.util.*;

class sample
 { 
    ArrayList a1=new ArrayList();

    sample()
	{
	   a1.add("pravin");
	   a1.add("Suraj");
	   a1.add("Hari");
	   a1.add("Dinesh");
	   a1.add("MOhan");
	   a1.add("Saravanan");

	   Iterator itr=a1.iterator();	   
	
	    while(itr.hasNext())
		{
		   System.out.println(itr.next());
		}

	}
 }


class demoArrayList
  {
     public static void main(String asd[])
	{
	    new sample(); 
	}
 }