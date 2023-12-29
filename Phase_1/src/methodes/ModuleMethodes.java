package methodes;

import java.util.ArrayList;

import classe.Module;

public class ModuleMethodes {
	private static ArrayList<Module> listeModules = new ArrayList<>();
	
	public static void addMod(int idMod, String intituleMod, String filiereMod, String professeurMod){
		
		Module newMod = new Module(idMod,intituleMod,filiereMod,professeurMod);
		System.out.println("Le module "+newMod.getIntituleMod()+" est bien ajouter");
		
		listeModules.add(newMod);
	}
	
	public static void updateMod(int idMod, String intituleMod, String filiereMod, String professeurMod){
		
		 for (Module module : listeModules) {
	            if (module.getIdMod() == idMod) {
	            	module.setIntituleMod(intituleMod);
	            	module.setFiliereMod(filiereMod);
	            	module.setProfesseurMod(professeurMod);
	                System.out.println("Module "+module.getIdMod()+" modifié");
	                return;
	            }
	        }
		 System.out.println("Le module souhaiter n'existe pas.");
	}
	
    public static void deleteMod(int idMod){
    	Module moduleASupprimer = null;
    	
        for (Module module : listeModules) {
            if (module.getIdMod() == idMod) {
            	moduleASupprimer = module;
                break;
            }
        }
        if (moduleASupprimer != null) {
        	listeModules.remove(moduleASupprimer);
            System.out.println("Module "+moduleASupprimer.getIdMod()+" supprimé ");
        } else {
            System.out.println("le module souhaiter n'existe pas");
        }
	}
    
    public static void showMod() {
    	System.out.println("Liste de tous les Modules :");
        for (Module module : listeModules) {
            System.out.println(  "ID: "+module.getIdMod()+"  Intitulé: "+module.getIntituleMod()
                               +"  Filière: " + module.getFiliereMod()+ ",    Enseignant: " + module.getProfesseurMod());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addMod(1, "Marketing Digitale", "SITD", "Hajar Khallouki");
    	addMod(2, "POO JAVA", "SITD", "Mehdi Aint Said");
    	System.out.println("");
    	showMod();
    	System.out.println("");
    	updateMod(2, "Programation orienté objet en JAVA", "SITD", "Ait Said Mehdi");
        System.out.println("");
        showMod();
        System.out.println("");
        deleteMod(1);
        System.out.println("");
        showMod();
        System.out.println("");
        addMod(1, "Marketing Digitale", "SITD", "Hajar Khallouki");
        System.out.println("");
        showMod();
    }
}
