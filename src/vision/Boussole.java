package vision;

public class Boussole {
	private double ourAngle;
	private final static double enButDirection = 0;
	
	
	public Boussole() {
		ourAngle = 0;
	}
	
	public double getOurAngle() {
		return ourAngle;
	}
	
	public void setOurAngle(double a) {
		ourAngle = a;
	}

	public void majBoussole() {
		int a = OurMotor.getLeftMotor().getTachoCount();
		ourAngle = (ourAngle+a)%360;
	}
}
