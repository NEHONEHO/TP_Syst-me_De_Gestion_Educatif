package classe;
import java.util.ArrayList;
public class Etudiant {
	private int idEtu; 
	private String nomEtud;
	private String prenomEtud;
	private String emailEtud;
	private int apogee;
	private String filiere;
	ArrayList<Note> note = new ArrayList<>();
	
	public Etudiant () {}
	
	public Etudiant (int idEtu, int apogee, String nomEtu, String prenomEtud, String emailEtu, String filiere) {
        this.idEtu = idEtu;
		this.apogee = apogee;
		this.nomEtud = nomEtu;
		this.prenomEtud = prenomEtud;
		this.emailEtud = emailEtu;
		this.filiere = filiere;
	}
	
	public String getNomEtud() {
		return nomEtud;
	}
	
	public void setNomEtud(String nomEtud) {
		this.nomEtud = nomEtud;
	}
	
	public String getPrenomEtud() {
		return prenomEtud;
	}
	
	public void setPrenomEtud(String prenomEtud) {
		this.prenomEtud = prenomEtud;
	}
	
	public String getEmailEtud() {
		return emailEtud;
	}
	
	public void setEmailEtud(String emailEtud) {
		this.emailEtud = emailEtud;
	}
	
	public int getApogee() {
		return apogee;
	}
	
	public void setApogee(int apogee) {
		this.apogee = apogee;
	}
	
	public String getFiliereEtud() {
		return filiere;
	}
	
	public void setFiliereEtud(String filiere) {
		this.filiere = filiere;
	}
	
	public int getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(int idEtu) {
        this.idEtu = idEtu;
    }
    
    public ArrayList<Note> getNote(){
    	return note;
    }
    
    public void setNote(ArrayList<Note> note) {
    	this.note = note;
    }
}
