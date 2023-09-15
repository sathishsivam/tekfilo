class sample
 {
    public void displaysum(int x,int y,int z)
	{
	   System.out.println(x+y+z);	
	}
 }

class demoparam2
 {
    public static void main(String dog[])
	{
	   sample obj=new sample();
	   obj.displaysum(1,2,3);
	   sample obj1=new sample();
	   obj1.displaysum(10,10,20);
	   System.out.println("Address of obj"+obj);
	   System.out.println("Address of obj1"+obj1);
	}
 }