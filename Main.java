
public class Main {

	public static void main(String[] args) {
		Sertar sertar1 = new Sertar(10, 20, 5);
        Sertar sertar2 = new Sertar(10, 20, 7);

        Birou birou = new Birou(100, 50, 75, sertar1, sertar2);
        birou.tipareste();
	}

}
