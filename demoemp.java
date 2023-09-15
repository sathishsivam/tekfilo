class employee
 {
    String name,designation;

    employee(String name,String designation)
	{
		// scope of name and design is valid only here 
	   this.name=name;
	   this.designation=designation;
	}

    public void displayemp()
	{
	  System.out.println(name);
	  System.out.println(designation);
	}
 }


class demoemp
 {
    public static void main(String asd[])
	{
	  employee emp1=new employee("Pravin","Software engineer");
	  emp1.displayemp();
	}
 }