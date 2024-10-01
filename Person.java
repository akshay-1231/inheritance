package Inheritance;

public class Person {
         protected String name;
         protected int age;
         protected char gender;
		public Person(String name, int age, char gender) {             //parameterised constructor
			super();
			this.name = name;
			this.age = age;
			this.gender = gender;
		}
         
         

		public String getName() {            //getter and setter method
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public int getAge() {
			return age;
		}



		public void setAge(int age) {
			this.age = age;
		}



		public char getGender() {
			return gender;
		}



		public void setGender(char gender) {
			this.gender = gender;
		}



		public void display() {                       //display method
        	 System.out.println("display of person class");
         }
         public void fun1()
         {
        	 System.out.println("fun1 of person class");
         }

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
		}
}
