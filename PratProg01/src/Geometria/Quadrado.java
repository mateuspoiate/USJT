package Geometria;

public class Quadrado extends Quadrilátero implements Diagonal{
	
	//Constructor 
	public Quadrado(double base, double altura) {
		super(base, altura);
	}
	
	//Superposes perimetro
	@Override
	public double perimetro() {
		return base * 4;
	}
	
	//Superposes diagonal
	@Override
	public double diagonal() {
		return base * Math.pow(2, 0.5);
	}
}
