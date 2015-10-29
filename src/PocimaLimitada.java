
public class PocimaLimitada extends Decrementa{
	private int uso=0;
	private int v2;
	public PocimaLimitada(String nombre, int valor, int v2) {
		super(nombre, valor);
		this.v2=v2;
	}
	
	protected double calcular(Atributo a,double v){
		double operacion=0;
		if (this.uso==1){
			operacion = a.getValor()+( a.getValor()* this.getValor()/100);
		}else{
			if (this.uso==2){
				operacion = a.getValor()+( a.getValor()*v2/100);
			}
			else{
				operacion=a.getValor();
			}
		}
	return v + operacion;
	}
}
