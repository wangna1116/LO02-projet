package control;
import control.Joueur;

public class ModeFacile implements Strategie{
   public int choisirAction(int nombreCartesEnMain){
	   if(nombreCartesEnMain<7){
		   //completer sa main a 7 cartes
		   return 0;
	   }else{
		   //se defausser les cartes
		   return 1;
	   }
   }
}
