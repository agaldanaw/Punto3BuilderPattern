
public class BuilderPatternMain 
{
	public static void main(String[] args) 
	{
        Cocina cocina = new Cocina();
        PerroCalienteBuilder perroAmericana = new PerroCalienteSalchichaAmericanaBuilder();
        PerroCalienteBuilder perroCorriente = new PerroCalienteSalchichaCorrienteBuilder();
 
        cocina.setPerroBuilder( perroAmericana );
        cocina.construirPerro();
 
        PerroCaliente perro = cocina.getPerro();
        
        System.out.println("------------- Primer perro: " + perro);
        
        cocina.setPerroBuilder( perroCorriente );
        cocina.construirPerro();
 
        PerroCaliente perro2 = cocina.getPerro();
        
        System.out.println("---------------- Segundo perro: " + perro2);
    }
}
