
class sample
 {
	{
	   System.out.println("Am called first before cons");	
	}

    sample()
	{
	   System.out.println("sample cons called");
	} 
 }


class democons1
  {
     public static void main(String asd[])
	{
	    System.out.println("***************");
	    sample obj=new sample();
	}
 }