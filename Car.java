package Inheritance;

public class Car extends MotorCycle {
        int DoorNo;
        String Colour;
		public Car(String brandname, int model, String type, int modelNo, int tyreNo, int doorNo, String colour) {
			super(brandname, model, type, modelNo, tyreNo);
			DoorNo = doorNo;
			Colour = colour;
		}
        
		 public void display() {
			   super.display();
	        	super.fun();
	         }

		@Override
		public String toString() {
			return "Car [DoorNo=" + DoorNo + ", Colour=" + Colour + ", modelNo=" + modelNo + ", tyreNo=" + tyreNo
					+ ", brandname=" + brandname + ", model=" + model + ", type=" + type + "]";
		}
		 
}
