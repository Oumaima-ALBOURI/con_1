package ens.example.tp;

public class Mission {
	private int nbJours;
	private Employe employe;
	private Projet projet;
	public Mission(int nbJours, Employe employe, Projet projet) {
		super();
		this.nbJours = nbJours;
		this.employe = employe;
		this.projet = projet;
	}
	public double calculerMontant() {
		return employe.calculerCout(nbJours);
	}
	public void afficherRecapitulatif() {
		 System.out.println("  Recapitulatif de location ");
	        System.out.println("Projet : " + projet);
	        System.out.println("Employe :");
	        employe.afficherDetails();;
	        System.out.println("Duree : " +nbJours+ " jours");
	        System.out.println("Montant total : "
	                           + calculerMontant() + " DH");
	        System.out.println();
	}
}
