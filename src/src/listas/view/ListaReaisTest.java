package listas.view;

import listas.model.ListaReais;


public class ListaReaisTest {
    static ListaReais listaReais;
    public static void main(String[] args) {

//        LISTA II
        listaReais = new ListaReais(3);
        listaReais.adicionaFinal(10);
        listaReais.adicionaFinal(9);
        listaReais.adicionaFinal(8);
        print();

        double valoreRemovido = listaReais.removeFinal();
        System.out.println(String.format("Valor removido %.1f", valoreRemovido));
        print();

        listaReais.adicionaInicio(50);
        print();

        listaReais.removeInicio();
        print();

        listaReais.adicionaInicio(99);
        String valorConcatenado = listaReais.concatenarConteudo();
        System.out.println(valorConcatenado);
    }

    private static void print() {
        System.out.println(listaReais);
    }
}
