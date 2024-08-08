import java.util.Scanner;
public class Ex05 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		double arrayVetor [] = entrada();
		ordenacao(arrayVetor);

	}
	
	public static double [] entrada (){
		double arrayVetor [] = new double [5];
		
		for(int i=0;i<5;i++){
			arrayVetor [i] = Math.random()*100;
			System.out.println("Vetor criado: "+ arrayVetor [i]);
		}
		System.out.println("");
		
		return arrayVetor;
	}

	public static double [] ordenacao(double arrayVetor []){
		double aux =0;
		
		for (int j =0; j<5;j++){
			for (int i = 0; i<4;i++){
				if(arrayVetor [i] > arrayVetor [i+1]){
					aux = arrayVetor [i];
					arrayVetor [i] = arrayVetor [i+1];
					arrayVetor [i+1] = aux;
				}
			}
		}
		
		for(int i =0; i<5;i++){
			System.out.println("Posição ["+i+"]:"+arrayVetor[i]);
		}
		
		return arrayVetor ;
	}
	
}
