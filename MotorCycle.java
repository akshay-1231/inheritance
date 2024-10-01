package Inheritance;

public class MotorCycle extends Vehicles {
    int modelNo;
    int tyreNo;
	public MotorCycle(String brandname, int model, String type, int modelNo, int tyreNo) {
		super(brandname, model, type);
		this.modelNo = modelNo;
		this.tyreNo = tyreNo;
	}
	  public void display() {
		   super.display();//calling method of parent class
       	super.fun();
        }
	@Override
	public String toString() {
		return "MotorCycle [modelNo=" + modelNo + ", tyreNo=" + tyreNo + ", brandname=" + brandname + ", model=" + model
				+ ", type=" + type + "]";
	}
         
	}
	    

