package Geometria;

public class Retângulo extends Quadrilátero implements Diagonal{
	
	//Constructor
	public Retângulo(double base, double altura) {
		super(base, altura);
	}
	
	//Superposes perimetro
	@Override
	public double perimetro() {
		return (base * 2) + (altura * 2);
	}
	
	//Superposes diagonal
	@Override
	public double diagonal() {
		return Math.pow(Math.pow(base, 2) + Math.pow(altura, 2), 0.5);
	}
	
	
}
