package lab2;
import java.util.Arrays;
public class problema_1 {
	public static void main(String args[]) {
		problema_1 arr = new problema_1();
		int[] numeros = { 1, 2, 3,};
		  System.out.println("Array invertido: " + Arrays.toString(arr.invertirArray(numeros)));
	}

	public int[] invertirArray(int[] A) {
		/** */
		// Procedimiento para invertir la matriz
		/** */
		int[] Ain = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			Ain[A.length - 1 - i] = A[i];
		}
		return Ain;
	}
}
