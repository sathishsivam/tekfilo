class sample
 {
   sample()
	{

	}
  
    public void getdata(int x,int y)
	{
	  System.out.println("Inside super clasS"+(x+y));
	}

 }

class sample1 extends sample
 {
    sample1()
	{
	
	}
    public void getdata(int x,int y)
	{
	  System.out.println("Inside derived clasS"+(x*y));
	}
 }

class demooverride1
 {
    public static void main(String asd[])
	{
	   sample ref;   
	   sample obj1=new sample();
	   sample1 obj2=new sample1();
	   ref=obj2;
	   ref.getdata(10,12);
	  
	}
 }
  
/*  
 Method overridding 
 A method in the derived class sharing the same name and typesignature of the 
	method in the super class then we call the method in the derived class override 
	the methiod in the base class


	this is what inform how java supports runtime polymorphism
	Dynamic Method Dispatch
*/

