package control;
import java.util.Scanner;
import java.util.Random;
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
	   System.out.println("Bienvenu sur Pandocreon!");
	   carteEnJeu=new CartePile();
	   carteEnJeu.touiller();
	   System.out.println("Tout les cartes dans le pile sont crees et touilles!");
	  //creer tout les cartes divinites dans le divinite pile
	   //Touiller les cartes actions
	   diviniteEnJeu=new DivinitePile();
	   diviniteEnJeu.touiller();
	   System.out.println("Tout les divinites dans le pile sont crees et touilles!");
   }
   //creer joueurs au debut
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
	   //lancer du de
	   System.out.println("Nouvel tour! Joueur"+i+" lance du de!");
	   Random r=new Random();
	   int resultatDe = r.nextInt(3)%(3-1+1) + 1;
	   //distribuer point d'action
	   distribuerPointAction(resultatDe);
	   //Chaque joueur joue son tour
	   Iterator it=joueurs.iterator();
       while(it.hasNext()){
	   Joueur j=(Joueur) it.next();
	   j.tourDuJoueur();
       }
       //changer l'ordre des joueurs pour le prochain tour
       joueurs.remove(0);
       joueurs.add(premierJoueurDuTour);
       System.out.println("On a fini ce tour!");
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
   //distribuer points d'action
   public void distribuerPointAction(int resultat){
	   if(resultat==1){
		   System.out.println("Face Jour!");
		   Iterator it=joueurs.iterator();
	       while(it.hasNext()){
		      Joueur j=(Joueur) it.next();
		      if(j.getDivinite().getDiviniteOrigine()=="Jour"){
			      j.setPointActionJour(j.getPointActionJour()+2);
			      System.out.println("Donner 2 points Jour au joueur"+j.getNumeroJoueur());
		      }
		      else if(j.getDivinite().getDiviniteOrigine()=="Aube"){
		    	  j.setPointActionJour(j.getPointActionJour()+1);
			      System.out.println("Donner 1 points Jour au joueur"+j.getNumeroJoueur());
		      }
	       }
		   
	   }
	   else if(resultat==2){
		   System.out.println("Face Nuit!");
		   Iterator it=joueurs.iterator();
	       while(it.hasNext()){
		      Joueur j=(Joueur) it.next();
		      if(j.getDivinite().getDiviniteOrigine()=="Nuit"){
			      j.setPointActionNuit(j.getPointActionNuit()+2);
			      System.out.println("Donner 2 points Nuit au joueur"+j.getNumeroJoueur());
		      }
		      else if(j.getDivinite().getDiviniteOrigine()=="Cr¨¦puscule"){
		    	  j.setPointActionNuit(j.getPointActionNuit()+1);
			      System.out.println("Donner 1 points Nuit au joueur"+j.getNumeroJoueur());
		      }
	       }
	   }
	   else if(resultat==3){
		   System.out.println("Face N¨¦ant!");
		   Iterator it=joueurs.iterator();
	       while(it.hasNext()){
		      Joueur j=(Joueur) it.next();
		      if(j.getDivinite().getDiviniteOrigine()=="Aube"){
			      j.setPointActionN¨¦ant(j.getPointActionN¨¦ant()+1);
			      System.out.println("Donner 1 points N¨¦ant au joueur"+j.getNumeroJoueur());
		      }
		      else if(j.getDivinite().getDiviniteOrigine()=="Cr¨¦puscule"){
		    	  j.setPointActionN¨¦ant(j.getPointActionN¨¦ant()+1);
			      System.out.println("Donner 1 points N¨¦ant au joueur"+j.getNumeroJoueur());
		      }
	       }
	   }
   }
   
   public void eliminerJoueur(){
	   
   }
   public void resultatJeu(){
	   
   }
}
