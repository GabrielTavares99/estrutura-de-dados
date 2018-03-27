package listas.view;

import listas.model.ListaCaracter;

public class ListaCaracterTest {

    static ListaCaracter listaCaracter;

    public static void main(String[] args) {

        listaCaracter = new ListaCaracter(4);

//        listaCaracter.adicionaFinal('G');
//        char caracterRemovido = listaCaracter.removeFinal();
//        System.out.println(String.format("Caracter removido %c", caracterRemovido));
//        print();
//        listaCaracter.adicionaInicio('S');
//        listaCaracter.adicionaInicio('O');
//        print();
//        caracterRemovido = listaCaracter.removeInicio();
//        System.out.println(String.format("Caracter removido %c", caracterRemovido));
//        listaCaracter.adicionaInicio('S');
//        listaCaracter.adicionaInicio('S');
//        listaCaracter.adicionaInicio('O');
//        String conteudoConcatenado = listaCaracter.concatenarConteudo();
//        System.out.println(conteudoConcatenado);
        // TODO: 24/03/18 PERGUNTAR retorna -1 quando não conseguir obter valor
//        listaCaracter.adicionaInicio('O');
//        listaCaracter.adicionaInicio('S');
//        listaCaracter.adicionaInicio('D');
//        listaCaracter.adicionaInicio('O');
//        System.out.println(String.format("%s é um palíndromo? %b", listaCaracter.concatenarConteudo(), listaCaracter.isPalindromo()));

        // TODO: 25/03/18 PODE COLCOR EM POSIÇÃO QUANDO A LISTA É VAZIA?
//        listaCaracter.adicionaInicio('G');
//        listaCaracter.adicionaFinal('O');
//        print();
//        listaCaracter.adiciona('F', 1);
//        listaCaracter.adiciona('C', 2);
//        print();
//        listaCaracter.remove(2);
        listaCaracter.adicionaInicio('a');
        listaCaracter.adicionaFinal('b');
        String concatenarSomar = listaCaracter.concatenarSomar();
        System.out.println(String.format("Valor trocado %s", concatenarSomar));
        print();

    }

    private static void print() {
        System.out.println(listaCaracter);
    }
}
