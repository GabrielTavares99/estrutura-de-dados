package listas.URI;

import listas.model.ListaInteirosOrdenada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // TODO: 31/03/18 DIMINUIR TEMPO URI
//        List<Integer> pares = new ArrayList<>();
//        List<Integer> impares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        ListaInteirosOrdenada pares = new ListaInteirosOrdenada(qtd);
        ListaInteirosOrdenada impares = new ListaInteirosOrdenada(qtd);

        int num;
        for (int i = 0; i < qtd; i++) {

            num = scanner.nextInt();
            if (num % 2 == 0)
                pares.adicionaFinal(num);
            else
                impares.adicionaFinal(num);
        }

//        Collections.sort(pares);
//        Collections.sort(impares);
//        Collections.reverse(impares);
//        List<Integer> completa = new ArrayList<>();
//        completa.addAll(pares);
//        completa.addAll(impares);
//        for (Integer num: completa) {
//            System.out.println(num);
//        }

        pares.ordenar();
        for (int i = 0; i < pares.getTamanho(); i++) {
            System.out.println(pares.pegaPosicao(i));
        }
        impares.ordenar();
        for (int i = impares.getTamanho()-1; i >= 0; i--) {
            System.out.println(impares.pegaPosicao(i));
        }
    }
}
