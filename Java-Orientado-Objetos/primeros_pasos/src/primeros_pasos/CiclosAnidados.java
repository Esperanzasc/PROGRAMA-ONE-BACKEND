package primeros_pasos;

public class CiclosAnidados {

	public static void main(String[] args) {
		
		for(int contador = 0; contador <= 10; contador++) {
			for (int multiplicacion = 0; multiplicacion <= 10; multiplicacion++) {
				int mresult = contador * multiplicacion;
				System.out.println(contador +" * "+ multiplicacion +" = "+ mresult);
			}
		}

	}

}
