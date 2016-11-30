package control;
import java.util.Scanner;
import java.util.Iterator;

import carteAction.CartePile;
import divinite.DivinitePile;
import java.util.ArrayList;
import java.util.List;

public class Partie {
   private boolean difficulte;
   //creer un list qui peut conserver tout les joueurs
   private List joueurs;
   private DivinitePile diviniteEnJeu;
   private CartePile carteEnJeu;
   //le constructeur
   public Partie(){
	   //creer tout les cartes actions dans le carte pile
	   //Touiller les cartes actions
	   carteEnJeu=new CartePile();
	   carteEnJeu.touiller();
	   System.out.println("Tout les cartes dans le pile sont crees et touilles!");
	  //creer tout les cartes divinites dans le divinite pile
	   //Touiller les cartes actions
	   diviniteEnJeu=new DivinitePile();
	   diviniteEnJeu.touiller();
	   System.out.println("Tout les divinites dans le pile sont crees et touilles!");
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
	   
	 //piocher carte divinite au debut
   
   public void piocherDivinite(){
	       Iterator it=joueurs.iterator();
	       while(it.hasNext()){
		   Joueur j=(Joueur) it.next();
		   j.piocherDivinite(diviniteEnJeu.tirerCarteDuDessus());
	       }
   }
   //conmmencer un nouvel tour
   public void commencerNouvelTour(){
	   Joueur premierJoueurDuTour=(Joueur)joueurs.get(0);
	   int i=premierJoueurDuTour.getNumero();
	   
	   Iterator it=joueurs.iterator();
       while(it.hasNext()){
	   Joueur j=(Joueur) it.next();
	   j.piocherDivinite(diviniteEnJeu.tirerCarteDuDessus());
       }
   }
   //distribuer cartes au debut
   public void distribuerCarteAuDebut(){
	   Iterator it=joueurs.iterator();
       while(it.hasNext()){
	   Joueur j=(Joueur) it.next();
	   for(int k=0;k<7;k++){
	   j.piocherCarte(carteEnJeu.tirerCarteDuDessus());
	   }
       }
       System.out.println("7 cartes d'Action sont distribuees a tous les joueurs!");
	   
   }
   
   public void eliminerJoueur(){
	   
   }
   public void resultatJeu(){
	   
   }
}
