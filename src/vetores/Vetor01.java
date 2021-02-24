package vetores;

public class Vetor01 {

	public static void main(String [] args) {
		
		int n[] = {3, 2, 8, 7, 5, 4}; // Aqui são 6 posições
		
		for(int cont = 0; cont <= 5; cont++) { // Aqui deve ser <= 5 porque começa a contar do 0 ao 5, no total de 6 posições.
			//System.out.print(n[cont]);
			//System.out.print(n[cont] + ""); // Assim dá um espaço entre os números. Ou assim: 
			System.out.println(" posição [ " + cont + " ] = " + n[cont]);
			
		}
		
	}
	
}
