
class address
 {
    String st,city;
    int dno,pin;

    address(String st,int dno,String city,int pin)
	{
          this.st=st;
          this.dno=dno;
          this.city=city;
          this.pin=pin;
	}
 }


class student 	// pojo
 { 
   String name;
   int age;
   address add;	// entity relationship 
   student(String name,int age,address add)
	{
	   this.name=name;
           this.age=age;
	   this.add=add;
	}

   public void displaydetails()
	{
            System.out.println("Name="+name);
	    System.out.println("Age="+age);
	    System.out.println("Street="+add.st);
	    System.out.println("Door="+add.dno);
	    System.out.println("City="+add.city);
	    System.out.println("Pincode="+add.pin);


	 }

 }


class demohas
 {
   public static void main(String asd[])
	{
	  address a1=new address("peramanur main road",3,"Salem",636007);
	  address a2=new address("Tharamangalam",23,"Salem DT",636501);

	  student s1=new student("Hari",21,a1);
	  s1.displaydetails();

	  student s2=new student("Mohanraj",20,a2);
	  s2.displaydetails();

	}
 }
