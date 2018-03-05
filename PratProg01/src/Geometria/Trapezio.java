package Geometria;

public class Trapezio extends Poligono {
	
	//Declarar Variaveis
	public double base2;
	public double lado1;
	public double lado2;

	
	//Constructor
	public Trapezio(double base, double altura, double base2, int lado1, int lado2) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.base2 = base2;

	}
	
	//Superposes area
	@Override
	public double area() {
		return ((base2 + base) * altura)/2 ;
	}

	//Superposes perimetro
	@Override
	public double perimetro() {
		return lado1+lado2+base+base2;
	}

}
