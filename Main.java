package tp2_Ex1;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("donnez le rayon");
		Cercle C1=new Cercle();
		Cercle C2=new Cercle(5.2);
		System.out.println(C1.r);
		System.out.println(C2.r);
		System.out.println(C2.calculSurface());
		System.out.println("donnez le rectangle");
		double a=input.nextDouble();
		double b=input.nextDouble();
		Rectangle R1=new Rectangle(a,b);
		Rectangle R2=new Rectangle(a,b);
		System.out.println(R1.longeur);
		System.out.println(R2.largeur);
		System.out.println(R1.calculSurface());
		System.out.println(R2.calculSurface());
	input.close();
	}
	
	
}
