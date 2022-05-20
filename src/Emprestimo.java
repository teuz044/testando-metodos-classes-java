
public class Emprestimo {
	
	public static int getUmaParcelas() {
		return 1;
		
	}
	public static int getDuasParcelas() {
		return 2;
		
	}
	
	public static int getTresParcelas() {
		return 3;
		
	}
	
	public static double getTaxaUmaParcela() {
		return 0;
		
	}
	public static double getTaxaDuasParcelas() {
		return 0.3;
		
	}
	
	public static double getTaxaTresParcelas() {
		
		return 0.45;
	}
	
	public static void calcular(double valor, int parcelas) {
		
		if (parcelas == 2) {
			
			double valorFinal = valor + (valor * getTaxaDuasParcelas());
			
			System.out.println("O valor final do seu emprestimo é de: "+valorFinal);

		} else if (parcelas == 3) {
			
			double valorFinal = valor + (valor * getTaxaTresParcelas());
			
			System.out.println("O valor final do seu emprestimo é de: "+valorFinal);
			
		} else if (parcelas == 1) {
			
			double valorFinal = valor + (valor * getTaxaUmaParcela());
			
			System.out.println("O valor do seu emprestimo é de: "+valorFinal);

		} else 
			System.out.println("Número de parcelas inválido");
	}

}
