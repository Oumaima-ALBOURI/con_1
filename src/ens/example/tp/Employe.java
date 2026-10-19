package ens.example.tp;

public abstract class Employe {
	protected  String matricule;
	protected  String nom;
	protected  double tarifJournalier;
	protected Employe superieur;
	
	public Employe getSuperieur() {
		return superieur;
	}

	
	 
	public void setSuperieur(Employe superieur) {
		this.superieur = superieur;
	}

	public Employe(String matricule, String nom, double tarifJournalier) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
	}
	
	public String getMatricule() {
		return matricule;
	}
	public abstract double calculerCout(int nbJours);
	public void afficherDetails() {
		System.out.println("Matricule"+matricule+ 
				"Non" + nom + 
				"tarifJOurnalier" +tarifJournalier);
	}

	
	
	
}
