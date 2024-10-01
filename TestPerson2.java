package Inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //creating array of objects of person classs
		Person[]arr=new Person[5];
		arr[0]=new Person("akshay",25,'M');
		arr[1]=new Person("shyam",26,'M');
		arr[2]=new Person("ajay",25,'M');
		arr[3]=new Person("ram",24,'M');
		arr[4]=new Person("kanchan",22,'F');
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].getName()+"is"+arr[i].getAge()+"trs old and genders is"+arr[i].getGender());
		}
		
	}

}
