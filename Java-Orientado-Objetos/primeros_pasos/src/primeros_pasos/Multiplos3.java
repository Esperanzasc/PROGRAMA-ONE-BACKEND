package primeros_pasos;

public class Multiplos3 {

	public static void main(String[] args) {

		for(int numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0) {
				System.out.println("El numero " +numero+ " es multiplo de 3.");
			}
		}

	}

}
