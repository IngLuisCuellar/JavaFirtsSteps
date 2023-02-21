
public class EjercicioMatriz {
	public static void main(String[] args) {
		System.out.println("Matriz de asteríscos");
		System.out.println();
		
		for(int fila = 0; fila <=10; fila++) {
			for(int columna = 0 ; columna < fila; columna++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
}
