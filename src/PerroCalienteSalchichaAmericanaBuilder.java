
public class PerroCalienteSalchichaAmericanaBuilder extends PerroCalienteBuilder {
	
	
	public PerroCalienteSalchichaAmericanaBuilder() {
		super.perro = new PerroCaliente();
	}
	
	@Override
	public void seleccionarYCocinarSalchicha() {
		perro.setSalchicha("Americana");
		System.out.println("Cocinando salchicha americana...");
	}

	@Override
	public void abrirPan() {
		System.out.println("Abriendo pan...");
		
	}

	@Override
	public void armarPerroCaliente() {
		System.out.println("Armar perro caliente");
		
	}

}
