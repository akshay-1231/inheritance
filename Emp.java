package Inheritance;

public class Emp extends Student {
 private int empno;
 private int sal;
 private String company;
public Emp(String name, int age, char gender, int rollNo, String stream, double score, int empno, int sal,
		String company) {
	super(name, age, gender, rollNo, stream, score);
	this.empno = empno;
	this.sal = sal;
	this.company = company;
}
@Override
public String toString() {
	return "Emp [empno=" + empno + ", sal=" + sal + ", company=" + company + ", rollNo=" + rollNo + ", stream=" + stream
			+ ", score=" + score + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
}
  
 
}
