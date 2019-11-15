
public class PerroCalienteSalchichaCorrienteBuilder extends PerroCalienteBuilder {

	public PerroCalienteSalchichaCorrienteBuilder() {
		super.perro = new PerroCaliente();
	}
	
	@Override
	public void seleccionarYCocinarSalchicha() {
		perro.setSalchicha("Corriente");
		System.out.println("Cocinando salchicha corriente...");
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
