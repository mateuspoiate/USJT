package Geometria;

public abstract class Poligono extends Figura{
	//Variaveis
	public double base;
	public double altura;
	
	//Construtor
	public Poligono(double base,double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//Gets e Sets
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Sobreposi��o do metodo area
	@Override
	public abstract double area();
	
	//Sobreposi��o do m�todo perimetro
	@Override
	public abstract double perimetro();

}
