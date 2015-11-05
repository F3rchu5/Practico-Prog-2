
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class ValorFijo extends Pocima{

	/**
	 * Constructor
	 * @param nombre
	 * @param valor
	 */
	public ValorFijo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	/**
	 * Realiza el calculo del valor del atributo
	 * @param a
	 * @return un valor
	 */
	protected double calcular(Atributo a){
		return getPorcentaje();
	}

}
