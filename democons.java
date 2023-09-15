class sample
 {
    sample()   // constructor
	{
	  System.out.println("am from constructor");
	 
	}
 }


class sample1
 {
   sample1()
	{
	    System.out.println("am from sample1 cons");
	}
 }


class democons
 {
    public static void main(String aasd[])
	{
	   sample obj1=new sample();
	   sample1 obj2=new sample1();
	}
 }

	/*
		constructors
			share the same name of the class
			constructors are not return anything
			constructors are automatically called during the creation of object
	*/
