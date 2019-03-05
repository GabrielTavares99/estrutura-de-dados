package listas.model;

import java.util.StringJoiner;

public class ListaReais {

    private double[] vetor;
    private int tamanho;

    public ListaReais(int tamanho) {
        this.vetor = new double[tamanho];
    }

    public boolean isCheia() {
        return vetor.length == tamanho;
    }

    public boolean isVazia() {
        return tamanho == 0;
    }

    public void adicionaFinal(double valor) {
        if (isCheia())
            System.out.println("Erro! Lista cheia");
        else {
            vetor[tamanho] = valor;
            tamanho++;
        }
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(" - ");
        for (int i = 0; i < tamanho; i++) {
            stringJoiner.add(String.valueOf(vetor[i]));
        }
        return stringJoiner.toString();
    }

    public double removeFinal() {
        if (isVazia())
            System.out.println("Erro! Lista vazia");
        else {
            double valorRemovido = vetor[tamanho - 1];
            tamanho--;
            return valorRemovido;
        }
        return -1;
    }

    public void adicionaInicio(double num) {
        if (isCheia())
            System.out.println("Erro! Lista cheia");
        else {
            for (int i = tamanho; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = num;
            tamanho++;
        }
    }

    public double removeInicio() {

        if (isVazia())
            System.out.println("Erro! Lista vazia");
        else {
//            System.arraycopy(vetor, 1, vetor, 0, tamanho);
            for (int i = 0; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            tamanho--;
            return vetor[0];
        }
        return -1;
    }

    public String concatenarConteudo() {
        StringJoiner stringJoiner = new StringJoiner(" # ");
        for (int i = 0; i < tamanho; i++) {
            stringJoiner.add(String.valueOf(vetor[i]));
        }
        return stringJoiner.toString();
    }

    public double remove(int posicao) {
        double valorRetorno = -1;
        if (posicao < 1 || posicao > tamanho) {
            System.out.println("Erro! Posição inválida");
        } else {
            tamanho--;
            for (int i = posicao - 1; i < tamanho; i++) {
                vetor[i] = vetor[i + 1];
            }
        }
        return valorRetorno;
    }
}
