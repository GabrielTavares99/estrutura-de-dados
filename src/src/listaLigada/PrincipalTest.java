package listaLigada;

import java.util.Scanner;
import java.util.StringJoiner;

public class PrincipalTest {
    public static void main(String[] args) {

        StringJoiner menu = new StringJoiner("\n");
        menu.add("1 - Adiciona início");
        menu.add("2 - Remove início");
        menu.add("3 - Apresenta");
        menu.add("4 - Remove final");
        menu.add("5 - Adiciona ordenada");
        menu.add("6 - Remove por conteúdo");
        menu.add("99 - Sair");
        ListaLigada listaLigada = new ListaLigada();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 99) {
            System.out.println(menu.toString());
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digita um número aéhh");
                    int num = scanner.nextInt();
                    listaLigada.adicionaInicio(num);
                    break;
                case 2:
                    listaLigada.removeInicio();
                    break;
                case 3:
                    System.out.println(listaLigada.toString());
                    break;
                case 4:
                    int i = listaLigada.removeFinal();
                    System.out.println(i+" ITEM REMOVIDO");
                    break;
                case 5:
                    System.out.println("Adiciona ordenadamente:");
                    int b = scanner.nextInt();
                    listaLigada.adicionaOrdenado(b);
                    break;
                case 6:
                    System.out.println("Remove por conteúdo:");
                    int c = scanner.nextInt();
                    listaLigada.removePorConteudo(c);
                    break;
            }
        }

    }
}
