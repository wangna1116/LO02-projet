package control;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// creer un nouvel jeu
		Partie partie=new Partie();
		//creer les joueurs
 		partie.creerJoueur();
 		//chaque joueur pioche une divinite
 		partie.piocherDivinite();
 		//distruber cartes au debut
 		partie.distribuerCarteAuDebut();
 		//commencer un nouvel tour
 		partie.commencerNouvelTour();
		
    }

}
