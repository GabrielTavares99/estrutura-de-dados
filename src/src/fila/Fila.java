package fila;

import listaLigada.ListaLigada;

public class Fila {
    // TODO: 09/04/18 IMPLEMENTAR FILHA E PILHA ESTÁTICA DINÂMICA 

    int[] vetor;
    int tamanho;
    ListaLigada listaLigada;

    public Fila(int qtd) {
        vetor = new int[qtd];
        tamanho = 0;
    }

    public Fila() {
        listaLigada = new ListaLigada();
    }

    public void adiciona() {
        
    }

    private boolean isVazia() {
        return false;
    }

}
