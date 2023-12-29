package classe;

public class Note {
	private float note;
    private int idEtudiant;
    private int idModule;

    public Note(){}

    public Note(float note, int idEtudiant, int idModule) {
        this.note = note;
        this.idEtudiant = idEtudiant;
        this.idModule = idModule;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getEtudiant() {
        return idEtudiant;
    }

    public void setEtudiant(int idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public int getModule() {
        return idModule;
    }

    public void setModule(int idModule) {
        this.idModule = idModule;
    }
}
