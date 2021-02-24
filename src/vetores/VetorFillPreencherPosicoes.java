package vetores;

import java.util.Arrays;

public class VetorFillPreencherPosicoes {
	public static void main(String[] args) {

		int v[] = new int[10]; // prenche a lista de 10 posições com o valor zero.
		Arrays.fill(v, 1);
	
		for(int valor:v) {
			System.out.println(valor + " ");
		}
	}

}
