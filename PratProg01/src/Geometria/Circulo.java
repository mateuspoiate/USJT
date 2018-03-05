package Geometria;

public class Circulo extends Figura{
	//Variaveis
	private double raio;
	
	//Construtor
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	//Gets e Sets
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	//Sobreposição Area
	@Override
	public double area() {
		return Math.pow(getRaio(), 2) * Math.PI;
	}
	
	//Sobreposição Perimetro
	@Override
	public double perimetro() {
		return 2 * getRaio() * Math.PI; 
	}
	
}
