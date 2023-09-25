interface one
 {
    public void getone();
 }

interface two extends one
 {
    public void gettwo();
 }




class sample 
 {
   String name;
    sample()
	{
	  name="sivam";
	}
 }

class sample1 extends sample implements two
 {
    sample1()
	{
	   name="Sathishsivam";
	}
    @Override
    public void getone()
	{
	   System.out.println("Name="+name);
	}

    public void gettwo()
	{
	  System.out.println(name+"@"+"gmail.com");
	}
 }

class demointerface
 {
   public static void main(String asd[])
	{
	   sample1 obj=new sample1();
	   obj.getone();
	   obj.gettwo();	  
	}
 }