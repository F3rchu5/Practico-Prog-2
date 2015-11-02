
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
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}
	
	protected abstract double calcular(Atributo a,double v);
	
}
