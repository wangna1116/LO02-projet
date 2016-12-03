package control;
import java.util.*;

public class TourDuChaqueJoueur {
   private Joueur joueur;
   //creer un nouvel tour pour chaque joueur
   public TourDuChaqueJoueur(Joueur joueur){
	   this.joueur=joueur;
	   System.out.println("Tour du joueur"+this.joueur.getNumeroJoueur());
   }
   public void choisirAction(){
	   System.out.println("Voici les actions vous pouvez choisir! Saisir le numero du action vous voulez choisir!");
	   Scanner input=new Scanner(System.in);
	   int numeroDuAction=input.nextInt();
	   this.joueur.Action(numeroDuAction);
   }
}
