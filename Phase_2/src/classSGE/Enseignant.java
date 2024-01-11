package classSGE;

public class Enseignant {
	private int idEns;
	private String nomEns;
	private String prenomEns;
	private String emailEns;
	private String gradeEns;
	private String departementEns;
	
	public Enseignant(){}
	
	public Enseignant(String nomEns, String prenomEns, String emailEns, String gradeEns, String departementEns){
		this.nomEns = nomEns;
		this.prenomEns = prenomEns;
		this.emailEns = emailEns;
		this.gradeEns = gradeEns;
		this.departementEns = departementEns;
	}
	
	public int getIdEns() {
        return idEns;
    }

    public void setIdEns(int id) {
        this.idEns = id;
    }
	
	public String getNomEns() {
		return nomEns;
	}
	
	public void setNomEns(String nomEns) {
		this.nomEns = nomEns;
	}
	
	public String getPrenomEns() {
		return prenomEns;
	}
	
	public void setPrenomEns(String prenomEns) {
		this.prenomEns = prenomEns;
	}
	
	public String getEmailEns() {
		return emailEns;
	}
	
	public void setEmailEns(String emailEns) {
		this.emailEns = emailEns;
	}
	
	public String getGradeEns() {
		return gradeEns;
	}
	
	public void setGradeEns(String gradeEns) {
		this.gradeEns = gradeEns;
	}
	
	public String getDepartementEns() {
		return departementEns;
	}
	
	public void setDepartementEns(String departementEns) {
		this.departementEns = departementEns;
	}
}
