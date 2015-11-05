
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class PocimaLimitada extends Pocima{
	private int cantVeces=0;
	private double primera=20;
	private double segunda=10;
	
	
	/**
	 * Constructor
	 * @param nombre
	 * @param valor
	 */
	public PocimaLimitada(String nombre) {
		super.nombre = nombre;
	}

	/**
	 * Realiza el calculo del valor del atributo
	 * @param a
	 * @return un valor
	 */
	protected double calcular(Atributo a){
		double operacion=0;
		if (cantVeces==0){
			operacion = a.getValor()+( a.getValor()*primera/100);
		}else{
			if (this.cantVeces==1){
				operacion = a.getValor()+( a.getValor()*segunda/100);
			}
			else{
				operacion=a.getValor();
			}
		}
		cantVeces++;
		return operacion;
	}
	
}
