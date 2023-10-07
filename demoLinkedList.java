import java.util.*;

class sample
 { 
    LinkedList a1=new LinkedList();

    sample()
	{
	   a1.add("pravin");
	   a1.add("Suraj");
	   a1.add("Hari");
	   a1.add("Dinesh");
	   a1.add("MOhan");
	   a1.add("Saravanan");


		
	   a1.set(0,"Sathishsivam");
	   System.out.println("Peek Element"+a1.peek());

	   Iterator itr=a1.iterator();	   
	
	    while(itr.hasNext())
		{
		   System.out.println(itr.next());
		}

	}
 }


class demoLinkedList
  {
     public static void main(String asd[])
	{
	    new sample(); 
	}
 }