package Aula08;
import java.util.Scanner;
public class Ex03 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String [] arrayNomes = new String [4];
		double [] arraySalario = new double [4];
		double [] arrayTempoServico = new double [4];
		
		
		for (int i=0;i<4;i++) {
			System.out.print("Digite o nome do "+(i+1)+"º funcionário: ");
			arrayNomes [i] = entrada.next();
			System.out.print("Digite o salário do "+(i+1)+"º funcionário: ");
			arraySalario [i] = entrada.nextDouble();
			System.out.print("Digite o tempo de serviço do "+(i+1)+"º funcionário: ");
			arrayTempoServico [i] = entrada.nextDouble();
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------- Relatório dos funcionários que tem direito a uma promoção -------------------------------");
		for(int i=0;i<4;i++){
			String verificacao = verificacao(arraySalario[i],arrayTempoServico[i]);
			relatorio(arrayNomes[i],verificacao);
			
		}
		

	}//Fim do main
	
	//Função 
	public static String verificacao (double arraySalario, double arrayTempoServico) {
		String verificacao = null;
		if(arraySalario <= 700 || arrayTempoServico > 3) {
			verificacao = "Parabéns! Tem direito a uma promoção.";
		} else {
			verificacao = "Infelizmente, esse funcionário NÃO tem direito a uma promoção...";
		}
		
		return verificacao;
	}
	
	public static void relatorio (String arrayNomes, String verificacao) {
		
		System.out.println(arrayNomes+ " --- "+verificacao);
		
	}

}
