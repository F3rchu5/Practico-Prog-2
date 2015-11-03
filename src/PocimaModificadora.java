
public class PocimaModificadora extends Pocima{

	/**
	 * @param nombre
	 * @param valor
	 */
	public PocimaModificadora(String nombre, int valor) {
		this.nombre = nombre;
		this.valor = valor;
	}
	
	protected double calcular(Atributo a){
		double operacion;
		operacion = a.getValor()+( a.getValor()* this.getPorcentaje()/100);
		return operacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PocimaModificadora [getNombre()=" + getNombrePocima() + ", getValor()="
				+ getPorcentaje() + "]";
	}
	
}
