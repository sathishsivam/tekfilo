class sample
 {
    sample(String name,int age,boolean y)
	{
	   System.out.println("Welcome"+name);
	   if(age>18)
	    {
	       if(y==true)
		{
		       System.out.println("You are Eligible to vote");
		}
	       else
		{
		   System.out.println("submit your id card");	
		}
	    }		
	   else
	    {
	       System.out.println("Not eligible to vote");
	    }   	     

	}
 }


class demorel3
 {
   public static void main(String asd[])
	{
	    new sample("Hari",22,false);
	}
 }