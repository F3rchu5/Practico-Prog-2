
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class AtributoPorMayor extends Atributo{
	
	/**
	 * Constructor AtributoPorMayor
	 * @param n
	 * @param v
	 * @param c
	 */
	public AtributoPorMayor(String n, int v, int c){		
		super(n,v,c);
	}
	
	public int comparar(Atributo a) {
		if (a.getValor()>this.getValor()) 
			return 1;
		else 
			if (a.getValor()<this.getValor())
				return -1;
		
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Atributo Por Mayor --> Nombre=" + getNombre()
				+ ", Valor=" + getValor() + ", Condicion="
				+ getCondicion();
	}
	
}
