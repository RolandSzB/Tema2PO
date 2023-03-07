
public class CapMotor {

	public static void main(String[] args) {
		Motor m1= new Motor(5);
		Motor m2=m1;
		m2.setCapacitate(10);
		m1.tipareste();
	}

}
