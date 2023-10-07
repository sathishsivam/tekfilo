class sample
 {
    static int count=0;
    sample()
	{
	   count++;
	   System.out.println(count);
	}
 }


class demostaticcount
 {
    public static void main(String asd[])
	{
	    sample obj1=new sample();
	    sample obj2=new sample();
	    sample obj3=new sample();

	}
 }