package control;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// creer un nouvel jeu
		Partie tour=new Partie();
		//creer les joueurs
		tour.creerJoueur();
		//chaque joueur pioche une divinite
		tour.piocherDivinite();
		//distruber cartes au debut
		tour.distribuerCarteAuDebut();
		
    }

}
