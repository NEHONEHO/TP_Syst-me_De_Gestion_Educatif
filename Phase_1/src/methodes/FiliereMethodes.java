package methodes;

import java.util.ArrayList;

import classe.Filiere;

public class FiliereMethodes {
	private static ArrayList<Filiere> listeFilieres = new ArrayList<>();
	
	public static void addFil(int idFil, String intituleFil, String responsableFil, String departementFil){
		
		Filiere newFil = new Filiere(idFil,intituleFil,responsableFil,departementFil);
		System.out.println("La filière "+newFil.getIntituleFil()+" est bien ajouter");
		
		listeFilieres.add(newFil);
	}
	
	public static void updateFil(int idFil, String intituleFil, String responsableFil, String departementFil){
		
		 for (Filiere filiere : listeFilieres) {
	            if (filiere.getIdFil() == idFil) {
	            	filiere.setIntituleFil(intituleFil);
	            	filiere.setResponsableFil(responsableFil);
	            	filiere.setDepartementFil(departementFil);
	                System.out.println("Filiere "+filiere.getIdFil()+" modifié");
	                return;
	            }
	        }
		 System.out.println("La filière souhaiter n'existe pas.");
	}
	
    public static void deleteFil(int idFil){
    	Filiere filiereASupprimer = null;
    	
        for (Filiere filiere : listeFilieres) {
            if (filiere.getIdFil() == idFil) {
            	filiereASupprimer = filiere;
                break;
            }
        }
        if (filiereASupprimer != null) {
        	listeFilieres.remove(filiereASupprimer);
            System.out.println("Filière "+filiereASupprimer.getIdFil()+" supprimé ");
        } else {
            System.out.println("la filière souhaiter n'existe pas");
        }
	}
    
    public static void showFil() {
    	System.out.println("Liste de tous les Filières :");
        for (Filiere filiere : listeFilieres) {
            System.out.println(  "ID: "+filiere.getIdFil()+"  Intitulé: "+filiere.getIntituleFil()
                               +"  Responsable: " + filiere.getResponsableFil()+ ",    Departement: " + filiere.getDepartementFil());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addFil(1, "SITD", "Wafaa Dachry", "Informatique");
    	addFil(2, "GI", "Ben makhlmouf", "Informatique");
    	System.out.println("");
    	showFil();
    	System.out.println("");
    	updateFil(1, "SITD", "Wafaa Dachry", "GEGM");
        System.out.println("");
        showFil();
        System.out.println("");
        deleteFil(1);
        System.out.println("");
        showFil();
        System.out.println("");
        addFil(1, "SITD", "Wafaa Dachry", "GEGM");
        System.out.println("");
        showFil();
    }
}
