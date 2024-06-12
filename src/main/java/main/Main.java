package main;

import implementation.Supermaket;
import implementation.SupermaketArray;

import java.util.Scanner;

public class Main {

    private final static int SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Supermaket supermaket = new SupermaketArray(SIZE);

        int opcao;
        do{
            System.out.println("\nLista de compras");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Remover");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite o item a ser inserido: ");
                    String item = scanner.next();
                    supermaket.add(item);
                    break;
                case 2:
                    supermaket.print();
                    break;
                case 3:
                    System.out.println("Digite a posição do item a ser removido: ");
                    int index = scanner.nextInt();
                    supermaket.delete(index);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção invalida. Por favor, escolha novamente");

            }
        }while (opcao != 4);
        scanner.close();
    }
}