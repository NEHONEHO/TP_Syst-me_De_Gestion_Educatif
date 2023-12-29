package methodes;

import java.util.ArrayList;

import classe.Note;

public class NoteMethodes {
private static ArrayList<Note> listeNotes = new ArrayList<>();
	
	public static void addNote(float note, int idEtudiant, int idModule){
		
		Note newNote = new Note(note, idEtudiant, idModule);
		System.out.println("La note est bien ajouter");
		
		listeNotes.add(newNote);
	}
	
	public static void updateNote(float note, int idEtudiant, int idModule){
		
		 for (Note notes : listeNotes) {
	            if (notes.getEtudiant() == idEtudiant && notes.getModule()== idModule) {
	            	notes.setNote(note);
	                System.out.println("Note modifié");
	                return;
	            }
	        }
		 System.out.println("L'etudiant souhaiter n'existe pas");
	}
	
    public static void deleteNote(int idEtudiant, int idModule){
    	Note noteASupprimer = null;
    	
        for (Note notes : listeNotes) {
            if (notes.getEtudiant() == idEtudiant && notes.getModule()== idModule) {
            	noteASupprimer = notes;
                break;
            }
        }
        if (noteASupprimer != null) {
        	listeNotes.remove(noteASupprimer);
            System.out.println("Note supprimé ");
        } else {
            System.out.println("la filière souhaiter n'existe pas");
        }
	}
    
    public static void showNote() {
    	System.out.println("Liste de tous les Filières :");
        for (Note notes : listeNotes) {
            System.out.println(  "ID Etudiant: "+notes.getEtudiant()+"  Id Module: "+notes.getModule()
                               +"  Note: " + notes.getNote());
            }

    }
    
    public static void main(String[] args) {
        
    	System.out.println("");
    	addNote(15, 1, 5);
    	addNote(14, 1, 7);
    	System.out.println("");
    	showNote();
    	System.out.println("");
    	updateNote(17, 1, 7);
        System.out.println("");
        showNote();
        System.out.println("");
        deleteNote(1,5);
        System.out.println("");
        showNote();
        System.out.println("");
        addNote(15, 1, 5);
        System.out.println("");
        showNote();
    }
}
