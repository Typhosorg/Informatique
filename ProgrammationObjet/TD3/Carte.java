import PaD.*;


public class Carte {
    public enum Couleur{trèfle, carreau, coeur, pique}
    public enum Valeur{deux(2), trois(3), quatre(4), cinq(5),
		  six(6), sept(7), huit(8), neuf(9), dix(10),
		  valet(10), dame(10), roi(10), as(20);

		     private int valeur;

		     Valeur(int v) {
			 valeur=v;
		     }
		     public int getvaleur(){
			 return valeur;
		     }
    }
    public static double LARGEUR;
    public static double HAUTEUR;

    private static String DIR_IMG = "Images/";
    private static Image DOS_CARTE;

    private Couleur couleur;
    private Valeur valeur;
    private Image img;

    static {
	DOS_CARTE = new Image(DIR_IMG + "dos.gif");
	LARGEUR = DOS_CARTE.getLargeur();
	HAUTEUR = DOS_CARTE.getHauteur();
    }

    public Carte(Valeur v, Couleur c){
	this.valeur=v;
	this.couleur=c;
	this.img= new Image(DIR_IMG + v +"-"+ c +".gif");
    }
    public Couleur getCouleur(){
	return this.couleur;
    }
    public Valeur getValeur(){
	return this.valeur;
	    }
    /**public int toString1(){
	return (this.valeur.values());
	}**/

    public String toString(){
	return ("["+this.valeur+"("+this.valeur.getvaleur()+")"+","+this.couleur+"]");

    }
    public int compareTo(Carte c){
	int diff = c.valeur.getvaleur()-this.valeur.getvaleur();
	if (c.valeur.getvaleur()<this.valeur.getvaleur()){
	    return diff;
	}
	if(c.valeur.getvaleur()>this.valeur.getvaleur()){
	    return diff;
	}

	else {
	    return 0;
	}
    }
    public void dessiner(PlancheADessin pad, double x, double y, int p){
	      this.img.setOrig(x,y);
	      this.img.setProfondeur(p);
	      pad.ajouter(img);
    }
}
