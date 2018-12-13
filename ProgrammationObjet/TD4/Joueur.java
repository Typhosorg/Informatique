import PaD.*;

//CLASSE JOUEUR
public class Joueur{
  //ATTRIBUTS
    //création de la variable privée "nom" de type String
    private String nom;

    //création du tableau de 13 cartes "mes Cartes"
    private Carte[] mesCartes=new Carte[13];

    //création du tableau de 5 cartes "CinqCartes"
    private Carte[] CinqCartes=new Carte[5];

  //CONSTRUCTEUR Joueur qui initialise le nom du Joueur mis en paramètre
    public Joueur(String nomJoueur){
	     this.nom=nomJoueur;
    }

  //METHODE qui initialise 13 cartes dans le jeu de 52 cartes...
    public void prendreMesCartes(Jeu52 jeu,int de,int à){

      //Soit un tableau de cartes "tCartes" dans un jeu "jeu" évoqué en paramètre
	     Carte[] tCartes=jeu.getCarte();

       //soit i initialisé au rang 0
	     int i=0;

       //Pour chaque rang du nombre "de" au nombre "à"
	     for(int j=de;j<à;j++){

      //Que chaque carte du tableau "mesCartes" soit dans le tableau "tCartes"
	        this.mesCartes[i]=tCartes[j];
	        i++;
	       }
       }

//METHODE qui initialise 5 cartes dans le jeu de 52 cartes ...
  public void prendreles5cartes(Jeu52 jeu,int de,int à){

  //Soit un tableau de cartes "tCartes" dans un jeu "jeu" évoqué en paramètre
	   Carte[] tCartes=jeu.getCarte();
	   
     //soit i initialisé au rang 0
	   int i=0;

    //Pour chaque rang du nombre "de" au nombre "à"
	   for(int j=de;j<à;j++){
       //Que chaque carte du tableau "CinqCartes" soit dans le tableau "tCartes"
	      this.CinqCartes[i]=tCartes[j];
	      i++;
	    
	        
    }
	   
  }

//METHODE montrerCartes qui initialise l'affichage du pad en fonction des coordonnées (x,y) du 1er Jeu
    public void montrerCartes(PlancheADessin pad, double x, double y){

      //Création du texte Nomdujoueur à partir de la classe Texte du dossier PaD
	     Texte Nomdujoueur=new Texte(x,y,nom);

	    //afficher le texte Nomdujoueur dans le pad
	     pad.ajouter(Nomdujoueur);

      //Pour chaque rang de cartes
	     for(int i=0;i<13;i++){

         //afficher la carte du tableau mesCartes dans le PaD à partir des coordonnées mis en paramètres
		       mesCartes[i].dessiner(pad,i*70,y+25,0);
	    }

    }
    //METHODE montrerles5cartes qui initialise l'affichage du pad en fonction des coordonnées (x,y) du 1er Jeu
    public void montrerles5cartes(PlancheADessin pad, double x, double y){
        //Création du texte Nomdujoueur à partir de la classe Texte du dossier PaD
	         Texte Nomdujoueur=new Texte(x,y,nom);

	      //afficher le texte Nomdujoueur dans le pad
	         pad.ajouter(Nomdujoueur);

       //Pour chaque rang de cartes
	         for(int d=0;d<5;d++){

             //afficher la carte du tableau CinqCartes dans le PaD à partir des coordonnées mis en paramètres
	            CinqCartes[d].dessiner(pad,d*70,y+25,0);
	           }
    }

//METHODE pour généraliser la méthode montrerCartes en fonction la coordonnée y seulement mis en paramètre
    public void montrerCartes(PlancheADessin pad,double y){

      //retourne la méthode montrerCartes précédente
	     this.montrerCartes(pad,0,y);

    }

}
