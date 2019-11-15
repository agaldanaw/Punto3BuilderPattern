
public class PerroCaliente {
	private String salchicha = "";
 
    public void setSalchicha(String salchicha)
    { 
    	this.salchicha = salchicha;
    }
    
    @Override
    public String toString() {
    	return "Perro caliente con salchicha " + salchicha;
    }

}
