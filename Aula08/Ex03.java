package Aula08;
import java.util.Scanner;
public class Ex03 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String [] arrayNomes = new String [4];
		double [] arraySalario = new double [4];
		double [] arrayTempoServico = new double [4];
		
		
		for (int i=0;i<4;i++) {
			System.out.print("Digite o nome do "+(i+1)+"� funcion�rio: ");
			arrayNomes [i] = entrada.next();
			System.out.print("Digite o sal�rio do "+(i+1)+"� funcion�rio: ");
			arraySalario [i] = entrada.nextDouble();
			System.out.print("Digite o tempo de servi�o do "+(i+1)+"� funcion�rio: ");
			arrayTempoServico [i] = entrada.nextDouble();
			System.out.println();
		}
		System.out.println();
		System.out.println("------------------------------- Relat�rio dos funcion�rios que tem direito a uma promo��o -------------------------------");
		for(int i=0;i<4;i++){
			String verificacao = verificacao(arraySalario[i],arrayTempoServico[i]);
			relatorio(arrayNomes[i],verificacao);
			
		}
		

	}//Fim do main
	
	//Fun��o 
	public static String verificacao (double arraySalario, double arrayTempoServico) {
		String verificacao = null;
		if(arraySalario <= 700 || arrayTempoServico > 3) {
			verificacao = "Parab�ns! Tem direito a uma promo��o.";
		} else {
			verificacao = "Infelizmente, esse funcion�rio N�O tem direito a uma promo��o...";
		}
		
		return verificacao;
	}
	
	public static void relatorio (String arrayNomes, String verificacao) {
		
		System.out.println(arrayNomes+ " --- "+verificacao);
		
	}

}
