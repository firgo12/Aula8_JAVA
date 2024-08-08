import java.util.Scanner;

public class Ex01 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		String nome, pagamento;
		int tipoAcomodacao = 0, qtd =0,calculoEstadia =0;
		double r =0;
		
		System.out.println("Digite o nome do hospede: ");
		nome = entrada.next();
		
		System.out.println("1 - Standard");
		System.out.println("2 - Luxo");
		System.out.println("3 - Super Luxo");
		
		System.out.println("Digite o tipo de acomodação: ");
		tipoAcomodacao = entrada.nextInt();
		
		while(tipoAcomodacao != 1 &&tipoAcomodacao != 2 &&tipoAcomodacao != 3){
			System.out.println("Digite o tipo de acomodação: ");
			tipoAcomodacao = entrada.nextInt();
		}
		
		switch(tipoAcomodacao){
		case 1:
			System.out.println("Digite a quantidade da diária: ");
			qtd = entrada.nextInt();
			calculoEstadia = calculoEstadia(qtd, tipoAcomodacao);
		break;
		case 2:
			System.out.println("Digite a quantidade da diária: ");
			qtd = entrada.nextInt();
			calculoEstadia = calculoEstadia(qtd, tipoAcomodacao);
		break;
		case 3:
			System.out.println("Digite a quantidade da diária: ");
			qtd = entrada.nextInt();
			calculoEstadia = calculoEstadia(qtd, tipoAcomodacao);
		break;
		default:
			System.out.println("Inválido, digita novamente");
		}
		System.out.println();
		
		//System.out.println("Total: "+calculoEstadia);
		
		System.out.println("Forma de pagamento: ");
		pagamento = entrada.next();

		pagamento(pagamento, calculoEstadia);

	}//fim principal
	
	public static int calculoEstadia (int qtd, int tipoAcomodacao){
		 int calculoEstadia = 0;
		if (tipoAcomodacao == 1){
			calculoEstadia = 380 * qtd;
		} else {
			if(tipoAcomodacao == 2){
				calculoEstadia = 450 * qtd;
			} else {
				calculoEstadia = 560 * qtd;
			}
		}
		return calculoEstadia;
	}
	
	public static void pagamento (String pagamento,int calculoEstadia){
		double r=0;
		if (pagamento.equalsIgnoreCase("V")){
			r = calculoEstadia * 0.9;
			System.out.println("Total: "+ r);
		} else{
			if(pagamento.equalsIgnoreCase("P")){
				r = calculoEstadia * 1;
				System.out.println("Total: "+ r);
			}
		}
	}

}
