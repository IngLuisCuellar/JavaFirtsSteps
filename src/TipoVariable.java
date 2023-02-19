
public class TipoVariable {
	
	public static void main(String[] args) {
		System.out.println("Hola mundo!!!");
		
		int edad = 22;
		System.out.println("Mi edad es " + edad);
		
		double salario = 122.587;
		System.out.println("El salario es " + salario);
		
		//Ejemplo de Cast
		
		double variable = 125.35;
		int variableEntero = (int) variable; //Cast
		System.out.println("La variable " + variable + " en entero es " + variableEntero);
		
		long prueba = 12222222222222222L; //Es necesario etiquetar el número con una L, denotando que es una variable tipo long
		short numeroPequenho = 1320;
		byte numerMasPequenho = 12;
		float numeroDecimalPequenho = 2.5F;
	}

}
