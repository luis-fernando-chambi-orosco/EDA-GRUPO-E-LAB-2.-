package lab2;

public class problema_3 {
	public void trianguloRecursivo(int base) {
		/** */
		// Procedimiento para imprimir triángulo
		/** */
		// pones un condcionasl para que la bariable base no sea  un numero negativo
		if (base > 0) {
			// aplicamos recursividad es decir llamaramos el metodo dentro del mismo metodo 
			trianguloRecursivo(base - 1);// gracias a esto en un monento llegara a ser cero la variable 
			for (int i = 0; i < base; i++) {
				System.out.print("*");// imprimimos el asterisco
			}
			System.out.println();// esto hara que cuando acabe el for se pasa a la siguiente linea 
		}

	}
	public static void main(String args[]) {
		// // creamos un objeto de la clase problema_3
		problema_3 arr = new problema_3();
		int b = 5;
		// usamos el metodo trianguloRecursivo y le damos como parametro la variable b
		arr.trianguloRecursivo(b);

	}
}
