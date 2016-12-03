package control;


import java.util.ArrayList;

public class JoueurVirtuel extends Joueur{
      private Strategie mode;
    //le constructeur
      public  JoueurVirtuel(int numero,int modeChoisi){
     	 super(numero);
     	 //creer les joueurs virtuels en mode facile
     	 if(modeChoisi==1){
     		 mode=new ModeFacile();
     	 }
      }
     //public int tourDuJoueur(){
    	  //calculate le nombre des cartes en main
    	//  int nombreCartesEnMain=this.getCarteEnMain().size();
    	//  int i= mode.choisirAction(nombreCartesEnMain);
    //	  return i ;
   //   }
}
