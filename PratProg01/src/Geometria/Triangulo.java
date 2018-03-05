package Geometria;

public class Triangulo extends Poligono{
	//Declarar Variavies
	public int lado1;
	public int lado2;
	
	//Construtor
	public Triangulo (double base, double altura, int lado1, int lado2) {
		super(base, altura);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	//Sobreposição da area
	@Override
	public double area() {
		return (base * altura)/2;
	}

	//Sobreposição do perimetro (VAZIO)
	@Override
	public double perimetro() {
		return lado1+lado2+base;
	}
	
}
