package EstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		
		 Scanner fila = new Scanner(System.in);
		 String name;
		 
		 Queue<String> clientes = new LinkedList<>();
	        int opcao = 1;
	        
	        do {
	            System.out.println("\nMenu");
	            System.out.println("1 - Adicionar cliente na fila");
	            System.out.println("2 - Listar todos os clientes");
	            System.out.println("3 - Retirar cliente");
	            System.out.print("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = fila.nextInt();
	             
	            
	        switch (opcao) {
	        
            case 1 : 
                System.out.print("Digite o nome: ");
                name = fila.nextLine();
                clientes.add(name);
                System.out.println("Cliente adicionado!"); 
                break;
                    
            case 2 :
                if (clientes.isEmpty()) {
                	System.out.println("A Fila está vazia!");
                }    
                
                 else {
                    System.out.println("Lista de clientes na fila: ");
                    clientes.forEach(System.out::println);
                    break;
                }
             
            case 3 : 
                if (clientes.isEmpty()) {
                    System.out.println("A Fila está vazia!");
                }     
                else {
                    clientes.remove();
                    System.out.println("Fila: ");
                    clientes.forEach(System.out::println);
                    System.out.println("Cliente foi chamado! ");
                }   
            
             case 0 : {
                    System.out.print("\nEncerrando o programa ... ");
                    
               
             
             while (opcao != 0);

              fila.nextLine();
        }
	        }      
	        
	        
	        
	        
	        
	        