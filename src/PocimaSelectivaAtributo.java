
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class PocimaSelectivaAtributo extends PocimaModificadora{

	public PocimaSelectivaAtributo(String nombre, int valor) {
		super(nombre, valor);
	}
	
	protected double calcular(Atributo a){
		if (a.getNombre().equals(getNombrePocima())){
			double operacion = a.getValor()+( a.getValor()* this.getPorcentaje()/100);
			return operacion;
		}
		else
			return a.getValor();
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
