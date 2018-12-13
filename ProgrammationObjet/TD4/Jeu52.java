import java.util.Random;

//CLASSE JEU52
public class Jeu52{
//ATTRIBUTS
    //Création du tableau de cartes "cartes" de 52 cartes
    private Carte[] cartes=new Carte[52];

  //METHODE Jeu52 qui fabrique et intialise le tableau de cartes qui pour l'instant est ordonné
    public Jeu52(){

	     //initialise la constante i au rang 0
        int i=0;

	      //pour chaque couleur parcouru dans la classe enum Couleur(dans la classe Carte)
	      for (Carte.Couleur c: Carte.Couleur.values()){

	         //pour chaque valeur parcouru dans la classe enum Valeur (dans la classe Carte)
	         for (Carte.Valeur v: Carte.Valeur.values()){

		           //initialise dans le tableau une nouvelle carte
		            cartes[i]= new Carte(v,c);
		            i++;
	             }
	         }
     }

  //METHODE toString de type String pour représenter sous représentation textuelle les cartes du tableau
    public String toString(){

	//On définit la variable l de type String(caractère) qui est vide
	String l="";

	//définit la variable k de type entier
	int k;

	//En parcourant de la première carte jusqu'à la dernière carte...
	for (k=0;k<cartes.length;k++){

	    //on écrit après la carte précédente,la nouvelle carte qui suit sous représentation textuelle
	    l=l+cartes[k].toString();
	}
	//On retourne l'ensemble des cartes stockées dans "l"
	return l;
    }

  //METHODE melanger qui permet de mélanger les cartes du tableau "cartes"  et ne renvoie rien
    public void melanger(){

      //En parcourant de la première carte du tableau jusqu'à la dernière Carte du tableau
	    for(int j=0;j<52;j++){

          //On définit "a" comme un élèment aléatoire (qui sera par la suite un nombre)
	         Random a=new Random();

          //Ici nous considérons "ax" un entier qui est un nombre aléatoire de a compris entre 0 et 52
	         int ax= a.nextInt(52);

          //De même on définit "b" comme un élèment aléatoire (qui sera par la suite un nombre)
	         Random b =new Random();

          //Et "bx" un entier qui est un nombre aléatoire de b compris entre 0 et 52
	         int bx = b.nextInt(52);

          //Soit une carte c qui est une carte aléatoire du tableau
	         Carte c = cartes[ax];

           //Nous allons échanger notre carte aléatoire du tableau par une autre carte aléatoire du tableau
	         cartes[ax] = cartes[bx];

           //cette nouvelle carte aléatoire sera notre nouvelle carte c
	         cartes[bx] = c;
	        }
	}

//METHODE getCarte qui renvoie un tableau de cartes
    public Carte[] getCarte(){
	     //on retourne la valeur cartes
	      return this.cartes;

	}

//METHODE ordonner qui ordonnera selon la valeur mais ne renvoie rien
    public void ordonner(){

      //soit j un entier
	     int j;

      //soit i un entier
	     int i;

      //En parcourant toutes les cartes une par une du tableau
       for(i=0;i<cartes.length;i++){

          //On se sert d'une balise en affectant l'entier C à i
	        int C=i;

          //Pour chaque carte étudiée
	        for(j=i+1;j<cartes.length;j++)

              //Si ta carte mis en paramètre ici C, est plus petite que ta carte étudiée prise en premier lieu
		           if(cartes[j].compareTo(cartes[C])>=0){

                 //alors notre balise aura le nombre j sinon non
		               C=j;
              }
              //Ainsi on peut conclure que si notre balise est différente comparé à l'initialisation
	             if(i != C){

                  //Alors nous créons une nouvelle carte c du tableau de cartes cartes
		               Carte c = cartes[i];

                   //nous échangeons Ainsi la carte de plus petite valeur par une autre carte de plus grande valeur
		               cartes[i]=cartes[C];

                   //Notre nouvelle carte a donc une plus grande valeur
		               cartes[C]=c;
		               }


	           }
        }



}
