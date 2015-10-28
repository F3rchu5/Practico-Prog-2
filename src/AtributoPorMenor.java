
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class AtributoPorMenor extends Atributo{
	
	/**
	 * Constructor AtributoPorMenor
	 * @param n
	 * @param v
	 * @param c
	 */
	public AtributoPorMenor(String n, int v, int c){		
		super(n,v,c);
	}
	
	public int comparar(Atributo a) {
		
		if (a.getValor()<this.getValor()) 
			return 1;
		else 
			if (a.getValor()>this.getValor())
				return -1;
		
		return 0;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Atributo Por Menor --> Nombre=" + getNombre()
				+ ", Valor=" + getValor() + ", Condicion="
				+ getCondicion();
	}

}
