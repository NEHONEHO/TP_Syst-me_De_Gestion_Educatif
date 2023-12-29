package methodes;

import java.util.ArrayList;

import classe.Etudiant;

public class EtudiantMethodes {
	private static ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
	
	public static void addEtud(int idEtu, int apogee, String nomEtu, String prenomEtud, String emailEtu, String filiere){
		
		Etudiant newEtu = new Etudiant(idEtu,apogee,nomEtu,prenomEtud,emailEtu,filiere);
		System.out.println("L'etudiant "+newEtu.getNomEtud()+" est bien ajouter");
		
		listeEtudiants.add(newEtu);
	}
	
	public static void updateEtud(int idEtu, int apogee, String nomEtu, String prenomEtud, String emailEtu, String filiere){
		
		 for (Etudiant etudiant : listeEtudiants) {
	            if (etudiant.getIdEtu() == idEtu) {
	            	etudiant.setApogee(apogee);
	            	etudiant.setNomEtud(nomEtu);
	            	etudiant.setPrenomEtud(prenomEtud);
	            	etudiant.setEmailEtud(emailEtu);
	            	etudiant.setFiliereEtud(filiere);
	                System.out.println("Etudiant "+etudiant.getIdEtu()+" modifié");
	                return;
	            }
	        }
		 System.out.println("L'etudiant souhaiter n'existe pas.");
	}
	
    public static void deleteEtud(int idEtu){
    	Etudiant etudiantASupprimer = null;
    	
        for (Etudiant etudiant : listeEtudiants) {
            if (etudiant.getIdEtu() == idEtu) {
            	etudiantASupprimer = etudiant;
                break;
            }
        }
        if (etudiantASupprimer != null) {
        	listeEtudiants.remove(etudiantASupprimer);
            System.out.println("Etudiant "+etudiantASupprimer.getIdEtu()+" supprimé ");
        } else {
            System.out.println("l'etudiant souhaiter n'existe pas");
        }
	}
    
    public static void showEtud() {
    	System.out.println("Liste de tous les etudiants :");
        for (Etudiant etudiant : listeEtudiants) {
            System.out.println(  "ID: "+etudiant.getIdEtu()+"  Apogée: "+etudiant.getApogee()
                               +"  Nom : " + etudiant.getNomEtud()+ ",    Prénom : " + etudiant.getPrenomEtud()
                               +",    Email : " + etudiant.getEmailEtud()+",    Filière : " + etudiant.getFiliereEtud());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addEtud(1, 100000, "Otmani", "Nour El Houda", "otmaninour@gmail.com", "Informatique");
    	addEtud(2, 200000, "Baddaz", "Fatima", "baddazfatima@gmail.com", "SITD");
    	System.out.println("");
    	showEtud();
    	System.out.println("");
    	updateEtud(1, 100000, "Otmani", "Nour El Houda", "otmaninour69@gmail.com", "SITD");
        System.out.println("");
        showEtud();
        System.out.println("");
        deleteEtud(1);
        System.out.println("");
        showEtud();
        System.out.println("");
        addEtud(1, 100000, "Otmani", "Nour El Houda", "otmaninour69@gmail.com", "SITD");
        System.out.println("");
        showEtud();
    }
}
