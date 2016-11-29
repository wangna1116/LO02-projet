package control;
import java.util.List;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tour tour=new Tour();
		tour.creerJoueur();
		tour.creerCartes();
		
		for(int i=0;i<3;i++){
			Joueur joueur=(Joueur)tour.joueurs.get(i);
			joueur.test();
		}
		tour.creerCartesDivinites();
		
		
    }

}
