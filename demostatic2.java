class student
 {
    String name;
    int roll;
    static String college="i18n";

    student(String name,int roll)
	{
          this.name=name;
	  this.roll=roll;
	} 

    public void display()
	{
	   System.out.println("Name="+name);
	   System.out.println("Roll="+roll);
	   System.out.println("College="+college);
	}
 }

class demostatic2
 {
   public static void main(String asd[])
	{
	   student obj1=new student("Pravin",1);
	   obj1.display();
	   student obj2=new student("Suraj",2);
	   obj2.display();
	}
 }