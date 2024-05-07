import java.util.List;
import java.util.Scanner;

public class operacoesMenu {
    private String title;
    private List<String> options;

    public operacoesMenu(List<String> options) {
        this.title = "Menu";
        this.options = options;
    }

    public operacoesMenu(String title, List<String> options) {
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

            System.out.println("\nInforme a opção desejada. ");
            try {
                op = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                op = 0;
            }
            if (op >= i) {
                System.out.println("Opção errada!");
                op = 0;
            }

        }
        return op;
    }

}
