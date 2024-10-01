package Inheritance;

public class Student extends Person {
            protected int rollNo;
            protected String stream;
            protected double score;
			public Student(String name, int age, char gender, int rollNo, String stream, double score) {
				super(name, age, gender);  //calling constuctor of parent class
				this.rollNo = rollNo;
				this.stream = stream;
				this.score = score;
			}
			   public void display() {
				   super.display();//calling method of parent class
		        	super.fun1();
		         }
			@Override
			public String toString() {
				return "Student [rollNo=" + rollNo + ", stream=" + stream + ", score=" + score + ", name=" + name
						+ ", age=" + age + ", gender=" + gender + "]";
			}
			
			
            
}
