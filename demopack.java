
import pack.student;

class teacher extends student
 {
    String intr;
    int exp;
    teacher(String name,int age,String city,String intr,int exp)
	{
	   super(name,age,city);
	   this.intr=intr;
	   this.exp=exp;
	}

    public void displayteacher()
	{
	   System.out.println("Training"+intr);
	   System.out.println("Experience"+exp+"years");  
	}
 }


class demopack
 {
    public static void main(String asd[])
	{
	   teacher obj=new teacher("Sivam",21,"Salem","Python",23);
	   obj.displaystudent();
	   obj.displayteacher();
	}
 }