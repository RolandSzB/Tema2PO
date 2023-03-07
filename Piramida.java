
public class Piramida {
	private int n;
	
	public Piramida ( int n) {
		this.n=n; }
		
	public void afisare() {
		int c=n;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++)
		System.out.print(" "); 
			for(int j=1; j<=i*4-1; j=j+2)
				System.out.print(c);
			System.out.println(); c--;}}  
	}
		
	
	

