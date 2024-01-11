package classSGE;

public class Etudiant {
	private int idEtu; 
	private String nomEtud;
	private String prenomEtud;
	private String emailEtud;
	private int apogee;
	private int idFiliere;
	
	public Etudiant () {}
	
	public Etudiant (String nomEtu, String prenomEtud, String emailEtu, int apogee, int idFiliere) {
		this.nomEtud = nomEtu;
		this.prenomEtud = prenomEtud;
		this.emailEtud = emailEtu;
		this.apogee = apogee;
		this.idFiliere = idFiliere;
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
	
	public int getFiliereEtud() {
		return idFiliere;
	}
	
	public void setFiliereEtud(int idFiliere) {
		this.idFiliere = idFiliere;
	}
	
	public int getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(int idEtu) {
        this.idEtu = idEtu;
    }
}
