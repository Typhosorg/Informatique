public class Rectangle extends Figure {
    protected double longueur;
    protected double largeur;

    public Rectangle(double l, double L){
	super(new Point(0,0));
	this.largeur=l;
	this.longueur=L;
    }
    public double périmètre(){
	return (this.longueur*2)+(this.largeur*2);
    }
    public double surface(){
	return (this.longueur*this.largeur);
    }
    public void changerLongueur(double L1){
	this.longueur=L1;
    }
    public void changerLargeur(double l1){
	this.largeur=l1;
    }
    public String toString(){
	String res="+";
	
	
	for(double i=0; i<(this.longueur);i++){
	    res=res+"--";
	    
	}
	res=res+"+"+"\n";
	
	
	for(double j=0; j<(this.largeur);j++){
	    res=res+"|";	    
	    for(double i=0;i<(this.longueur*2);i++){
		    res=res+" ";
		    
	    }
	
	    res=res+"|"+"\n";
	    
	}
	res=res+"+";
	for(double i=0; i<(this.longueur);i++){
	    res=res+"--";
	    
	}
	res=res+"+";
	return res;
    }	
}
		    
