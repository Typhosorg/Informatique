import PaD.*;

//CLASSE CARTE 
public class Carte {
  //CLASSES ENUMEREES
    //integration de la lists énumérée de Couleur
    public enum Couleur{trèfle, carreau, coeur, pique}

    //integration de la liste énumérée Valeur
    public enum Valeur{deux(2), trois(3), quatre(4), cinq(5),
		  six(6), sept(7), huit(8), neuf(9), dix(10),
		  valet(10), dame(10), roi(10), as(20);

          //RECUPERATION DES VALEURS CHIFFRES mis en argument des élèments de la liste Valeur
          //création de la valeur privée valeur de type entier
		       private int valeur;
          //constructeur pour initialiser la valeur v
		       Valeur(int v) {
			          valeur=v;
		            }
          //méthode pour retourner la valeur "Valeur" récupérée précedemment
		       public int getvaleur(){
			        return valeur;
		          }
    }

//ATTRIBUTS
  /*** variables static donc pas besoin d'instancier la classe  ***/
    //création des valeurs statiques "LARGEUR" et "HAUTEUR" de type double
    public static double LARGEUR;
    public static double HAUTEUR;
    //création de la valeur "DIR_IMG" de type string pour créer des liens Images/ pour utiliser les images des cartes pour les questions prochaines
    private static String DIR_IMG = "Images/";
    //création de la valeur "DOS_CARTE" de type image
    private static Image DOS_CARTE;
    /***                   ***/
    //création des valeurs couleur valeur et img de type respectives couleur valeur et image
    private Couleur couleur;
    private Valeur valeur;
    private Image img;

//METHODE
    //création d'une methode static
    static {
      //on affecte à la variable "DOS_CARTE" une nouvelle image de lien Images/dos.gif
	     DOS_CARTE = new Image(DIR_IMG + "dos.gif");
       //initialise les valeurs largeur et hauteur en affectant la valeur de la largeur et la longueur de l'image DOS_CARTE
	     LARGEUR = DOS_CARTE.getLargeur();
	     HAUTEUR = DOS_CARTE.getHauteur();
    }

//CONSTRUCTEUR Carte en initialisant les valeurs valeur couleur et...
    public Carte(Valeur v, Couleur c){
	     this.valeur=v;
	     this.couleur=c;
       //la création d'une image associée avec sa valeur et sa couleur
	     this.img= new Image(DIR_IMG + this.valeur+"-"+this.couleur+".gif");
    }

//METHODE getcouleur  qui retourne la valeur couleur
    public Couleur getCouleur(){
	     return this.couleur;
    }

//METHODE getvaleur  qui retourne la valeur valeur
    public Valeur getValeur(){
	     return this.valeur;
	    }

//METHODE toString de type String pour retourner sous représentation textuelle ("caractères") les cartes dans le terminal
    public String toString(){
	     return ("["+this.valeur+"("+this.valeur.getvaleur()+")"+","+this.couleur+"]");
    }

//CONSTRUCTEUR "compareTo" compare la valeur de 2 cartes l'une mise en paramètre ("Carte c") avec l'autre carte étudiée défini en ATTRIBUTS
    public int compareTo(Carte c){
      //soit la variable diff qui calcule la différence entre la valeur des 2 cartes
	     int diff = c.valeur.getvaleur()-this.valeur.getvaleur();
       //si la différence est négative, la carte mise en paramètre est plus petite (moins de valeur) que celle étudiée, définie en ATTRIBUTS
	     if (c.valeur.getvaleur()<this.valeur.getvaleur()){
         //affiche le résultat de leur différence
	        return diff;
	       }
      //Respectivement ....
	     if(c.valeur.getvaleur()>this.valeur.getvaleur()){
	        return diff;
	       }
      //Sinon retourne la valeur 0 c'est a dire elles sont de même valeur
	     else {
	        return 0;
	       }
    }

//CONSTRUCTEUR qui initialise la planche Dessin en foncttion des coordonnées (x,y) mises en paramètre ...
    public void dessiner(PlancheADessin pad, double x, double y, int p){
        //placement du point d'origine de la PlancheADessin ou l'image
	      this.img.setOrig(x,y);
        //on définit l'image sous une certaine profondeur
	      this.img.setProfondeur(p);
        //...et affichera l'image associé à la carte initialisée précédemment.
	      pad.ajouter(img);
    }
}
