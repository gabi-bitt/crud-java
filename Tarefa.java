package app;

import service.TarefaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int opcao;

        do {

            System.out.println("\n===== GERENCIADOR DE TAREFAS =====");
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar tarefas");
            System.out.println("3 - Atualizar tarefa");
            System.out.println("4 - Remover tarefa");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();

                    service.adicionar(titulo, descricao);

                    break;

                case 2:

                    service.listar();

                    break;

                case 3:

                    System.out.print("Digite o ID da tarefa: ");
                    int idAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Novo título: ");
                    String novoTitulo = scanner.nextLine();

                    System.out.print("Nova descrição: ");
                    String novaDescricao = scanner.nextLine();

                    service.atualizar(idAtualizar, novoTitulo, novaDescricao);

                    break;

                case 4:

                    System.out.print("Digite o ID da tarefa: ");
                    int idRemover = scanner.nextInt();

                    service.remover(idRemover);

                    break;

                case 0:

                    System.out.println("Sistema encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}