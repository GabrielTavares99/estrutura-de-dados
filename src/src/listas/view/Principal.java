package listas.view;

import listas.model.ListaInteiros;

public class Principal {
    public static void main(String[] args) {

        ListaInteiros listaInteiros = new ListaInteiros(3);
        listaInteiros.adicionaInicio(8);
        listaInteiros.adicionaInicio(9);
        listaInteiros.adicionaInicio(10);
//        System.out.println(listaInteiros.toString());
//        System.out.println(listaInteiros.obtemUltimo());
//        System.out.println(listaInteiros.obtemPrimeiro());
//        listaInteiros.adicionaFinal(50);
        System.out.println(listaInteiros.toString());
        listaInteiros.removeInicio();
        System.out.println(listaInteiros.toString());


    }
}
