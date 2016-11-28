package control;

public class Joueur {
	
	/**
	 * 把所有的玩家创建在一个Map里 每个玩家都有自己对应编号
	 */
	private int numeroJoueur;
	private int nomJoueur;
	private int pointActionJour;
	private int pointActionNuit;
	private int pointActionNeant;
	private int[] carteEnMain;
	private String nomDivinite;
	//le constructeur
	
	public Joueur(){
		
		this.pointActionJour = 0;
		this.pointActionNuit = 0;
		this.pointActionNeant = 0;
		
	}
	
	
	
	public int getPointActionJour() {
		return pointActionJour;
	}



	public void setPointActionJour(int pointActionJour) {
		this.pointActionJour = pointActionJour;
	}



	public int getPointActionNuit() {
		return pointActionNuit;
	}



	public void setPointActionNuit(int pointActionNuit) {
		this.pointActionNuit = pointActionNuit;
	}



	public int getPointActionNeant() {
		return pointActionNeant;
	}



	public void setPointActionNeant(int pointActionNeant) {
		this.pointActionNeant = pointActionNeant;
	}



	public void piocherDivinite(){
		
	}
	
	public void defausserCarte(){
		
	}
	
	public void piocherCarte(){
		
	}
	
	public void poserCarteCroyant(){
		
	}
	
	public void poserCarteGuide(){
		
	}
	
	public void poserCarteApocalypse(){
		
	}
	
	public void poserCarteDeusEx(){
		
	}
	
	public void poserCarteDeusExHorsTour(){
	
	}
	
	public void sacrifierCarte(){
		
	}
}
