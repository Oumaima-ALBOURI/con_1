package ens.example.tp;



public class Main {
    public static void main(String[] args) {

        
        Ingenier i1 = new Ingenier("I01", "Ahmed", 500, 4);
        Ingenier i2 = new Ingenier("I02", "Youssef", 350, 2);

        Commercial c1 = new Commercial("C01", "Sara", 300, 0.10);
        Commercial c2 = new Commercial("C02", "Salma", 400, 0.15);

        
        Employe[] employes = {i1, i2, c1, c2};

        
        Projet p1 = new Projet("P01", "Application Web");
        Projet p2 = new Projet("P02", "Gestion des ventes");

       
        i2.setSuperieur(i1);
        c1.setSuperieur(i1);
        c2.setSuperieur(c1);

        
        System.out.println("  LISTE DES EMPLOYES ");

        for (Employe e : employes) {
            e.afficherDetails();

            if (e.getSuperieur() != null) {
                System.out.println(
                    "Superieur : " + e.getSuperieur().nom
                );
            } else {
                System.out.println("Superieur : Aucun");
            }


        }

        
        Mission m1 = new Mission(i1, p1, 3);
        Mission m2 = new Mission(i2, p1, 2);
        Mission m3 = new Mission(c1, p2, 4);
        Mission m4 = new Mission(c2, p2, 2);

  
        Mission[] missions = {m1, m2, m3, m4};

       
        double montantTotal = 0;

        System.out.println("\n  RECAPITULATIF DES MISSIONS ");

        for (Mission m : missions) {
            m.afficherRecapitulatif();
            montantTotal += m.calculerMontant();
            
        }

        System.out.println(
            "Montant total des missions : "
            + montantTotal + " DH"
        );

     
        
       
    }
}
