
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */
public class Atributo {
	private String nombre;
	private int valor;
	private int condicion;
	
	public Atributo(String nombre, int valor, int condicion){
		this.nombre = nombre;
		this.valor = valor;
		this.condicion = condicion;
	}

	/**
	 * @return the nombre
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
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	/**
	 * @return the condicion
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

}
