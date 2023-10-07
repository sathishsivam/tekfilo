class sample
 {
    
    sample()
	{
	  System.out.println("Welcome const");
	}

     static public void display()
	{
	   System.out.println("method");
	}
 }


class demostatic1
 {
   static  public void main(String asd[])
	{
	   sample obj=new sample();
	   sample.display();
	}
 }