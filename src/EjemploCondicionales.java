
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Condicionales");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1; //Almacena valor de true o false 

		// || --> Condicional O
		// && --> Condicional y
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		if (puedeEntrar) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido para entrar");
		}
	}
}