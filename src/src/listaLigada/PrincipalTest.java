package listaLigada;

import java.util.Scanner;
import java.util.StringJoiner;

public class PrincipalTest {
    public static void main(String[] args) {

        StringJoiner menu = new StringJoiner("\n");
        menu.add("1 - Adiciona início");
        menu.add("2 - Remove início");
        menu.add("3 - Apresenta");
        menu.add("99 - Sair");
        ListaLigada listaLigada = new ListaLigada();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 99) {
            System.out.println(menu.toString());
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    listaLigada.adicionaInicio(50);
                    break;
                case 2:
                    listaLigada.removeInicio();
                    break;
                case 3:
                    System.out.println(listaLigada.toString());
                    break;
            }
        }

    }
}
