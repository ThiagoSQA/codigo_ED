import java.util.Scanner;
import java.util.Stack;

public class Navegador {
    public static void main(String[] args) {
        Stack<String> historico = new Stack<>();
        Scanner input = new Scanner(System.in);

        boolean navegando = true;

        // Começa com uma página inicial
        historico.push("Página Inicial");

        while (navegando) {
            System.out.println("\nPágina atual: " + historico.peek());
            System.out.println("1. Visitar nova página");
            System.out.println("2. Voltar para página anterior");
            System.out.println("3. Sair");

            int opcao = input.nextInt();
            input.nextLine(); // consome o \n

            switch (opcao) {
                case 1:
                    System.out.print("Digite o endereço da nova página: ");
                    String novaPagina = input.nextLine();
                    historico.push(novaPagina);
                    break;

                case 2:
                    if (historico.size() > 1) {
                        historico.pop(); // remove a atual
                        System.out.println("Voltando para: " + historico.peek());
                    } else {
                        System.out.println("Você já está na primeira página!");
                    }
                    break;

                case 3:
                    navegando = false;
                    System.out.println("Encerrando o navegador...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        input.close();
    }
}
