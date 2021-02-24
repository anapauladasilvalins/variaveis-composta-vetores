package vetores;

public class MesVetores {
	public static void main(String [] args) {
		
		String mês[] = {"Jan", "Fev","Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int tot []= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int c = 0; c < mês.length; c++) {
			System.out.println(mês[c] + " tem " + tot[c] + " dias");
			
		}
	}

}
