package vetores;

public class MesVetores {
	public static void main(String [] args) {
		
		String m�s[] = {"Jan", "Fev","Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int tot []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int c = 0; c < m�s.length; c++) {
			System.out.println(m�s[c] + " tem " + tot[c] + " dias");
			
		}
	}

}
