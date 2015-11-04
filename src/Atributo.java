
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public abstract class Atributo {
	private String nombre;
	private double valor;
	private int condicion;
	
	/**
	 * Constructor Atributo
	 * @param nombre
	 * @param d
	 * @param condicion
	 */
	public Atributo(String nombre, double d, int condicion){
		this.nombre = nombre;
		this.valor = d;
		this.condicion = condicion;
	}

	/**
	 * @return el nombre del atributo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el valor del atributo
	 */
	public double getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}

	/**
	 * @return la condicion del atributo
	 */
	public int getCondicion() {
		return condicion;
	}

	/**
	 * @param condicion the condicion to set
	 */
	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}
	
	/**
	 * compara con el atributo y retorna el que gano
	 * @param a
	 * @return un atributo
	 */
	protected abstract int comparar(Atributo a);
    protected abstract Atributo getCopia();
}
