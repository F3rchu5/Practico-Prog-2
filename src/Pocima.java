
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public abstract class Pocima {
	protected String nombre;
	protected int valor;
	
	/**
	 * @return the nombre
	 */
	public String getNombrePocima() {
		return nombre;
	}

	/**
	 * @return the valor
	 */
	public int getPorcentaje() {
		return valor;
	}
	
	protected abstract double calcular(Atributo a);
	
}
