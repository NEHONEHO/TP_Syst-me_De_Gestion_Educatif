package classe;

public class Module {
	private int idMod;
	private String intituleMod;
	private String filiereMod;
	private String professeurMod;
	
	public Module() {}
	
	public Module(int idMod, String intituleMod, String filiereMod, String professeurMod) {
		this.idMod = idMod;
		this.intituleMod = intituleMod;
		this.filiereMod = filiereMod;
		this.professeurMod = professeurMod;
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
	
	public String getFiliereMod() {
		return filiereMod;
	}
	
	public void setFiliereMod(String filiereMod) {
		this.filiereMod = filiereMod;
	}
	
	public String getProfesseurMod() {
		return professeurMod;
	}
	
	public void setProfesseurMod(String professeurMod) {
		this.professeurMod = professeurMod;
	}
}
