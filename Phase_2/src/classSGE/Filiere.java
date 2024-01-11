package classSGE;
import java.util.ArrayList;

public class Filiere {
	private int idFil;
	private String intituleFil;
	private int idResponsableFil;
	private int idDepartementFil;
	ArrayList<Module> module = new ArrayList<>();
	
	public Filiere() {}
	
	public Filiere(String intituleFil, int idResponsableFil, int idDepartementFil) {
		this.intituleFil = intituleFil;
		this.idResponsableFil = idResponsableFil;
		this.idDepartementFil = idDepartementFil;
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
	
	public int getResponsableFil() {
		return idResponsableFil;
	}
	
	public void setResponsableFil(int idResponsableFil) {
		this.idResponsableFil = idResponsableFil;
	}
	
	public int getDepartementFil() {
		return idDepartementFil;
	}
	
	public void setDepartementFil(int idDepartementFil) {
		this.idDepartementFil = idDepartementFil;
	}
}
