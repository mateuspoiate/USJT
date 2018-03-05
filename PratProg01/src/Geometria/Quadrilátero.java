package Geometria;

public class Quadrilátero extends Poligono{
	
	//Construtor
	public Quadrilátero(double base, double altura) {
		super(base, altura);
	}
	
	//Sobreposição da area. Esta area vai permanecer em sua heranças.
	@Override
	public double area() {
		return base * altura;
	}
	
	//Sobreposição do perimetro
	@Override
	public double perimetro() {
		return 0;
	}

}
