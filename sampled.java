class sample
 {
	{
           System.out.println("Inline block");
	}
    sample()
	{
           System.out.println("welcome to Cons");	 
	}

  static{
             System.out.println("welcome to static block");
	}

 }


class sampled
 {
   public static void main(String as[])
	{
	   sample obj=new sample();
	}
 }