import java.util.Arrays; 
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
        ClienteMenu clienteMenu = new ClienteMenu("\nMenu Cliente", Arrays.asList("Cadastro","Pesquisa por CPF"));
        operacoesMenu operacoesMenu = new operacoesMenu("\nMenu Operações", Arrays.asList("Saque","Deposito") );
        Scanner scanner = new Scanner(System.in);
        
        int opcao;
        do {
            opcao = mainMenu.getSelection(scanner);
            System.out.println("A opção " + opcao + " foi selecionada");

            switch (opcao) {
                case 1:
                    // Lógica para opção Conta
                    break;
                case 2:
                    int clienteOpcao = clienteMenu.getSelection(scanner);
                    System.out.println("A opção " + clienteOpcao + " foi selecionada");
                    break;
                case 3:
                    int operacoesOpcao = operacoesMenu.getSelection(scanner);
                    System.out.println("A opção " + operacoesOpcao + " foi selecionada");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        scanner.close();

        System.out.println("Fim");
    }
}