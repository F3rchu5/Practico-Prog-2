
public class PocimaLimitada extends Decrementa{
	private int uso=0;
	public PocimaLimitada(String nombre, int valor) {
		super(nombre, valor);
	}
	
	protected double calcular(Atributo a,double v){
		double operacion=0;
		if (this.uso==1){
			operacion = a.getValor()+( a.getValor()* 20/100);
		}else{
			if (this.uso==2){
				operacion = a.getValor()+( a.getValor()*10/100);
			}
			
		}
	return v + operacion;
	}
}
