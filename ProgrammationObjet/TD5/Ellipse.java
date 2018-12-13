import PaD.*;
public class Ellipse extends Figure {
    protected double Gaxe;
    protected double Paxe;

    public Ellipse(double G,double p){
	super(new Point(0,0));
	this.Gaxe=G;
	this.Paxe=p;
    }
    public double surface(){
	return this.Gaxe*this.Paxe*Math.PI;
    }
    public double périmètre(){
	return Math.PI*(Math.sqrt(2*(Math.pow(this.Gaxe,2)+Math.pow(this.Paxe,2))));
    }
    public void dessiner(PlancheADessin pad){
	
	pad.ajouter();
    }
}
    
