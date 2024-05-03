import java.util.List;
import java.util.Scanner;

public class ClienteMenu {
    private String title;
    private List<String> options;

    public ClienteMenu(List<String> options) {
        this.title = "Menu";
        this.options = options;
    }

    public ClienteMenu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    public int getSelection() {
        int op = 0;
        Scanner s = new Scanner(System.in);
        while (op == 0) {
            System.out.println(title + "\n");
            int i = 1;
            for (String option : options) {
                System.out.println(i++ + " - " + option);
            }

            System.out.println("\nInforme a opcao desejada. ");
            try {
                op = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
                op = 0;
            }
            if (op >= i) {
                System.out.println("Opcao errada!");
                op = 0;
            }

        }
        return op;
    }
}