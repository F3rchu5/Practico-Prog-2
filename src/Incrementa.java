
public class Incrementa extends Pocima{

	public Incrementa(String nombre, int valor) {
		super(nombre, valor);
	
	}
	
	protected double calcular(Atributo a,double v){
		double operacion;
		operacion = a.getValor()+( a.getValor()* this.getValor()/100);
		return operacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Incrementa [getNombre()=" + getNombre() + ", getValor()="
				+ getValor() + "]";
	}
	
}
