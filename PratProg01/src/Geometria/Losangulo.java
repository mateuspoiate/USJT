package Geometria;

public class Losangulo extends Quadrilátero{
	
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
