/*
 Este programa muestra los múltiplos de 3
 en un rango de 1 a 100.  
  */
public class DesafioMultiplosDe3 {
	public static void main(String[] args) {
		for(int numero = 1; numero<=100; numero++) {
			if(numero%3 == 0) {
				System.out.println(numero);
			}
		}
	}
}
