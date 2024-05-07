import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		ClienteMenu clientemenu = new ClienteMenu("\nMenu Cliente", Arrays.asList("Metodo1","Metodo2"));
		operacoesMenu opmenu = new operacoesMenu("\n Menu operações", Arrays.asList("Saque","Deposito") );
		Scanner scanner = new Scanner(System.in);
		int opcao = mainMenu.getSelection(scanner);
		System.out.println("A opção "+ opcao + "foi selecionada");
		if (opcao == 2) {
			opcao = clientemenu.getSelection(scanner);
			System.out.println( "A opção "+ opcao + " foi selecionada");
		}
		if (opcao == 3) {
			opcao = opmenu.getSelection(scanner);
			System.out.println( "A opção "+ opcao + " foi selecionada");
		}


		scanner.close();

		System.out.println("Fim");
	}

}