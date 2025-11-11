package tp2_Ex1;

public class Rectangle {
	public double largeur;
	public double longeur;
	public Rectangle (double lon,double lar) {
		this.longeur=lon;
		this.largeur=lar;
	}
	public Rectangle() {
		
	}
	public double calculSurface() {
		return longeur*largeur;
	
}}
