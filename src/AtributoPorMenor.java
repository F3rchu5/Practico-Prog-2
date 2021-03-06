
/**
 * @author Daniela Colamai y Fernanda Gonzalez
 *
 */

public class AtributoPorMenor extends Atributo{
	
	/**
	 * Constructor AtributoPorMenor
	 * @param n
	 * @param d
	 * @param c
	 */
	public AtributoPorMenor(String n, double d, int c){		
		super(n,d,c);
	}
	
	/**
	 * @param un atributo
	 * @return si el atributo es mayor, menor o igual
	 */
	public int comparar(Atributo a) {
		if (a.getValor()<this.getValor()) 
			return 1;
		else 
			if (a.getValor()>this.getValor())
				return -1;
		
		return 0;
	}
	
	/**
	 * @return una copia del atributo
	 */
	public Atributo getCopia(){
		return new AtributoPorMenor(this.getNombre(),this.getValor(),this.getCondicion());
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Atributo Por Menor --> " + getNombre()
				+ " = " + getValor();
	}
	
}
