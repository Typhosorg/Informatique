public class Carre extends Rectangle{
    

    public Carre(double c){
	super(c,c);
    }
    public void changerLongueur(double L1){
	this.longueur=L1;
	this.largeur=L1;
    }
    public void changerLargeur(double L1){
	this.largeur=L1;
	this.longueur=L1;
    }
}
