class sample 
 {
    public void getdata()
	{
	  System.out.println("method1");
	}
    public void getdata(int x,int y)
	{
	  System.out.println("method2");
	}
    public void getdata(float x,float y)
	{
	  System.out.println("method3");
	}
 }

class demoover
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.getdata(10.0f,12.3f);
	}
 }


// method overloading 

// A class may have several methods all the methods sharing the same name but differs with parameter



 