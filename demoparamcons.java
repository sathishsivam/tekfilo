class sample
 {
    sample(int x,int y)
	{
	   System.out.println(x+y);
	}

    sample(String str)
	{
	  System.out.println(str);
	}

    public void displaysum(int x,int y,String z)
	{
	   System.out.println(x+y);	
	   System.out.println(z);
	   System.out.println("**************");
	}

	
 }


class demoparamcons
 {
    public static void main(String asd[])
	{
	    sample obj=new sample(100,12);
	    sample obj1=new sample("sathishsivam");
	    obj.displaysum(10,11,"salem");
	}
 }