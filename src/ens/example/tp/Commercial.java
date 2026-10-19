package ens.example.tp;

public class Commercial extends  Employe{
	double tauxPrime;

	public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime=tauxPrime;
	}

	
	@Override
	public double calculerCout(int nbJours) {
		double montantBase = (tarifJournalier * nbJours) * tauxPrime;
		return (montantBase + montantBase * tauxPrime);
	}

}
