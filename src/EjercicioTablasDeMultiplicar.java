
public class EjercicioTablasDeMultiplicar {
	public static void main(String[] args) {
		
		for(int contador = 0; contador <=10 ; contador ++) {
			for(int multiplo = 0; multiplo <=10; multiplo ++) {
				System.out.print(contador*multiplo); //Sin el ln
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
