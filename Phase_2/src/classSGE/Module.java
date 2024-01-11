package classSGE;

public class Module {
	private int idMod;
	private String intituleMod;
	private int idFiliereMod;
	private int idprofesseurMod;
	
	public Module() {}
	
	public Module(String intituleMod, int idFiliereMod, int idprofesseurMod) {
		this.intituleMod = intituleMod;
		this.idFiliereMod = idFiliereMod;
		this.idprofesseurMod = idprofesseurMod;
	}
	
	public int getIdMod() {
		return idMod;
	}
	
	public void setIdMod(int idMod) {
		this.idMod = idMod;
	}
	
	public String getIntituleMod() {
		return intituleMod;
	}
	
	public void setIntituleMod(String intituleMod) {
		this.intituleMod = intituleMod;
	}
	
	public int getFiliereMod() {
		return idFiliereMod;
	}
	
	public void setFiliereMod(int idFiliereMod) {
		this.idFiliereMod = idFiliereMod;
	}
	
	public int getProfesseurMod() {
		return idprofesseurMod;
	}
	
	public void setProfesseurMod(int idprofesseurMod) {
		this.idprofesseurMod = idprofesseurMod;
	}
}
