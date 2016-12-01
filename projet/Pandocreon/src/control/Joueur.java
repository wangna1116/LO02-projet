package control;
import divinite.Divinite;
import carteAction.CarteAction;
import java.util.ArrayList;
import java.util.List;

public class Joueur {
 private int numeroJoueur;
 private int pointActionJour;
 private int pointActionNuit;
 private int pointActionN¨¦ant;
 private Divinite divinite;
 
private List carteEnMain;
 //le constructeur
 public  Joueur(int numero){
	 this.numeroJoueur=numero;
	 this.carteEnMain=new ArrayList();
	 this.pointActionJour=0;
	 this.pointActionNuit=0;
	 this.pointActionN¨¦ant=0;
 }
 //piocher divinite au debut du jeu
 public void piocherDivinite(Divinite divinitePioche){
	 this.divinite=divinitePioche;
	 System.out.println("Joueur"+this.numeroJoueur+" pioche divinite:"+this.divinite.getNom());
 }
 //get divinite
 public Divinite getDivinite() {
		return divinite;
}
 public void defausserCarte(){
	 
 }
 //piocher carteAction
 public void piocherCarte(CarteAction carte){
	 carteEnMain.add(carte);
 }
 //get numero du joueur
 public int getNumero(){
	 return this.numeroJoueur;
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
public int getPointActionN¨¦ant() {
	return pointActionN¨¦ant;
}
public void setPointActionN¨¦ant(int pointActionNeant) {
	this.pointActionN¨¦ant = pointActionNeant;
}

public int getNumeroJoueur() {
	return numeroJoueur;
}

//Tour du joueur
 public void tourDuJoueur(){
	 
 }
}
