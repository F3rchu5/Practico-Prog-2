
public class PocimaSelectivaAtributo extends PocimaModificadora{

	public PocimaSelectivaAtributo(String nombre, int valor) {
		super(nombre, valor);
	}
	
	protected double calcular(Atributo a){
		double operacion=0;
		if (a.getNombre().equals(getNombrePocima())){
		operacion = a.getValor()+( a.getValor()* this.getPorcentaje()/100);
		
		}
		return operacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PocimaSelectivaAtributo [getNombrePocima()=" + getNombrePocima()
				+ ", getPorcentaje()=" + getPorcentaje() + "]";
	}

}
