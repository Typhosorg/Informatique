public class Point{
    private double abscisse;
    private double ordonnée;

    public Point(double a, double b){
	this.abscisse=a;
	this.ordonnée=b;
    }
    public Point(){
	this.abscisse=0.0;
	this.ordonnée=0.0;
	
    }
    public double abscisse(){
	return this.abscisse;
    }
    public double ordonnée(){
	return this.ordonnée;
    }

}
