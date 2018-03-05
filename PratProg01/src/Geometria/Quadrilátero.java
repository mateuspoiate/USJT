package Geometria;

public class Quadril�tero extends Poligono{
	
	//Construtor
	public Quadril�tero(double base, double altura) {
		super(base, altura);
	}
	
	//Sobreposi��o da area. Esta area vai permanecer em sua heran�as.
	@Override
	public double area() {
		return base * altura;
	}
	
	//Sobreposi��o do perimetro
	@Override
	public double perimetro() {
		return 0;
	}

}
