import java.util.Scanner;
public class Exemplo03 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int menu=0, num1 =0, num2=0, r1 =0;
		
		System.out.println("1 - Adi��o");
		System.out.println("2 - Subtra��o");
		System.out.println("3 - Multiplica��o");
		System.out.println("4 - Divis�o");
		System.out.println("5 - Fechar o programa");
		System.out.println("");
		
		
		while (menu != 5){
			System.out.print("Digite a op��o desejada: ");
			menu = entrada.nextInt();
			if(menu > 0 && menu < 5){
				System.out.print("Digite o primeiro n�mero: ");
				num1 = entrada.nextInt();
				System.out.print("Digite o segundo n�mero: ");
				num2 = entrada.nextInt();
			}
			
			switch(menu){
			case 1:
				//Par�metro REAL!!!!!!!!
				adicao(num1,num2);
			break;
			case 2:
				subtracao(num1,num2);
			break;
			case 3:
				multiplicacao(num1,num2);
			break;
			case 4:
				divisao(num1,num2);
			break;
			case 5:
				menu = 5;
			break;
			default:
				System.out.println("Op��o inv�lida - Tente novamente");
			}
			System.out.println();
			
		}//fim while

	}
	
	//PROCEDIMENTO - N�o retorna nada, por conta do VOID!!!!
		//Par�metro FORMAL!!!!!!!!!
			public static void adicao(int num1, int num2){
				System.out.println("Resultado: "+ (num1+num2));
				
			}
			
			public static void subtracao(int num1, int num2){
				System.out.println("Resultado: "+ (num1-num2));
				
			}
			
			public static void multiplicacao(int num1, int num2){
				System.out.println("Resultado: "+ (num1*num2));
			}
			
			public static void divisao(double num1, double num2){
				System.out.println("Resultado: "+ (num1/num2));
				
			}

}
