package classSGE;

public class Departement {
	
	private String intituleDep;
	private String responsableDep;
	private int idDep;
	
	public Departement() {}
	
	public Departement(String intituleDep, String responsableDep) {
		this.intituleDep = intituleDep;
		this.responsableDep = responsableDep;
	}
	
	public String getIntituleDep() {
		return intituleDep;
	}
	
	public void setIntituleDep(String intituleDep) {
		this.intituleDep = intituleDep;
	}
	
	public String getResponsableDep() {
		return responsableDep;
	}
	
	public void setResponsableDep(String responsableDep) {
	    this.responsableDep = responsableDep;
	}
	
	public int getIdDep() {
		return idDep;
	}
	
	public void setIdDep(int idDep) {
		this.idDep = idDep;
	}
	
}
