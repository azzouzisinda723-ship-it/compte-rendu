package tp4;
public class main {
	public static void main(String[] args) {

    Personne homme = new Personne("Abidi", "Ali", "mâle", 1975, "célibataire", false);
    Personne femme = new Personne("Allani", "Wassila", "femelle", 1980, "célibataire", false);

                
    homme.retourneInfos();
    System.out.println("Âge : " + homme.age(homme) + " ans\n");

    femme.retourneInfos();
    System.out.println("Âge : " + femme.age(femme) + " ans");
    }
    }
