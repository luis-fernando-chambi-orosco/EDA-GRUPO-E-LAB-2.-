package lab2;

public class problema_3 {
	public void trianguloRecursivo(int base) {
		/** */
		// Procedimiento para imprimir triángulo
		/** */
		if (base > 0) {
			trianguloRecursivo(base - 1);
			for (int i = 0; i < base; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String args[]) {
		problema_3 arr = new problema_3();
		int b = 5;
		arr.trianguloRecursivo(b);

	}
}
