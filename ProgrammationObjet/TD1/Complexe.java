/* la classe complexe représente les nombres mathématiques complexes */
public class Complexe {
    private double réel;
    private double img;
    public String toString(){
	return ("("+this.réel+","+this.img+")"); // initialement c'est 0.0
    }
    public Complexe(double r,double i)
    {
	this.réel=r;
	this.img=i;
    }
    public Complexe()
    {
    	this.réel=0.0;
    	this.img=0.0;
    }
    private static final Complexe I=new Complexe(0.0,1.0);
       
    public double PartieRéelle()
    {
	return this.réel;
    	    }
    public double PartieImaginaire()
    {
    	return this.img;
   	    }
    public double rho(){
	return Math.sqrt(Math.pow(PartieRéelle(),2)+Math.pow(PartieImaginaire(),2));
	    }
    public double theta(){
	return Math.atan2(this.réel,this.img);
    }
    public static Complexe polComplexe(double n, double p)
    {
	double x=n*Math.cos(p);
	double y=n*Math.sin(p);
	Complexe C=new Complexe(x,y);
	return  C;
	    }
}
