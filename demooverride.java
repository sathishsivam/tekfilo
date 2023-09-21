class sample
 {
   sample()
	{

	}
    public void getdata(String str)
	{
	  System.out.println("Inside super clasS");
	}

 }

class sample1 extends sample
 {
    sample1()
	{

	}
    public void getdata(String str)
	{
	  System.out.println("Inside derived clasS");
	}
 }

class demooverride
 {
    public static void main(String asd[])
	{
	   sample obj1=new sample();
	   obj1.getdata("Suraj");
	   sample1 obj=new sample1();
	   obj.getdata("sivam");
	}
 }
  
/*  
 Method overridding 
 A method in the derived class sharing the same name and typesignature of the 
	method in the super class then we call the method in the derived class override 
	the methiod in the base class

*/

