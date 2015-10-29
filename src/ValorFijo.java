
public class ValorFijo extends Pocima{
	final static int VALORFIJO =5;

	public ValorFijo(String nombre, int valor) {
		super(nombre, valor);
	}
	
	protected double calcular(Atributo a,double v){
		v = VALORFIJO;
		return v;
	}

}
