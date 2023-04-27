package EstruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Stack<String> pilha = new Stack<String>();
	
		int op;
		do {
			
			System.out.println("\nEscolha opção: ");
			System.out.println("\n1 Adiciomar novo livro: ");
			System.out.println("\n2 Listar todos os livros: ");
			System.out.println("\n3 Retirar um livro: ");
			System.out.println("\n0 programa finalizado: ");
			op = leia.nextInt();
			leia.nextLine();
			
			switch(op) {
				
				case 1: 
					System.out.println("\nQual livro deseja adicionar: ");
					String adicionar = leia.nextLine();
					pilha.push(adicionar);
					break;
					
				case 2: 
					System.out.println("\nLista de todos os livros: ");
					for(String x : pilha) {
							System.out.println(x);
					}
					break;
				
				case 3: 
					System.out.println("\nQual livro deseja retira: ");
					if(pilha.isEmpty()== false){
						System.out.println("\nO último livro foi retirado: ");
						pilha.pop();
					}else {
						System.out.println("\nA pilha está vazia:");
						
					}
					break;
					default: 
						if(op!=0) {
							System.out.println("\nOpção inválida!");
						}
				break;
			}
		} while(op !=0);
		
		
		leia.close();

		
		
	}

}
