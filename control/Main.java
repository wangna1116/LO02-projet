package control;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// creer un nouvel jeu
		Tour tour=new Tour();
		//creer les joueurs
		tour.creerJoueur();
		//creer les cartes actions
		tour.creerCartes();
		//creer les divinites
		tour.creerCartesDivinites();
		
    }

}
