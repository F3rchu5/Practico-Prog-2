


public class ValorFijo extends Pocima{

	/**
	 * @param nombre
	 * @param valor
	 */
	public ValorFijo(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	protected double calcular(Atributo a,double v){
		return getValor();
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
