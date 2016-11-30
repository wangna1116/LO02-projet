package divinite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import carteAction.CarteAction;


public class DivinitePile {
	   public List cartesDivinites;
	   
	   //constructeur
	   public DivinitePile(){
		 this.cartesDivinites=new ArrayList();
		 creerLesCartesDivinites();
	   }
	   //creer les cartes divinites
	   public void creerLesCartesDivinites(){
		 //creer le divinite qui s'appelle "Brewalen"
		   Brewalen brewalen=new Brewalen("Brewalen");
		   cartesDivinites.add(brewalen);
         //creer le divinite qui s'appelle "Drinded"
		   
		   Drinded drinded=new Drinded("Drinded");
		   cartesDivinites.add(drinded);
		  
         //creer le divinite qui s'appelle "Gorpa"
		   
		   Gorpa gorpa=new Gorpa("Gorpa");
		   cartesDivinites.add(gorpa);
		  
         //creer le divinite qui s'appelle "Gwengbelen"
		   
		   Gwengbelen gwengbelen=new Gwengbelen("Gwengbelen");
		   cartesDivinites.add(gwengbelen);
		  
         //creer le divinite qui s'appelle "Killinstred"
		   
		   Killinstred killinstred=new Killinstred("Killinstred");
		   cartesDivinites.add(killinstred);
		  
		  
         //creer le divinite qui s'appelle "Llewella"
		   
		   Llewella llewella=new Llewella("Llewella");
		   cartesDivinites.add(llewella);
		  
         //creer le divinite qui s'appelle "PuiTara"
		   
		   PuiTara puiTara=new PuiTara("Puitara");
		   cartesDivinites.add(puiTara);
		  
         //creer le divinite qui s'appelle "Romtec"
		   
		   Romtec romtec=new Romtec("Romtec");
		   cartesDivinites.add(romtec);
		  
         //creer le divinite qui s'appelle "Shingva"
		   
		   Shingva shingva=new Shingva("Shingva");
		   cartesDivinites.add(shingva);
		  
		  
         //creer le divinite qui s'appelle "Yarstur"
		   
		   Yarstur yarstur=new Yarstur("Yarstur");
		   cartesDivinites.add(yarstur);
		   
	   }
	   
	 //test si tout les cartes sont ajoutes
	   public void test(){
		   int size =cartesDivinites.size();
	       for(int i=0;i<size;i++){
	    	   Divinite test=(Divinite)cartesDivinites.get(i);
	    	   System.out.println(test.nom);
	       }
	   }
	   
	   //Touiller les cartes
	   public void touiller() {
	   Collections.shuffle(cartesDivinites);
	    }
	   
	   //tirer carte du dessus
	   public Divinite tirerCarteDuDessus(){
		   int i=cartesDivinites.size();
		   int j=i-1;
		   Divinite divinite=(Divinite)cartesDivinites.get(j);
		   cartesDivinites.remove(j);
		   return divinite;
	   }

}
