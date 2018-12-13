import PaD.*;

public class Jeu{
    public static void main(String [] args){
        Carte c1 = new Carte(Carte.Valeur.dame, Carte.Couleur.pique);
	Carte c2 = new Carte(Carte.Valeur.six, Carte.Couleur.trèfle);
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c1.compareTo(c2));
	PlancheADessin pad = new PlancheADessin();
	c1.dessiner(pad,0,0,2);
  c2.dessiner(pad,20,0,1);
    }
}
