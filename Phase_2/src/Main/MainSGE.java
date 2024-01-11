package Main;

import java.util.Scanner;

import methodesSGE.*;

public class MainSGE {
    public static void main(String[] args) {
    	
    	System.out.println("                           BIENVENUE SUR ESPACE EDUCATIF                            ");
    	System.out.println("");
    	System.out.println("     Veuillez choisir une des options suivantes:");
    	System.out.println("");
    	System.out.println("         1. Espace departement");
    	System.out.println("         2. Espace enseignant");
    	System.out.println("         3. Espace etudiant");
    	System.out.println("         4. Espace filiere");
    	System.out.println("         5. Espace Module");
    	System.out.println("         6. Espace Note");
    	
    	
    	Scanner scan = new Scanner(System.in);
    	
    	int options = scan.nextInt();
    	
    	switch(options) {
    	case 1:
    		DepartementServices.showMenuDept();
    	break;
    	
    	case 2:
    		EnseignantServices.showMenuEns();;
    	break;
    	
    	case 3:
    		EtudiantServices.showMenuEtud();;
    	break;
    	
    	case 4:
    		FiliereServices.showMenuFil();;
    	break;
    	
    	case 5:
    		ModuleServices.showMenuModule();;
    	break;
    	
    	case 6:
    		NoteServices.showMenuNote();;
    	}
    }
    
}
