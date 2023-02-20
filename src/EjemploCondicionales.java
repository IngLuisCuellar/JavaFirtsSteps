
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Condicionales");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = true; //Almacena valor de true o false 

		// || --> Condicional O
		// && --> Condicional y
		if (edad >= 18 && esPareja) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido para entrar");
		}
	}
}