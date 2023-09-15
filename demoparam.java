class sample
 {
    sample()	
	{
	
	}

   public void getdata(int x,int y)	// parameters are variables which will be defined in the method definition
	{
	   int sum=x+y;
	   System.out.println("Addition="+sum);
	}
  }


class demoparam
 {
    public static void main(String[] s)
	{
	   sample obj=new sample();
	   obj.getdata(311,141);	// arguments values which will passed to the function parameters
	}
 }

