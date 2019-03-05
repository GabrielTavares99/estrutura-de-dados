package listas.URI;

import java.util.Scanner;
import java.util.StringJoiner;

public class TrhowingCardsAway {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            num = scanner.nextInt();
            if (num == 0)
                continue;
            ListaInteiros listaInteiros = new ListaInteiros(num);
            for (int i = 1; i <= num; i++) {
                listaInteiros.adicionaFinal(i);
            }
            cards(listaInteiros);
        } while (num != 0);
    }

    public static void cards(ListaInteiros listaInteiros) {
        StringJoiner resto = new StringJoiner(", ");
        while (listaInteiros.tamanho > 1) {
            int removido = listaInteiros.removeInicio();
            int initNum = listaInteiros.obtemPrimeiro();
            listaInteiros.removeInicio();
            listaInteiros.adicionaFinal(initNum);
            resto.add(String.valueOf(removido));
        }
        System.out.println(String.format("Discarded cards: %s", resto.toString()));
        System.out.println(String.format("Remaining card: %d", listaInteiros.obtemPrimeiro()));
    }
}

class ListaInteiros {

    // TODO: 31/03/18 TAMANHO É PUBLIC?
    public int tamanho = 0;
    private int[] vetor;

    public ListaInteiros(int tamanho) {
        vetor = new int[tamanho];
    }

    public void adicionaInicio(int num) {
        if (!cheia()) {
            puxaElementosDireita(vetor);
            vetor[0] = num;
            tamanho++;
        } else {
            System.out.println("Error: lista cheia");
        }
    }

    private void puxaElementosEsquerda(int posicao) {
        if (!vazia()) {
            for (int i = posicao; i < tamanho; i++) {
                vetor[i] = vetor[i + 1];
            }
        }
    }

    private void puxaElementosDireita(int vetor[]) {
        if (!vazia())
            for (int i = tamanho - 1; i >= 0; i--) {
                vetor[i + 1] = vetor[i];
            }
    }

    public boolean vazia() {
        return tamanho == 0;
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

    public void adicionaPosicao(int num, int posicao) {
        if (posicao > tamanho || posicao < 1) {
            System.out.println("Erro: posição fora do intervalo");
        } else {
            vetor[posicao - 1] = num;
        }
    }

    public int removeInicio() {
        int valoreRemovido = -1;
        if (!vazia()) {
            valoreRemovido = vetor[0];
            int posicao = 0;
            tamanho--;
            puxaElementosEsquerda(posicao);
        } else {
            System.out.println("Erro: Lista vazia.");
        }

        return valoreRemovido;
    }

    public int removeFinal() {
        int num = -1;
        if (!vazia()) {
            num = vetor[tamanho - 1];
            tamanho--;
        } else {
            System.out.println("ERRO! Lista Vazia");
        }
        return num;
    }

    public int removePosicao(int posicao) {
        int numRemovido = 0;
        if (posicao > tamanho || posicao < 1)
            System.out.println("Erro: posição fora do intervalo");
        else {
            numRemovido = vetor[posicao - 1];
            tamanho--;
            for (int i = posicao - 1; i < tamanho; i++) {
                vetor[i] = vetor[i + 1];
            }
        }
        return numRemovido;
    }

    public int obtemPrimeiro() {
        if (!vazia())
            return vetor[0];

        return -1;
    }

    public int obtemUltimo() {
        if (!vazia())
            return vetor[tamanho - 1];
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder vetorString = new StringBuilder();
        vetorString.append("[");
        for (int i = 0; i < tamanho; i++) {
            vetorString.append(" ");
            vetorString.append(vetor[i]);
            vetorString.append(" ");
        }
        vetorString.append("]");
        return vetorString.toString();
//        return Arrays.toString(this.vetor);
    }
}

