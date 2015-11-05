
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class PocimaSelectivaAtributo extends PocimaModificadora{

	/**
	 * Constructor
	 * @param nombre
	 * @param valor
	 */
	public PocimaSelectivaAtributo(String nombre, int valor) {
		super(nombre, valor);
	}
	
	/**
	 * Realiza el calculo del valor del atributo
	 * @param a
	 * @return un valor
	 */
	protected double calcular(Atributo a){
		if (a.getNombre().equals(getNombrePocima())){
			double operacion = a.getValor()+( a.getValor()* this.getPorcentaje()/100);
			return operacion;
		}
		else
			return a.getValor();
	}

}
