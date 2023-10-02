class sample
 {
    int x=10,y=23,z=12;
    sample()
	{
	  System.out.println(((x>y) && (y>z)) ||(z>x));  
	}
 }

class demolog
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }

	/*
	  and   &&

	  or 	||
	
	  not   !

In [1]: True | True
Out[1]: True

In [2]: True |False
Out[2]: True

In [3]: False |True
Out[3]: True

In [4]: False | False
Out[4]: False

In [5]: # or can be represented as ||    true and false both in lower case in java

	*/


