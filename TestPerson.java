package Inheritance;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Akshay", 25, 'M');
		System.out.println(person); // will call toString method
		person.display();
		person.fun1();
		System.out.println("=======================");
	    Student student=new Student("ajay",25,'M',22,"MECH",78);
	 System.out.println(student);
	 
		person.display();
		System.out.println("==============");
		Emp emp=new Emp("akshay",25,'M',22,"MECH",77.8, 56,435456,"SDFS");
		
		System.out.println(emp);
		Person person2 = new Person("Kanchan", 25,'F');
		 System.out.println(person2);
		 person2.display();
			person2.fun1();
			System.out.println("=======================");
		    Student student2=new Student("aj",25,'M',22,"CS",78);
			 System.out.println(student2);
			student2.display();
	}

}
