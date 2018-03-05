package Geometria;
import java.util.ArrayList;

public class Geometria {
	public static void main(String[] args) {
		
		//Declara Variavies
		ArrayList<Figura> figuras = new ArrayList<>();
		
		//Adicionar 
		figuras.add(new Circulo(12));
		figuras.add(new Triangulo(7,4,9,9));
		figuras.add(new Quadrado(2,2));
		figuras.add(new Retângulo(3,7));
		figuras.add(new Losangulo(5,8));
		figuras.add(new Trapezio(3,8,9,7,6));
		
		//Imprimir
		for(Figura varredura:figuras){
			System.out.println(varredura.area());
			System.out.println(varredura.perimetro());
		
			if(varredura instanceof Diagonal){ 
				System.out.println(((Diagonal)varredura).diagonal());
			}
		}
	}

}
