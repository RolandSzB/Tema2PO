
public class Birou {

	Sertar sertar1, sertar2;
    private int l, L, H;


    public Birou(int l, int L, int H, Sertar s1, Sertar s2) {
    	this.l = l;
        this.L = L;
        this.H = H;
        sertar1 = s1;
        sertar2 = s2;
    }

    public void tipareste() {
        System.out.println("Birou " + l + " " + L + " " +H);
        System.out.print("Componente: ");
        sertar1.tipareste();
       sertar2.tipareste();
    }
}
