import java.util.Scanner;

public class Exemplo05 {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		double n1=0, n2=0, media =0;
		
		System.out.println("Digite nota1: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite nota2: ");
		n2 = entrada.nextDouble();
		//função
		media = media(n1,n2);
		//procedimento
		analise(media);
	}

	public static double media (double n1, double n2){
		double media=0;
		media=(n1+n2)/2;
		
		return media;
	}
	
	public static void analise(double media){
		if (media>=6){
			System.out.println("Aprovado");
			bonus();
		}else{
			System.out.println("Reprovado");
		}
	}
	
	public static void bonus(){
		System.out.println("Você recebeu 20% de bolsa");
	}
	
	
}
