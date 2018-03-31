package listas.view;

public class ListaInteirosTest {
    static listas.model.ListaInteiros listaInteiros;

    public static void main(String[] args) {

//        TESTE LISTA I
        listaInteiros = new listas.model.ListaInteiros(3);
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

//        listaInteiros.adicionaFinal(15);
//        listaInteiros.adicionaFinal(30);
//        listaInteiros.adicionaFinal(53);
//        int valoreRemovido = listaInteiros.removeFinal();
//        System.out.println(valoreRemovido);
//        valoreRemovido = listaInteiros.removeFinal();
//        System.out.println(valoreRemovido);
//        valoreRemovido = listaInteiros.removeFinal();
//        System.out.println(valoreRemovido);
//        listaInteiros.removeFinal();

//        print();
//        ----------------------------------------------

        // TODO: 19/03/18 FAZER EXERCÍCIOS Lista 3
//        a) l1.adiciona(74,2)
//        b) l1.adicionaFinal(74)
//        c) l1.adiciona(73, 1)
//        d) l1.adicionaInício (72)
//        e) l1.remove (2)
//        f) l1.adiciona (70, 4)
//        g) l1.remove(1)
//        h) l1.removeInicio( )
//        i) l1.removeFinal ( )
//        j) l1.adiciona (67,2)
//        k) l1.removeFinal ( )
//        print();
//        listaInteiros.adicionaPosicao(74,2);
//        print();
//        listaInteiros.adicionaFinal(74);
//        print();
//        listaInteiros.adicionaPosicao(73,1);
//        print();
//        listaInteiros.adicionaInicio(72);
//        print();
//        listaInteiros.removePosicao(2);
//        print();
//        listaInteiros.adicionaPosicao(70,4);
//        print();
//        listaInteiros.removePosicao(1);
//        print();
//        listaInteiros.removeInicio();
//        print();
//        listaInteiros.removeFinal();
//        print();
//        listaInteiros.adicionaPosicao(67,2);
//        print();
//        listaInteiros.removeFinal();
//        print();

        print();
        listaInteiros.adicionaFinal(6);
        print();
        listaInteiros.adicionaFinal(7);
        print();
        listaInteiros.adicionaFinal(8);
        print();
        listaInteiros.removePosicao(2);
        print();
    }

    private static void print() {
        System.out.println(listaInteiros);
    }
}
