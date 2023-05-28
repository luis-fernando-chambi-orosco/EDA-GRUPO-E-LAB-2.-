package lab2;
import java.util.Arrays;
public class problema_2 {
	public static void main(String args[]) {
		problema_2 arr = new problema_2();
		int[] numeros = { 1, 2, 3,4 ,5};
		int d=2;
		for(int i=0;i<d;i++){
			arr.rotarIzquierdaArray(numeros);
		}
		System.out.println("Rotacion a la izquierda: " + Arrays.toString((numeros)));
		

			
		
		  
	}
	public int[] rotarIzquierdaArray(int[] Aiz) {
		int aux=Aiz[0];
		for (int i = 0; i < Aiz.length-1; i++){
			Aiz[i] = Aiz[i+1];
		}
		Aiz[Aiz.length-1]=aux;
		return Aiz;
	}
	

}
