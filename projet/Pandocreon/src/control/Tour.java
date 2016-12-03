package control;
import java.util.*;

public class Tour {
	private List joueurs;
	//constructeur
	public Tour(ArrayList<Joueur> joueurs){
		this.joueurs=new ArrayList();
		this.joueurs=joueurs;
	}
	//commencer un nouvel tour
	public void nouvelTour(){
	  Joueur premierJoueurDuTour=(Joueur)joueurs.get(0);
	   int i=premierJoueurDuTour.getNumero();
	   //lancer du de
	   System.out.println("Nouvel tour! Joueur"+i+" lance du de!");
	   Random r=new Random();
	   int resultat = r.nextInt(3);
	   int resultatDe=(int)Math.floor(resultat);
	   //distribuer point d'action
	   distribuerPointAction(resultatDe);
	   //Chaque joueur joue son tour
	   Iterator it=joueurs.iterator();
      while(it.hasNext()){
	     Joueur j=(Joueur) it.next();
	     TourDuChaqueJoueur tourDuChaqueJoueur=new TourDuChaqueJoueur(j);
	     tourDuChaqueJoueur.choisirAction();
      }
     //changer l'ordre des joueurs pour le prochain tour
     joueurs.remove(0);
     joueurs.add(premierJoueurDuTour);
     System.out.println("On a fini ce tour!");
     }
	//distribuer points d'action
	   public void distribuerPointAction(int resultat){
		   if(resultat==0){
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
		   else if(resultat==1){
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
		   else if(resultat==2){
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
}
