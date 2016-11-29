package control;

public class Joueur {
 private int numeroJoueur;
 private int pointActionJour;
 private int pointActionNuit;
 private int pointActionNeant;
 private int[] carteEnMain;
 private String nomDivinite;
 //le constructeur
 public  Joueur(int numero){
	 this.numeroJoueur=numero;
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
 //test si les joueurs sont creer?
 public void test(){
	 System.out.print(this.numeroJoueur);
 }
}
