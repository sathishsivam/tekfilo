
class student
 {
    public void getstudent()
	{
	   System.out.println("Am from student class");
	}

    public void getstudent1()
	{
	   System.out.println("Am method student1");
	}

 }

class samplemethod1
 {   
    public static void main(String asd[])
	{
	  student obj=new student();
	 // obj.getstudent();
	  obj.getstudent1();
	}
 }