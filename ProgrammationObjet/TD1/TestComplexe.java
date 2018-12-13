public class TestComplexe {
    public static void main(String [] args) {
	Complexe c1 = new Complexe(32,-234);
	System.out.println(c1);
	Complexe c2 = new Complexe();
	System.out.println(c2);
	
	//test des 2 méthodes 13
        System.out.println(c1.PartieRéelle());
	System.out.println(c1.PartieImaginaire());
	//Test 16
	System.out.println(c1.rho());
	System.out.println(c1.theta());
	System.out.println(c1.polComplexe(2,Math.PI/3));
	    }
}
	
