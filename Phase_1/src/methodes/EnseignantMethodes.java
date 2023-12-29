 package methodes;

import java.util.ArrayList;

import classe.Enseignant;

public class EnseignantMethodes {
	private static ArrayList<Enseignant> listeEnseignants = new ArrayList<>();
	
	public static void addEns(int idEns, String nomEns, String prenomEns, String emailEns, String gradeEns,String departementEns){
		
		Enseignant newEns = new Enseignant(idEns,nomEns,prenomEns,emailEns,gradeEns,departementEns);
		System.out.println("L'enseignant "+newEns.getNomEns()+" est bien ajouter");
		
		listeEnseignants.add(newEns);
	}
	
	public static void updateEns(int idEns, String nomEns, String prenomEns, String emailEns, String gradeEns,String departementEns){
		
		 for (Enseignant enseignant : listeEnseignants) {
	            if (enseignant.getIdEns() == idEns) {
	            	enseignant.setNomEns(nomEns);
	            	enseignant.setPrenomEns(prenomEns);
	            	enseignant.setEmailEns(emailEns);
	            	enseignant.setGradeEns(gradeEns);
	            	enseignant.setDepartementEns(departementEns);
	                System.out.println("Enseignant "+enseignant.getIdEns()+" modifié");
	                return;
	            }
	        }
		 System.out.println("L'enseignant souhaiter n'existe pas.");
	}
	
    public static void deleteEns(int idEns){
    	Enseignant enseignantASupprimer = null;
    	
        for (Enseignant enseignant : listeEnseignants) {
            if (enseignant.getIdEns() == idEns) {
            	enseignantASupprimer = enseignant;
                break;
            }
        }
        if (enseignantASupprimer != null) {
        	listeEnseignants.remove(enseignantASupprimer);
            System.out.println("Enseignant "+enseignantASupprimer.getIdEns()+" supprimé ");
        } else {
            System.out.println("l'enseignant souhaiter n'existe pas");
        }
	}
    
    public static void showEns() {
    	System.out.println("Liste de tous les enseignants :");
        for (Enseignant enseignant : listeEnseignants) {
            System.out.println(  "ID: "+enseignant.getIdEns()+"  Nom : " + enseignant.getNomEns() 
                               + ",    Prénom : " + enseignant.getPrenomEns()+",    Email : " + enseignant.getEmailEns()
                               +",    Grade : " + enseignant.getGradeEns()+ ",    Departement : " + enseignant.getDepartementEns());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addEns(1, "Dachry", "Wafaa", "wafaadachry@gmail.com", "13", "Ressource-humaine");
    	addEns(2, "Khallouki", "Hajar", "hajarkhallouki@gmail.com", "11", "Digital");
    	System.out.println("");
    	showEns();
    	System.out.println("");
        updateEns(2, "Khallouki", "Hajar", "hajarkhallouki20@gmail.com", "12", "Informatique");
        System.out.println("");
        showEns();
        System.out.println("");
        deleteEns(1);
        System.out.println("");
        showEns();
        System.out.println("");
        addEns(1, "Dachry", "Wafaa", "wafaadachry@gmail.com", "13", "Ressource-humaine");
        System.out.println("");
        showEns();
    }
}
