import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes"));
		ClienteMenu clientemenu = new ClienteMenu("\nMenu Cliente", Arrays.asList("Metodo1","Metodo2"));
		int opcao = mainMenu.getSelection();
		System.out.println("A opção "+ opcao + "foi selecionada");
		if (opcao == 2) {
			opcao = clientemenu.getSelection();
			System.out.println( "A opção "+ opcao + "foi selecionada");
		}

		System.out.println("Fim");
	}

}