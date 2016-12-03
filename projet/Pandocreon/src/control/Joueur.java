package control;
import divinite.Divinite;
import carteAction.CarteAction;
import java.util.*;

public class Joueur {
 private int numeroJoueur;
 private int pointActionJour;
 private int pointActionNuit;
 private int pointActionN¨¦ant;
 private Divinite divinite;
 private List carteEnMain;
 private List carteEnjeu;
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
	   //choisir le numero du carte vous voulez defausser
	   System.out.println("Saisir le numero du carte vous voulez defausser!");
	   Scanner input=new Scanner(System.in);
	   int i=input.nextInt();
	   carteEnMain.remove(i);
 }
 //piocher carteAction
 public void piocherCarte(CarteAction carte){
	 carteEnMain.add(carte);
 }
 //get numero du joueur
 public int getNumero(){
	 return this.numeroJoueur;
 }
 public void utiliserCarte(){
	 
 }
public void utiliserCapacite(){
	 
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

public List getCarteEnMain() {
	return carteEnMain;
}
public void setCarteEnMain(List carteEnMain) {
	this.carteEnMain = carteEnMain;
}
public void setNumeroJoueur(int numeroJoueur) {
	this.numeroJoueur = numeroJoueur;
}
public void setDivinite(Divinite divinite) {
	this.divinite = divinite;
}
//choisir une action
public void Action(int numeroDuAction){
	switch (numeroDuAction) {
	case 0:
		defausserCarte();
		break;
	case 1:
		
		break;
	case 2:
		utiliserCarte();
		break;
	case 3:
		sacrifierCarte();
		break;
	case 4:
		utiliserCapacite();
		break;
	default:
		//
		break;
	}
}

}
