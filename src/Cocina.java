
public class Cocina {
	private PerroCalienteBuilder perroBuilder;
	 
    public void setPerroBuilder(PerroCalienteBuilder pb) { perroBuilder = pb; }
    public PerroCaliente getPerro() { return perroBuilder.getPerro(); }
 
    public void construirPerro() {
    	perroBuilder.seleccionarYCocinarSalchicha();
    	perroBuilder.abrirPan();
    	perroBuilder.armarPerroCaliente();
    	
    }
}
