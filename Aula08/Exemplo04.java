import java.util.Scanner;
public class Exemplo04 {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		int n1 = 0, n2 = 0, r=0;
		
		System.out.print("Digite o n1: ");
		n1 = entrada.nextInt();
		System.out.print("Digite o n2: ");
		n2 = entrada.nextInt();

		//CHAMADA FUNÇÃO
		r = adicao(n1,n2);
		System.out.println("Resultado: "+r);
	}
	
	//CRIAR FUNÇÃO
	public static int adicao(int n1, int n2){
		int r=0;
		
		r=n1+n2;
		
		return r;
	}
	

}
