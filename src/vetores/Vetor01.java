package vetores;

public class Vetor01 {

	public static void main(String [] args) {
		
		int n[] = {3, 2, 8, 7, 5, 4}; // Aqui s�o 6 posi��es
		
		for(int cont = 0; cont <= 5; cont++) { // Aqui deve ser <= 5 porque come�a a contar do 0 ao 5, no total de 6 posi��es.
			//System.out.print(n[cont]);
			//System.out.print(n[cont] + ""); // Assim d� um espa�o entre os n�meros. Ou assim: 
			System.out.println(" posi��o [ " + cont + " ] = " + n[cont]);
			
		}
		
	}
	
}
