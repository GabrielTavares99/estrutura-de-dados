package listas.model;

public class ListaInteirosOrdenada {

    protected int tamanho = 0;
    protected int[] vetor;

    public ListaInteirosOrdenada(int tamanho) {
        vetor = new int[tamanho];
    }

    public int getTamanho() {
        return tamanho;
    }


    public boolean cheia() {
        return vetor.length == tamanho;
    }

    public void adicionaFinal(int num) {
        if (!cheia()) {
            vetor[tamanho] = num;
            tamanho++;
        } else {
            System.out.println("Error: lista cheia!");
        }
    }

    public void ordenar() {
        int atual = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (vetor[i] < vetor[j]) {
                    atual = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = atual;
                }
            }
        }
    }


    public int pegaPosicao(int posicao) {
        if (!(posicao < 0) || !(posicao > tamanho))
            return vetor[posicao];
        return -1;
    }
}

