package listas.view;

import com.sun.xml.internal.bind.v2.TODO;
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
        // TODO: 24/03/18 gerar e retornar uma String codificada somando um em cada caractere.
        listaCaracter.adicionaInicio('O');
        listaCaracter.adicionaInicio('S');
        listaCaracter.adicionaInicio('D');
        listaCaracter.adicionaInicio('O');
        System.out.println(String.format("%s é um palíndromo? %b", listaCaracter.concatenarConteudo(), listaCaracter.isPalindromo()));
        print();

    }

    private static void print() {
        System.out.println(listaCaracter);
    }
}
