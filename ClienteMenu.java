import java.util.List;
import java.util.Scanner;

public class ClienteMenu {
    private String title;
    private List<String> options;
    public List<Cliente> clientes;

    public ClienteMenu(List<String> options) {
        this.title = "Menu";
        this.options = options;
    }

    public ClienteMenu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    public int getSelection(Scanner scan) {
        int op = 0;
        while (op == 0) {
            System.out.println(title + "\n");
            int i = 1;
            for (String option : options) {
                System.out.println(i++ + " - " + option);
            }

            System.out.println("\nInforme a opcao desejada. ");
            try {
                op = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                op = 0;
            }

            if (op == 1){ // Cadastro
                System.out.println("Digite o nome do novo cliente:");
                String novoNome = scan.nextLine();

                System.out.println("Digite o CPF do novo cliente:");
                String novoCpf = scan.nextLine();

                System.out.println("Digite a idade do novo cliente:");
                int novoIdade = scan.nextInt();
                
                try {
                    Cliente novoCliente = new Cliente(novoNome, novoCpf, novoIdade);
                    clientes.add(novoCliente);    
                } catch (Exception e) {
                    System.out.println(e);
                }
            } 
            else if (op == 2){ //Visualizar informações
                System.out.println("Digite o CPF a ser pesquisado:");
                String pesquisarCpf = scan.nextLine();
                for (Cliente cliente: clientes){
                    if (cliente.getCpf().equals(pesquisarCpf)) {
                        cliente.imprimirDetalhesCliente();
                        break;
                    }
                }
            }
            
            if (op >= i) {
                System.out.println("Opcao errada!");
                op = 0;
            }

        }
        return op;
    }
}
