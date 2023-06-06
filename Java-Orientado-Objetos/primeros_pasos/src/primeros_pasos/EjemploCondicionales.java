package primeros_pasos;

public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello world");

		int edad = 17;
		int cantidad = 1;

		if (edad >= 18) {
			System.out.println("Usted puede entrar, es mayor de edad");
		} else {
			if (cantidad >= 2) {
				System.out.println(
						"Usted es menor de edad, " + "pero esta permitido su ingreso porque estas acompañado.");
			} else
				System.out.println("Usted no tiene permitido entrar, es menor de edad " + "y no está acompañado.");
		}
	}

}
