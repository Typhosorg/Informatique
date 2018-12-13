public abstract class Figure{
    protected Point origine;

    public Figure(Point o){
	this.origine=o;
	
    }
	//méthodes abstraites
    public abstract double périmètre();
    
    
    public abstract double surface();
    

    

}
