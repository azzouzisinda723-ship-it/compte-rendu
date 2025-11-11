package tp2_Ex4;
import java.util.Scanner;

public class calcul {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);

        System.out.print("Entrez une expression: ");
        double operande1 = nb.nextDouble();
        String operateur = nb.next();
        double operande2 = nb.nextDouble();

        double res = 0;
        boolean operateurValide = true;

        switch (operateur) {
            case "+":
                res = operande1 + operande2;
                break;
            case "-":
              res = operande1 - operande2;
                break;
            case "*":
                res = operande1 * operande2;
                break;
            case "/":
                if (operande2 != 0) {
                    res = operande1 / operande2;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    operateurValide = false;
                }
                break;
            default:
                System.out.println("Opérateur non valide !");
                operateurValide = false;
        }

        if (operateurValide) {
            System.out.println("Résultat : " +res);
        }
        nb.close();
    }
}
