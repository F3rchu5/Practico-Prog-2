
public class ValorFijo extends Pocima{
	final static int VALORFIJO =5;

	public ValorFijo(String nombre, int valor) {
		super(nombre, valor);
	}
	
	protected double calcular(Atributo a,double v){
		v = VALORFIJO;
		return v;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ValorFijo [getNombre()=" + getNombre() + ", getValor()="
				+ getValor() + "]";
	}

}
