package lab2;
import java.util.Arrays;
public class problema_1 {
	public static void main(String args[]) {
		// creamos un objetio de la clase problema_1
		problema_1 arr = new problema_1();
		// cremaos un array
		int[] numeros = { 1, 2, 3,};
		// imprimimos y llamamos al metodos invertirArrray con el parametro numeros 
		  System.out.println("Array invertido: " + Arrays.toString(arr.invertirArray(numeros)));
	}

	public int[] invertirArray(int[] A) {
		/** */
		// Procedimiento para invertir la matriz
		/** */
		// creamos un nuevo array 
		int[] Ain = new int[A.length];
		// dentro de este nuevo array guardaremos el array invertido 
		for (int i = 0; i < A.length; i++) {
			Ain[A.length - 1 - i] = A[i];
		}
		return Ain;
	}
}
