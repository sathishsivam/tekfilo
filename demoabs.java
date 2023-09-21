abstract class sample
 {
    sample()
	{

	}

    public void getdata() // method definition
	{

	}
   abstract public void getdata1(int x,int y);  // method declaration
 }

class sample1 extends sample
 {

   sample1()
	{

	}
    @Override
    public void getdata1(int x,int y)
	{
	 System.out.println(x+y);
	 System.out.println(x-y);
	 System.out.println(x*y);
	 System.out.println(x/y);

	}

 }

class demoabs
 {
   public static void main(String asd[])
	{
	    sample1 obj=new sample1();
	    obj.getdata1(100,20);
	}
 }