
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */
public abstract class Pocima {
	private String nombre;
	private int valor;
	
	/**
	 * @param nombre
	 * @param valor
	 */
	public Pocima(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}

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
