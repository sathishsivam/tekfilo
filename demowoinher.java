
class student
 {
    String name;
    int age;
    int roll;

    student()
	{
	    name="Hari";
            age=22;
	    roll=1;
	}

     public void displaystudent()
	{
	   System.out.println("Studentname"+name);
	   System.out.println("Student age"+age);
	   System.out.println("Roll"+roll);
	}
 }


class teacher extends student
 {
   
   teacher()
	{
	    name="Sivam";
            age=45;
	    roll=1;
	}

     public void displayteacher()
	{
	   System.out.println("Trainername"+name);
	   System.out.println("Trainerage"+age);
	   System.out.println("Trainer id"+roll);
	}
 }

class principal extends teacher
 {
   
   principal()
	{
	    name="SathishSivam";
            age=55;
	    roll=1;
	}

     public void displayprincipal()
	{
	   System.out.println("Principalname"+name);
	   System.out.println("Prinicipalage"+age);
	   System.out.println("Prinicipal id"+roll);
	}
 }


class demowoinher
 {
    public static void main(String asd[])
	{
	  
	   principal tobj=new principal();

	   tobj.displaystudent();
	   tobj.displayteacher();
	   tobj.displayprincipal();
	}
 }
 