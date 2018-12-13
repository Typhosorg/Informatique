import java.util.Random;
import PaD.*;

public class Test{
    public static void main(String [] args){
        /*Figure f1= new Figure((0.0,2.0));*/
	/*Rectangle r1=new Rectangle(2.0,4.0);*/
        
	//Carre c1=new Carre(3.0);
	Rectangle r1=new Carre(8);
	/*Rectangle r2=new Cercle(8);*/ //Ainsi les affirmations précédentes restent vrais car le Cercle n'est pas converti en Rectangle
	/*Carre r2=new Rectangle(2,8);*/ //Il m'affiche une erreur d'incompatibilté error: incompatible types: Rectangle cannot be converted to Carre
	/*Carre r2 = r1;*/ //Il y a toujours une erreur car r1 est un carré de type rectangle et r2 est un carre de type carre. Or le type Carré n'est pas une classe de référence.
	Rectangle r2=r1;

	/*--------------------------------------------*/
	//Tableau de figure
	/*	
	Figure[] tf=new Figure[4];
	tf[0]=new Ellipse(3,5);
	tf[1]=new Rectangle(8,3);
	tf[2]=new Carre(4);
	tf[3]=new Cercle(4);
	*/
	/*---------------------------*/
	//Random

	Random a = new Random();
	int u  = a.nextInt(4);
	PlancheADessin pad=new PlancheADessin();
	
	Figure[] tf=new Figure[4];
	//if (u==0){
	    tf[0]=new Ellipse(3,5);
	    System.out.println(tf[0].surface());
	    System.out.println(tf[0].périmètre());
	    /*Dessinable ellipse=new Ellipse(0, 80, 60, PlancheADessin.ROUGE);
	      tf[0].dessiner(pad);*/
	    //}
	if (u==2){
	    tf[2]=new Rectangle(8,3);
	    System.out.println(tf[2].surface());
	    System.out.println(tf[2].périmètre());
	    /*Dessinable ellipse=new Ellipse(0, 80, 60, PlancheADessin.ROUGE);
	      tf[0].dessiner(pad);*/
	    
	}
	if (u==3){
	    tf[3]=new Carre(4);
	    System.out.println(tf[3].surface());
	    System.out.println(tf[3].périmètre());
	    /*Dessinable ellipse=new Ellipse(0, 80, 60, PlancheADessin.ROUGE);
	      tf[0].dessiner(pad);*/
	}
	// if (u==1){
	    tf[1]=new Cercle(4);
	    System.out.println(tf[1].surface());
	    System.out.println(tf[1].périmètre());
	    Dessinable cercle=new Cercle(0, 80, 60, PlancheADessin.ROUGE);
	    pad.ajouter(cercle);
	
	
	/*c1.changerLongueur(9.0); //notre carré change de longueur seulement sur 2 cotés créeant un rectangle*/
	/*System.out.println(r1);
	System.out.println(r2);
	*/
	
    }	
}
