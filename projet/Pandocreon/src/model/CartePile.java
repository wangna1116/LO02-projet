package model;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CartePile {
   public List cartes;
   
   //constructeur
   public CartePile(){
	 this.cartes=new ArrayList();
	 creerLesCartesCroyants();
	 creerLesCartesGuideSpirituel();
	 creerLesCartesDeusEx();
	 creerLesCartesApocalypse();
   }
   
   //creer tout les cartes croyants
   public void creerLesCartesCroyants(){
	   //creer les cartes croyants qui s'appelle "Moine"
	   for(int i=0;i<5;i++){
		 Moine moine=new Moine("moine");
		 cartes.add(moine);
	   }
	   //creer les cartes croyants qui s'appelle "D¨¦mon"
	   for(int i=0;i<5;i++){
		  D¨¦mon d¨¦mon=new D¨¦mon("d¨¦mon");
			 cartes.add(d¨¦mon);
	   }
	 //creer les cartes croyants qui s'appelle "Esprits"
	   for(int i=0;i<5;i++){
		  Esprits esprits=new Esprits("esprits");
		 cartes.add(esprits);
	   }
	   //creer les cartes croyants qui s'appelle "Travailleurs"
	   for(int i=0;i<3;i++){
		   Travailleurs travailleurs=new Travailleurs("travailleurs");
			 cartes.add(travailleurs);
	   }
	 //creer les cartes croyants qui s'appelle "Ali¨¦n¨¦"
	   for(int i=0;i<3;i++){
		   Ali¨¦n¨¦ ali¨¦n¨¦=new Ali¨¦n¨¦("ali¨¦n¨¦");
		 cartes.add(ali¨¦n¨¦);
	   }
	   //creer les cartes croyants qui s'appelle "Alchimistes"
	   for(int i=0;i<3;i++){
		   Alchimistes alchimistes=new Alchimistes("alchimistes");
			 cartes.add(alchimistes);
	   }
	 //creer les cartes croyants qui s'appelle 'Ermite"
	   for(int i=0;i<2;i++){
		   Ermite ermite=new Ermite("ermite");
		 cartes.add(ermite);
	   }
	   //creer les cartes croyants qui s'appelle "Vampire"
	   for(int i=0;i<2;i++){
		   Vampire vampire=new Vampire("vampire");
			 cartes.add(vampire);
	   }
	  //creer les cartes croyants qui s'appelle "R¨¦volutionnaires"
	   
	   R¨¦volutionnaires r¨¦volutionnaires=new R¨¦volutionnaires("r¨¦volutionnaire");
	   cartes.add(r¨¦volutionnaires);
	  
	   //creer les cartes croyants qui s'appelle "Int¨¦gristes"
	   
	   Int¨¦gristes int¨¦gristes=new Int¨¦gristes("int¨¦gristes");
	   cartes.add(int¨¦gristes);
	   
	   //creer les cartes croyants qui s'appelle "Guerriers Saints"
		
	   GuerriersSaints guerriersSaints=new GuerriersSaints("guerriersSaints");
	   cartes.add(guerriersSaints);
			  
	  //creer les cartes croyants qui s'appelle "Lycanthropes"
		
	   Lycanthropes lycanthropes=new Lycanthropes("lycanthropes");
	   cartes.add(lycanthropes);
	  //creer les cartes croyants qui s'appelle "Diplomates"
	  
	   Diplomates diplomates=new Diplomates("diplomates");
	   cartes.add(diplomates);
			   
	  //creer les cartes croyants qui s'appelle "Revenant"
			   
	   Revenant revenant=new Revenant("revenant");
	   cartes.add(revenant);   
	  //creer les cartes croyants qui s'appelle "Pilladrs"
	   
	   Pilladrs pilladrs=new Pilladrs("pilladrs");
	   cartes.add(pilladrs);
			   
	  //creer les cartes croyants qui s'appelle "Illusionnistes"
			   
	   Illusionnistes illusionnistes=new Illusionnistes("illusionnistes");
	   cartes.add(illusionnistes);
			   
	  //creer les cartes croyants qui s'appelle 'Nibillistes"
			   
	   Nibillistes nibillistes=new Nibillistes("nibillistes");
	   cartes.add(nibillistes);
			   
   } 
   
   //creer tout les cartes GuideSpirituel
   public void creerLesCartesGuideSpirituel(){
	   //creer les cartes GuideSpirituel qui s'appelle "Martyr"
	   for(int i=0;i<3;i++){
		 Martyr martyr=new Martyr("martyr");
		 cartes.add(martyr);
	   }
	   //creer les cartes GuideSpirituel qui s'appelle "Clerc"
	   for(int i=0;i<8;i++){
		   Clerc clerc=new Clerc("clerc");
			 cartes.add(clerc);
	   }
	   //creer les cartes GuideSpirituel qui s'appelle "Shaman"
	   
	   Shaman shaman=new Shaman("shaman");
		 cartes.add(shaman);
	   
	   //creer les cartes GuideSpirituel qui s'appelle "Anarchiste"
	   
	   Anarchiste anarchiste=new Anarchiste("anarchiste");
	   cartes.add(anarchiste);
	   
	  //creer les cartes GuideSpirituel qui s'appelle "Paladin"
	   
	   Paladin paladin=new Paladin("paladin");
	   cartes.add(paladin);
	   
	   //creer les cartes GuideSpirituel qui s'appelle "Asc¨¨te"
	   
	   Asc¨¨te asc¨¨te=new Asc¨¨te("asc¨¨te");
	   cartes.add(asc¨¨te);
	   
       //creer les cartes GuideSpirituel qui s'appelle "divin"
	   
	   Divin divin=new Divin("divin");
	   cartes.add(divin);
	   
       //creer les cartes GuideSpirituel qui s'appelle "Exorciste"
	   
	   Exorciste exorciste=new Exorciste("exorciste");
	   cartes.add(exorciste);
	   
       //creer les cartes GuideSpirituel qui s'appelle "Sorcier"
	   
	   Sorcier sorcier=new Sorcier("sorcier");
	   cartes.add(sorcier);
	   
       //creer les cartes GuideSpirituel qui s'appelle "Tyran"
	   
       Tyran tyran=new Tyran("tyran");
	   cartes.add(tyran);
	   
       //creer les cartes GuideSpirituel qui s'appelle "Messie"
	   
	   Messie messie=new Messie("messie");
	   cartes.add(messie);

   }
   
   //creer tout les cartes DeusEx
   public void  creerLesCartesDeusEx(){
	   //creer les cartes DeusEx qui s'appelle "Col¨¨re Divine"
	   for(int i=0;i<2;i++){
		   Col¨¨reDivine col¨¨reDivine=new Col¨¨reDivine("col¨¨reDivine");
		   cartes.add(col¨¨reDivine);
	   }
	   //creer les cartes DeusEx qui s'appelle "Stase"
	   
	   Stase stase=new Stase("stase");
			 cartes.add(stase);
	   
	   //creer les cartes DeusEx qui s'appelle "Ordre C¨¦leste"
	   
	   OrdreC¨¦leste ordreC¨¦leste=new OrdreC¨¦leste("ordreC¨¦leste");
	   cartes.add(ordreC¨¦leste);
	   
	   //creer les cartes DeusEx qui s'appelle "Concentration"
	   
	   Concentration concentration=new Concentration("concentration");
	   cartes.add(concentration);
	   
	  //creer les cartes DeusEx qui s'appelle "Fourberie"
	   
	   Fourberie fourberie=new Fourberie("fourberie");
	   cartes.add(fourberie);
	   
	   //creer les cartes DeusEx qui s'appelle "Diversion"
	   
	   Diversion diversion=new Diversion("diversion");
	   cartes.add(diversion);
	   
       //creer les cartes DeusEx qui s'appelle "Trou Noir"
	   
	   TrouNoir trouNoir=new TrouNoir("trouNoir");
	   cartes.add(trouNoir);
	   
       //creer les cartes DeusEx qui s'appelle "Phoenix"
	   
	   Phoenix phoenix=new Phoenix("phoenix");
	   cartes.add(phoenix);
	   
       //creer les cartes DeusEx qui s'appelle "Influence Jour"
	   
	   InfluenceJour influenceJour=new InfluenceJour("influenceJour");
	   cartes.add(influenceJour);
	   
       //creer les cartes DeusEx qui s'appelle "Influence Nuit"
	   
	   InfluenceNuit influenceNuit=new InfluenceNuit("influenceNuit");
	   cartes.add(influenceNuit);
	   
       //creer les cartes DeusEx qui s'appelle "Influence N¨¦ant"
	   
	   InfluenceN¨¦ant influenceN¨¦ant=new InfluenceN¨¦ant("influenceN¨¦ant");
	   cartes.add(influenceN¨¦ant);
	   
	  //creer les cartes DeusEx qui s'appelle "Influence Nulle"
	   for(int i=0;i<2;i++){
		   InfluenceNulle influenceNulle=new InfluenceNulle("influenceNulle");
		   cartes.add(influenceNulle);
	   }
	   
      //creer les cartes DeusEx qui s'appelle "Transe"
	   
	   Transe transe=new Transe("transe");
	   cartes.add(transe);
	   
       //creer les cartes DeusEx qui s'appelle "Miroir"
	   
	   Miroir miroir=new Miroir("miroir");
	   cartes.add(miroir);
	   
       //creer les cartes DeusEx qui s'appelle "Bouleversement"
	   
	   Bouleversement bouleversement=new Bouleversement("bouleversement");
	   cartes.add(bouleversement);
	   
       //creer les cartes DeusEx qui s'appelle "Inquisition"
	   
	   Inquisition inquisition=new Inquisition("inquisition");
	   cartes.add(inquisition);

   }
   
   public void creerLesCartesApocalypse(){
	   //creer les cartes Apocalypse 
	   for(int i=0;i<5;i++){
		   Apocalypse apocalypse=new Apocalypse("apocalypse");
		   cartes.add(apocalypse);
	   }
   }
   
   //test si tout les cartes sont ajoutes
   public void test(){
	   int size =cartes.size();
       for(int i=0;i<size;i++){
    	   CarteAction test=(CarteAction)cartes.get(i);
    	   System.out.println(test.nom);
       }
   }
   
   //Touiller les cartes
   public void touiller() {
   Collections.shuffle(cartes);
    }


}
