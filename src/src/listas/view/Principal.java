package listas.view;

import listas.model.ListaInteiros;

public class Principal {
    static ListaInteiros listaInteiros;
    public static void main(String[] args) {

//        TESTE LISTA I
        listaInteiros = new ListaInteiros(3);
//        listaInteiros.adicionaInicio(15);
//        listaInteiros.adicionaInicio(30);
//        listaInteiros.adicionaInicio(53);
//        listaInteiros.adicionaInicio(47);
//        print();
//        int numRemovido = listaInteiros.removeInicio();
//        System.out.println(String.format("Valore removido %d", numRemovido));
//        numRemovido = listaInteiros.removeInicio();
//        System.out.println(String.format("Valore removido %d", numRemovido));
//        numRemovido = listaInteiros.removeInicio();
//        System.out.println(String.format("Valore removido %d", numRemovido));
//        numRemovido = listaInteiros.removeInicio();
//        System.out.println(String.format("Valore removido %d", numRemovido));
//        print();
//        ----------------------------------------------

//       TESTES LISTA II

        listaInteiros.adicionaFinal(15);
        listaInteiros.adicionaFinal(30);
        listaInteiros.adicionaFinal(53);
        listaInteiros.adicionaFinal(47);
        int valoreRemovido = listaInteiros.removeFinal();
        System.out.println(valoreRemovido);
        valoreRemovido = listaInteiros.removeFinal();
        System.out.println(valoreRemovido);
        valoreRemovido = listaInteiros.removeFinal();
        System.out.println(valoreRemovido);
        listaInteiros.removeFinal();

        print();
//        ----------------------------------------------

        // TODO: 19/03/18 FAZER EXERCÍCIOS Lista 3 

    }

    private static void print(){
        System.out.println(listaInteiros);
    }
}
