
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class PocimaModificadora extends Pocima{

	/**
	 * Constructor
	 * @param nombre
	 * @param valor
	 */
	public PocimaModificadora(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	/**
	 * Realiza el calculo del valor del atributo
	 * @param a
	 * @return un valor
	 */
	protected double calcular(Atributo a){
		double operacion;
		operacion = a.getValor()+( a.getValor()* this.getPorcentaje()/100);
		return operacion;
	}

}
