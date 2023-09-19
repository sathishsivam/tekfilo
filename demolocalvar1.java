class sample
 {
   sample()	// local variables
	{
	 String name="Suraj";
         int age=21;
	 String city="Ooty";
	}

    public void display()
	{
  	  System.out.println(name);
	  System.out.println(age);  
	  System.out.println(city);
	}
 }

class demolocalvar1
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();

	}
 }


/*


G:\tekfilo>javac demolocalvar1.java
demolocalvar1.java:9: error: variable name might not have been initialized
          System.out.println(name);
                             ^
demolocalvar1.java:10: error: variable age might not have been initialized
          System.out.println(age);
                             ^
demolocalvar1.java:11: error: variable city might not have been initialized
          System.out.println(city);
                             ^
3 errors

*/

 