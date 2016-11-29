package control;
import model.CartePile;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Tour {
   private String etatDuJeu;
   private int nombreJoueur;
   private boolean difficulte;
   private int numeroTour;
   private String etatDuTour;
   private int[] ordreDuJoueurDuTour;
   private int numeroJoueurEnTour;
   //creer un list qui peut conserver tout les joueurs
   public List joueurs;
   //le constructeur
   public void Tour(){
	   
   }
   public void creerJoueur(){
	  this.joueurs=new ArrayList();
	  System.out.println("Combien de joueurs virtuels vous voulez jouer avec?");
	  Scanner nombreJoueurVirtuel=new Scanner(System.in);
	  int nombre=nombreJoueurVirtuel.nextInt();
	  for(int i=0;i<=nombre;i++){
		  Joueur joueur=new Joueur(i+1);
		  joueurs.add(joueur);
	  }
	  System.out.println("Tout les joueurs sont crees!");
	   
   }
   //creer tout les cartes actions dans le carte pile
   //Touiller les cartes actions
   public void creerCartes(){
	   CartePile affiche=new CartePile();
	   affiche.touiller();
	   System.out.println("Tout les cartes dans le pile sont crees et touilles!");
   }
   
   
   public void commencerNouvelTour(){
	   
   }
   public void distribuerCarteAuDebut(){
	   
   }
   public void changerJoueurEnTour(){
	   
   }
   public void eliminerJoueur(){
	   
   }
   public void resultatJeu(){
	   
   }
}
