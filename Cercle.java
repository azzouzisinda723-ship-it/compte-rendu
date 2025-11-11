package tp2_Ex1;

public class Cercle {
	final double pi=3.14;
	double r;
	public Cercle (double a) {
		this.r=a;
	}
	public Cercle() {
		
	}
	public double calculSurface() {
		return r*pi*r;
	}
}
