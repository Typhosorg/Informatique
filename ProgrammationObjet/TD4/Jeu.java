import PaD.* ;
import java.util.Random;

//CLASSE JEU
public class Jeu{
  //METHODE MAIN
    public static void main(String [] args) throws Exception {

  //Création de 2 nouvelle PlancheADessin pour afficher les cartes
	     PlancheADessin pad = new PlancheADessin();
	     PlancheADessin pad2= new PlancheADessin();

  //Création de 2 nouveaux Jeux de cartes ***
	     Jeu52 lescartes = new Jeu52();
	     Jeu52 Jeude5C = new Jeu52();

	//Création d'un tableau de ...
    //4 Joueurs
	     Joueur[] Joueurs=new Joueur[4];
    //2 nouveaux Joueurs pour le 2è jeu
	     Joueur[] Joueurspart2=new Joueur[2];

  //Affectation des noms à partir de la classe Joueur pour chaque joueur de la ...
    // première partie
	     Joueurs[0]=new Joueur("Mon Père");
	     Joueurs[1]=new Joueur("Ma Soeur");
	     Joueurs[2]=new Joueur("Mon frère");
	     Joueurs[3]=new Joueur("Moi");
    // deuxième partie
	     Joueurspart2[0]=new Joueur("Joueur 1");
	     Joueurspart2[1]=new Joueur("Joueur 2");

	//EXERCICES PRECEDENTES POUR TESTER L'AFFICHAGE DU TABLEAU DE CARTES
	/******************************************************************
  //VARIABLES DE TYPE ENTIER
	int i;
	int j;
	int k;
	int l;

  //POUR LA PREMIERE LIGNE DE 13 CARTES ...
	for(i=0;i<13;i++){

    //ON AFFICHE CHAQUE CARTE DANS LE PAD
	    lescartes.getCarte()[i].dessiner(pad,i*70,0,1);
	    }

  //DE MEME POUR LA DEUXIEME DE LIGNES DE 13 CARTES ...(Ainsi de suite)
	for(j=13;j<26;j++){
	    lescartes.getCarte()[j].dessiner(pad,j*70-i*70,100,1);
	}
	for(k=26;k<39;k++){
	    lescartes.getCarte()[k].dessiner(pad,k*70-j*70,200,1);
	}
	for(l=39;l<52;l++){
	    lescartes.getCarte()[l].dessiner(pad,l*70-k*70,300,1);
	}

	*********************************************************************/

  //PREMIERE PARTIE DU JEU ***************************
  // On ordonne les cartes du jeu 'lescartes'
	 lescartes.ordonner();

  // On mélange les cartes du jeu 'lescartes' de façon aléatoire
	 lescartes.melanger();

   //on distribue à chaque joueur 13 cartes du jeu 'lescartes'
	  Joueurs[0].prendreMesCartes(lescartes,0,13);
	  Joueurs[1].prendreMesCartes(lescartes,13,26);
	  Joueurs[2].prendreMesCartes(lescartes,26,39);
	  Joueurs[3].prendreMesCartes(lescartes,39,52);

	//on affiche les cartes de chaque joueur dans le PaD
	Joueurs[0].montrerCartes(pad,25);
	Joueurs[1].montrerCartes(pad,150);
	Joueurs[2].montrerCartes(pad,275);
	Joueurs[3].montrerCartes(pad,400);

  //On peut afficher dans le terminal la sortie du résultat des cartes
  System.out.println(lescartes);

  //**************************************************************//
	//DEUXIEME PARTIE DU JEU ***************************************
  //On mélange les cartes du jeu "les cartes"
	Jeude5C.melanger();

	//on ordonne les cartes du jeu"Jeude5C"	
	Jeude5C.ordonner();

	//nous prenons un rang aléatoire avec une distance de 5 cartes entre les bornes
	Random u=new Random();
	int ux= u.nextInt(52);
	Random w=new Random();
	int wx= w.nextInt(52);
	

	//On distribue aux 2 joueurs 5 cartes aléatoire du jeu 'Jeu de 5C' de manière ordonné
	Joueurspart2[0].prendreles5cartes(Jeude5C,ux,ux+5);
	Joueurspart2[1].prendreles5cartes(Jeude5C,wx,wx+5);

  //On affiche les cartes de chaque joueur dans le PaD
	Joueurspart2[0].montrerles5cartes(pad2,0,25);
	Joueurspart2[1].montrerles5cartes(pad2,0,150);

	//On peut afficher dans le terminal la sortie du résultat des cartes
	System.out.println(Jeude5C);

	//********************************************************************
    }
}
