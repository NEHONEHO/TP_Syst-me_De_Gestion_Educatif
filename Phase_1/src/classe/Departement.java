package classe;
import java.util.ArrayList;

public class Departement {
	private String intituleDep;
	private String responsableDep;
	private int idDep;
	ArrayList<Filiere> filiere = new ArrayList<>();
	
	public Departement() {}
	
	public Departement(String intituleDep, String responsableDep, int idDep) {
		this.intituleDep = intituleDep;
		this.responsableDep = responsableDep;
		this.idDep = idDep;
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
	
	public ArrayList<Filiere> getFiliere(){
		return filiere;
	}
	
	public void setFiliere(ArrayList<Filiere> filiere) {
		this.filiere = filiere;
	}
}
