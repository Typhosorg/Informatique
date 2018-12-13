public class Eq2Degré{
    private static final double epsilon = 1E-10;
    private Complexe rac1, rac2;
    public String toString(){
	return ("racine1="+this.rac1+"et racine 2="+this.rac2); // initialement c'est 0.0
    }

    /** construction d'un objet Eq2degré avec les 3 coefficients a,b,c
     */

     Eq2Degré(double a, double b, double c){
	if (a==0){
	    System.out.println("ERREUR");
	    }
	else{
	    résoudre(a,b,c);
	}
     }
    private void résoudre(double a, double b, double c) {
	    double delta=b*b-4*a*c;
		if (delta >= 0) {
		    double r1=(-b+Math.sqrt(delta))/(2*a);
		    double r2=(-b-Math.sqrt(delta))/(2*a);
		    this.rac1=new Complexe(r1,0);
		    this.rac2=new Complexe(r2,0);
		}
	    
		else{
		    double r1=-b/(2*a);
		    double r2=r1;
		    double i1=Math.sqrt(-delta)/(2*a);
		    double i2=-i1;
		    this.rac1=new Complexe(r1,i1);
		    this.rac2=new Complexe(r2,i2);
		}
    }
    public Complexe premièreRacine(){
	return this.rac1;
    }
    public Complexe deuxièmeRacine(){
	return this.rac2;
    }

}

