class sample
 {
   String name,city;
   int age;

    sample(String name,int age,String city)
	{
	  this.name=name;
	  this.age=age;
	  this.city=city;
          System.out.println("this object"+this);
	}

     public void display()
	{
	  System.out.println("Name="+name);
	  System.out.println("Age="+age);
	  System.out.println("City="+city);
	}
 }

class demothis1
 {
   public static void main(String asd[])
	{
	   sample obj=new sample("Suraj",22,"Ooty");
	   obj.display();
	   System.out.println("main object"+obj);

 	  sample obj1=new sample("Pravin",21,"Salem");
	  obj1.display();
	}
 }