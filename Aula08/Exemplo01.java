import java.util.Scanner;
public class Exemplo01 {
	static Scanner entrada = new Scanner(System.in); //Deixando como global, usando static no come�o
	//Estrutura Principal
	public static void main(String[] args) {
		//Chamada do PROCEDIMENTO
		verifica();

	}//Principal

	//PROCEDIMENTO
	public static void verifica(){
		int numero=0;
		
		System.out.print("Digite um n�mero: ");
		numero=entrada.nextInt();
		
		if(numero %2 ==0){
			System.out.println("Par!");
		} else{
			System.out.println("�mpar!");
		}
	}
}
