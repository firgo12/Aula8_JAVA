import java.util.Scanner;

public class Ex04 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		String criterio [] = new String []{"Sistema parado", "Grave", "Não Grave", "Dúvida ou questão"};
		int info [][] = info();
		int  relatorioCriterio [] = relatorioCriterio(info);
		info();
		relatorio(info);
		
		System.out.println("------ RELATÓRIO DE CHAMADOS POR CRITÉRIO ------");
		
		for (int i =0;i<4;i++){
			System.out.println("Número de chamadas - "+criterio [i]+":"+relatorioCriterio [i]);
		}
	}

	public static int [][] info(){
		int critErro [][] = new int [5][3];
		
		for(int i =0; i< 5;i++){
			System.out.println("Digite a identificação do funcionário: ");
			critErro [i][0] = entrada.nextInt();
			
			System.out.println("Digite o código do Erro: ");
			critErro [i][1] = entrada.nextInt();
			
			while(critErro [i][1] <= 0 || critErro [i][1] >=4){
				System.out.println("Digite, CORRETAMENTE, o código do Erro: ");
				critErro [i][1] = entrada.nextInt();
			}
			
			System.out.println("Digite o critério do Chamado: ");
			critErro [i][2] = entrada.nextInt();
			
			while(critErro [i][2] <= 0 || critErro [i][2] >=5){
				System.out.println("Digite, CORRETAMENTE, o critério do Chamado: ");
				critErro [i][2] = entrada.nextInt();
			}
			
			//for(int j=0;j<3;j++){}
		}
		
		return critErro;
	}
	
	public static void relatorio(int [][] info){

		int contadorErro1 =0,contadorErro2 =0, contadorErro3 =0 ;
		
		System.out.println("----------- RELATÓRIO DE CHAMADAS POR ERRO -----------");
		System.out.println("");
		for(int i =0; i< 5;i++){
			if (info [i][1] == 1){
				contadorErro1++;
			} else {
				if (info [i][1] == 2){
					contadorErro2++;
				} else {
					contadorErro3++;
				}
			}
		}
		System.out.println("Número de chamdos com o Código de erro 1: "+contadorErro1);
		System.out.println("Número de chamdos com o Código de erro 2: "+contadorErro2);
		System.out.println("Número de chamdos com o Código de erro 3: "+contadorErro3);
		
	}
	
	public static int [] relatorioCriterio (int [][] info){
		int relatorioCrit [] = new int [4];
		
		for(int i =0; i< 5;i++){
			if(info [i][2] == 1){
				relatorioCrit [0] += 1;
			} else {
				if(info [i][2] == 2){
					relatorioCrit [1] += 1;
				} else {
					if (info [i][2] == 3){
						relatorioCrit [2] += 1;
					} else {
						relatorioCrit [3] += 1;
					}
				}
			}
		}
		
		return relatorioCrit;
	}
}
