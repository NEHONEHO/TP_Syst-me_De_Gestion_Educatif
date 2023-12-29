package classe;

import java.util.ArrayList;

public class Filiere {
	private int idFil;
	private String intituleFil;
	private String responsableFil;
	private String departementFil;
	ArrayList<Module> module = new ArrayList<>();
	
	public Filiere() {}
	
	public Filiere(int idFil, String intituleFil, String responsableFil, String departementFil) {
		this.idFil = idFil;
		this.intituleFil = intituleFil;
		this.responsableFil = responsableFil;
		this.departementFil = departementFil;
	}
	
	public int getIdFil() {
        return idFil;
    }

    public void setIdFil(int idFil) {
        this.idFil = idFil;
    }
	
	public String getIntituleFil() {
		return intituleFil;
	}
	
	public void setIntituleFil(String intituleFil) {
		this.intituleFil = intituleFil;
	}
	
	public String getResponsableFil() {
		return responsableFil;
	}
	
	public void setResponsableFil(String responsableFil) {
		this.responsableFil = responsableFil;
	}
	
	public String getDepartementFil() {
		return departementFil;
	}
	
	public void setDepartementFil(String departementFil) {
		this.departementFil = departementFil;
	}
	
	public ArrayList<Module> getModule(){
		return module;
	}
	
	public void setModule(ArrayList<Module> module) {
		this.module = module;
	}
}
