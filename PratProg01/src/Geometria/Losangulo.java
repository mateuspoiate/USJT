package Geometria;

public class Losangulo extends Quadril�tero{
	
	//Constructor
	public Losangulo (double base, double altura) {
		super(base, altura);
	}
	
	//Superposes Perimetro
	@Override
	public double perimetro() {
		return base * 4;
	}
}
