package tp2_Ex2;
import java.util.Scanner;
public class nbrePaire {
	public static void main(String[] args){
		Scanner nb= new Scanner(System.in);
		System.out.println("donnez un nombre entier");
		if (nb.hasNextInt()) {
			int nombre=nb.nextInt();
			System.out.println("vous avez saisi"+nombre);
			if (nombre % 2==0) {
				System.out.println("le nombre"+nombre+"est paire");
			}
		else
		{
			System.out.println("le nombre"+ nombre+"est impaire");
		} }else {
			System.out.println("Erreur: vous devez saisir un nombre entier!");
		}
		nb.close();
			}
	}


