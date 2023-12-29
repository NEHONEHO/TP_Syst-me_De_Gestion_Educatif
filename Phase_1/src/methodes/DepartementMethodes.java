package methodes;
import classe.Departement;

import java.util.ArrayList;

public class DepartementMethodes {
	
	private static ArrayList<Departement> listeDepartements = new ArrayList<>();
	
	public static void addDept(String intituleDep, String responsableDep, int idDep){
		
		Departement newDept = new Departement(intituleDep,responsableDep,idDep);
		System.out.println("Le departement "+newDept.getIntituleDep()+" est bien ajouter");
		
		listeDepartements.add(newDept);
	}
	
	public static void updateDept(String intituleDep, String responsableDep, int idDep){
		
		 for (Departement departement : listeDepartements) {
	            if (departement.getIdDep() == idDep) {
	                departement.setIntituleDep(intituleDep);
	                departement.setResponsableDep(responsableDep);
	                System.out.println("Département "+departement.getIdDep()+" modifié");
	                return;
	            }
	        }
		 System.out.println("Le département souhaiter n'existe pas.");
	}
	
    public static void deleteDept(int idDep){
    	Departement departementASupprimer = null;
    	
        for (Departement departement : listeDepartements) {
            if (departement.getIdDep() == idDep) {
                departementASupprimer = departement;
                break;
            }
        }
        if (departementASupprimer != null) {
            listeDepartements.remove(departementASupprimer);
            System.out.println("Département "+departementASupprimer.getIdDep()+" supprimé ");
        } else {
            System.out.println("Le département souhaiter n'existe pas");
        }
	}
    
    public static void showDept() {
    	System.out.println("Liste de tous les départements :");
        for (Departement departement : listeDepartements) {
            System.out.println("ID: "+departement.getIdDep()+"  Nom : " + departement.getIntituleDep() + ",    Responsable : " + departement.getResponsableDep());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addDept("Informatique", "Benmakhlouf", 1);
    	System.out.println("");
    	addDept("Ressources Humaines", "Dachry", 2);
    	System.out.println("");
        
        showDept();
        System.out.println("");

        
        updateDept("Informatique", "Doha", 1);
        System.out.println("");

        
        showDept();
        System.out.println("");
   
        deleteDept(1);
        System.out.println("");
        
        showDept();
    }
}
