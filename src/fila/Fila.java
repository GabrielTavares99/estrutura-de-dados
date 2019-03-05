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

//    public Fila() {
//        listaLigada = new ListaLigada();
//    }

    public int remove() {
        if (!isVazia()) {
            int temp = vetor[0];
            for (int i = 0; i < (tamanho-1); i++)
                vetor[i] = vetor[i + 1];
            tamanho--;
            return temp;
        }
        return -1;
    }


    private boolean isVazia() {
        return tamanho == 0;
    }

    public void adiciona(int num) {
        if (!isCheia()) {
            vetor[tamanho] = num;
            tamanho++;
        } else
            System.out.println("Erro! Lista cheia!");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(vetor[i] + " ");
        }
        return stringBuilder.toString();
    }

    private boolean isCheia() {
        return tamanho == vetor.length;
    }

}
