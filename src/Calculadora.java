
public class Calculadora {
	
	public static void soma(double valor1, double valor2) {
		
		double resultado = valor1 + valor2;
		
		System.out.println("A soma de: " +valor1+ " mais " +valor2+ " �: "+resultado );
		
	}
	
	public static void subtracao(double valor1, double valor2) {
		
		double resultado = valor1 - valor2;
		
		System.out.println("A subtra��o de: "+valor1+ " menos " +valor2+ " �: "+resultado);
	}
	
	public static void multiplicacao(double valor1, double valor2) {
		
		double resultado = valor1 * valor2;
				
		System.out.println("A multiplica��o de: "+valor1+" multiplicado por "+valor2+" �: "+resultado);
	}

	public static void divisao(double valor1, double valor2) {
		
		double resultado = valor1 / valor2;
				
		System.out.println("A divis�o de: " +valor1+" dividido "+valor2+
				" �: "+resultado);
	}
}
