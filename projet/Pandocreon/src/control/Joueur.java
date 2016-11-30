package control;
import divinite.Divinite;
import carteAction.CarteAction;
import java.util.ArrayList;
import java.util.List;

public class Joueur {
 private int numeroJoueur;
 private int pointActionJour;
 private int pointActionNuit;
 private int pointActionNeant;
 private Divinite divinite;
 private List carteEnMain;
 //le constructeur
 public  Joueur(int numero){
	 this.numeroJoueur=numero;
	 this.carteEnMain=new ArrayList();
 }
 //piocher divinite au debut du jeu
 public void piocherDivinite(Divinite divinitePioche){
	 this.divinite=divinitePioche;
	 System.out.println("Joueur"+this.numeroJoueur+" pioche divinite:"+this.divinite.getNomDivinite());
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
}
