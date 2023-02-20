
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Condicionales");

		int edad = 17;
		int cantidadPersonas = 2;

		// || --> Condicional O
		// && --> Condicional y
		if (edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Usted puede entrar");
		} else {
			System.out.println("Usted no está permitido para entrar");
		}
	}
}