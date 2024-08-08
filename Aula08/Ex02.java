package Aula08;
import java.util.Scanner;

public class Ex02 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		int codigocaminhao =0; 
		double tonelada =0, valorFinal =0, precoCarga =0;
		
		System.out.print("Digite o código do caminhão: ");
		codigocaminhao = entrada.nextInt();
		System.out.print("Digite a carga em toneladas do caminhão "+codigocaminhao+" : ");
		tonelada = entrada.nextDouble();
		
		System.out.println();
		precoCarga = precoCarga(tonelada);
		valorFinal = valorFinal(precoCarga);
		
		System.out.println("Valor Final: "+ valorFinal);
	}
	
	public static double precoCarga (double tonelada){
		int codigoCarga =0;
		double quilo =0, precoCarga =0;
		quilo = tonelada * 1000;
		
		System.out.println("Digite o código da carga: ");
		codigoCarga = entrada.nextInt();
		
		if (codigoCarga >= 1 && codigoCarga <= 10){
			precoCarga = quilo * 120;
		} else {
			if (codigoCarga >= 11 && codigoCarga <= 20){
				precoCarga = quilo * 200;
			} else {
				if (codigoCarga >= 21 && codigoCarga <= 30){
					precoCarga = quilo * 280;
				}
			}
		}
		
		return precoCarga;
	}
	
	public static double valorFinal (double precoCarga){
		double valorFinal =0;
		int codigoEstado =0;
		
		System.out.println("Digite o código do Estado: ");
		codigoEstado = entrada.nextInt();
		
		if (codigoEstado == 1){
			valorFinal = precoCarga * 1.25;
		} else {
			if (codigoEstado == 2){
				valorFinal = precoCarga * 1.20;
			} else {
				if (codigoEstado == 3){
					valorFinal = precoCarga * 1.15;
				} else {
					if (codigoEstado == 4){
						valorFinal = precoCarga * 1;
					}
				}
			}
		}
		
		return valorFinal;
	}

}