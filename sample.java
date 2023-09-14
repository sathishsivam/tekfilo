class simple
 {
   static public void getmethod()
	{
	   System.out.println("am from simple class");
	}
 }


class sample
 {
   static public void main(String x[]) 
	{
	  simple.getmethod();
	  System.out.println(x[0]);
	  System.out.println(x[1]);
	  System.out.println(x[2]);
	}
 }

 /* 
	public access specifier any body can access

	static method can be accessed without the object 

	void inform the java compiler that the method main() does not return anything

	String args[]  this is for runtime value
  */