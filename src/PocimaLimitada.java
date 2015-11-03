
public class PocimaLimitada extends PocimaModificadora{
	private int cantVeces=0;
	private double primera=20;
	private double segunda=10;
	
	
	/**
	 * @param nombre
	 * @param valor
	 */
	public PocimaLimitada(String nombre, int valor) {
		super(nombre, valor);
	}

	protected double calcular(Atributo a){
		double operacion=0;
		if (cantVeces==1){
			operacion = a.getValor()+( a.getValor()*primera/100);
		}else{
			if (this.cantVeces==2){
				operacion = a.getValor()+( a.getValor()*segunda/100);
			}
			else{
				operacion=a.getValor();
			}
		}
		cantVeces++;
	return operacion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PocimaLimitada [cantVeces=" + cantVeces + ", primera=" + primera + ", segunda=" + segunda + ", getNombre()="
				+ getNombrePocima() + ", getPorcentaje()=" + getPorcentaje() + "]";
	}
	
}
