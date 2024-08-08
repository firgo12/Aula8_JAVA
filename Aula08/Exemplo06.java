import java.util.Scanner;

public class Exemplo06 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Chamada função carregar
		int pedidos[][] = carregar();
		visualizar(pedidos);
		int somaPed [] = somar(pedidos);
		visualizarVetor(somaPed);
	}

	//Função pedidos!
	public static int [][] carregar(){
		int pedidos [][] = new int [3][3];
		
		for(int i=0;i<3;i++){//Linha
			for(int j=0;j<3;j++){//Coluna
				System.out.println("Digite um número: ");
				pedidos[i][j] = entrada.nextInt();
			}
		}
		
		return pedidos;
	}
	
	public static void visualizar(int pedidos[][]){
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.print(pedidos[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}
	
	public static int [] somar(int [][] pedidos){
		
		int somaPed [] = new int[3];
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				somaPed[i] +=pedidos[i][j];
			}
		}
		
		return somaPed;
	}
	
	public static void visualizarVetor(int [] somaPed){
		System.out.println("");
		System.out.println("--------------- Soma Linha ---------------");
		for(int i=0;i<3;i++){
			System.out.println("Soma Linha "+(i+1)+": "+somaPed[i]);
		}
	}
}
