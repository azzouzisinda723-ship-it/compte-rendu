package tp2_Ex3;
import java.util.Scanner;

public class Bissextile {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        System.out.print("Entrez une année : ");
        int annee = nb.nextInt();

        if ((annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0)) {
            System.out.println("L'année " + annee + " est bissextile.");
        } else {
            System.out.println("L'année " + annee + " n'est pas bissextile.");
        }
        nb.close();
    }
}
