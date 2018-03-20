package listas.view;

import listas.model.ListaInteiros;

public class Principal {
    static ListaInteiros listaInteiros;
    public static void main(String[] args) {

        listaInteiros = new ListaInteiros(3);
        listaInteiros.adicionaInicio(15);
        listaInteiros.adicionaInicio(30);
        listaInteiros.adicionaInicio(53);
        listaInteiros.adicionaInicio(47);
        print();
        int numRemovido = listaInteiros.removeInicio();
        System.out.println(String.format("Valore removido %d", numRemovido));
        numRemovido = listaInteiros.removeInicio();
        System.out.println(String.format("Valore removido %d", numRemovido));
        numRemovido = listaInteiros.removeInicio();
        System.out.println(String.format("Valore removido %d", numRemovido));
        numRemovido = listaInteiros.removeInicio();
        System.out.println(String.format("Valore removido %d", numRemovido));
        print();
//        listaInteiros.adicionaInicio(10);
//        System.out.println(listaInteiros.toString());
//        System.out.println(listaInteiros.obtemUltimo());
//        System.out.println(listaInteiros.obtemPrimeiro());
//        listaInteiros.adicionaFinal(50);
//        System.out.println(listaInteiros.toString());
//        listaInteiros.removeInicio();
//        System.out.println(listaInteiros.toString());
//
//        listaInteiros.adicionaFinal(50);
//        System.out.println(listaInteiros);
//
//        listaInteiros.adiciona(99, 0);
//        System.out.println(listaInteiros);
//
//        listaInteiros.removeInicio();
//        System.out.println(listaInteiros);
//
//        listaInteiros.adicionaFinal(555);
//        System.out.println(listaInteiros);
//
//        int numRemovido = listaInteiros.removeFinal();
//        System.out.println(String.format("Num removido %d", numRemovido));
//        System.out.println(listaInteiros);
//
//        listaInteiros.adicionaInicio(-10);
//        listaInteiros.adicionaInicio(-20);
//        System.out.println(listaInteiros);
//        numRemovido = listaInteiros.remove(1);
//        System.out.println(String.format("Num removido %d", numRemovido));
//        System.out.println(listaInteiros);
    }

    private static void print(){
        System.out.println(listaInteiros);
    }
}
