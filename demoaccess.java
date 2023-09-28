class sample
 {
   String name;
  public int age;
  public String city;
 
  public  sample(String name,int age,String city)
	{
	   this.name=name;
	   this.age=age;
	   this.city=city;
	}

   public  void display()
	{
	  System.out.println(name+"    "+age+"   "+city);
	}	
 
 }

class demoaccess
 {
    public static void main(String asd[])
	{
	    sample obj=new sample("Hari",21,"Salem");
	    obj.name="Hariprasanth";
	    obj.display();

	}
 }

// private variables can be accessble with in the class
//  prviate variable cannot be accessible outside of the class


  