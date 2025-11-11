package tp4;

import tp4.Personne;

public class Personne {
	String nom;
	String prenom;
	String sexe;
	String etatcivil;
	int datenaiss;
	boolean conjoint;
	public Personne(String nom,String prenom,String sexe, int datenaiss,String etatcivil,
			boolean conjoint) {
		this.nom=nom;
		this.prenom=prenom;
		this.sexe=sexe;
		this.datenaiss=datenaiss;
		this.etatcivil=etatcivil;
		this.conjoint=conjoint;
		
	}
	void retourneInfo() {
		if((sexe=="femme" )&& (conjoint==true) ){
			System.out.println("Madame"+nom+"est nie en"+ datenaiss+"elle est un marie");
	}
		else if((sexe=="femme") && (conjoint==false)) {
			System.out.println("demoiselle"+nom+"est nie en"+ datenaiss+"elle est celibataire");}
		else {
			System.out.println("monsieur"+nom+"est nie en"+ datenaiss+"il est celibataire");
		}
		}
	public int age() {
		int anneeact= 2025;
	    
		return anneeact-this.datenaiss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne homme= new Personne("Abidi","Ali","homme",1975,"celibataire",false);
		Personne femme= new Personne("Amri","Sarra","femme",1970,"marie",true);
		homme.retourneInfo();
		System.out.println("age de"+homme.prenom+homme.age()+ "ans");
		femme.retourneInfo();
		System.out.println("age de"+ femme.prenom+femme.age()+ "ans");
	}

}
