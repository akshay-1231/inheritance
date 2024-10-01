package Inheritance;

public class Vehicles {
	protected   String brandname;
    protected    int model;
    protected String type;
	public Vehicles(String brandname, int model, String type) {
		super();
		this.brandname = brandname;
		this.model = model;
		this.type = type;
	}
    

	public void display() {
    	 System.out.println("display of vehicle class");
     }
	public void fun()
    {
   	 System.out.println("fun of vehicle class");
    }



	public String toString() {
		return "Vehicles [brandname=" + brandname + ", model=" + model + ", type=" + type + "]";
	}

   
	
	
}
