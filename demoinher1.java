class sample
 {
   String name;
    sample()
	{
	  
	   String city="Erode";
	   System.out.println("Name from super class"+name);
	}
 }

class sample1 
 {
   sample1()
	{
	    name="Sivam";
	    System.out.println("Name="+name);
	}
 }


class demoinher1
 {
    public static void main(String asd[])
	{
	   sample1 obj=new sample1();

	}
 }

