package listaLigada;

import java.util.StringJoiner;

public class ListaLigada {
    private No inicio;

    public void adicionaInicio(int novoElemento) {
        No novo = new No(novoElemento);
        novo.prox = inicio;
        inicio = novo;
    }

    public int removeInicio() {
        int r = -1;
        if (inicio == null)
            System.out.println("Erro! Lista vazia.");
        else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
    }

    @Override
    public String toString() {
        No aux = inicio;
        StringJoiner stringBuilder = new StringJoiner("-");
        while (aux != null) {
            stringBuilder.add(String.format("%d", aux.dado));
            aux = aux.prox;
        }
        return stringBuilder.toString();
    }

    public int removeFinal() {
        if (!listaVazia()) {
            if (inicio.prox == null) {
                int r = inicio.dado;
                inicio = null;
                return r;
            }
            No aux2 = null, aux1 = inicio;
            while (aux1.prox != null) {
                aux2 = aux1;
                aux1 = aux1.prox;
            }
            aux2.prox = null;
            return aux1.dado;
        } else {
            System.out.println("Erro! Lista Vazia");
        }
        return -1;
    }

    private boolean listaVazia() {
        return inicio == null;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getInicio() {
        return this.inicio;
    }
}
