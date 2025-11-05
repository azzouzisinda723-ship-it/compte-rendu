package tp4;

public class Personne {
     String nom ;
     String prenom ;
     String sexe ;
     int datenaissance ;
     String etat_civil ;
     boolean conjoint ;
public Personne(String nom, String prenom, String sexe, int datenaissance, String etat_civil, boolean conjoint) {
        this.nom = nom;
        this.prenom = prenom;
        this.sexe = sexe;
        this.datenaissance = datenaissance;
        this.etat_civil = etat_civil;
        this.conjoint = conjoint;
    }
void retourneInfos() {
    String titre = "";

    if (sexe==("mâle")) {
        titre = "M.";
    } else {
        if (etat_civil==("marié")) {
            titre = "Mme.";
            
            
            
            
        } else {
            titre = "Mlle.";
        }
    }
if ((sexe=="femme")&&(conjoint==true)) {
    System.out.println(nom+"est née en "+datenaissance+"elle est mariée" );
}
if ((sexe=="homme")&&(conjoint==false)) {
    System.out.println(nom+"est né en "+datenaissance+"il est marié" );
}
int age(Personne p) {
    int anneeActuelle = 2025;
    return anneeActuelle - p.datenaissance;
}
}
