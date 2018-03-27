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

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getInicio() {
        return this.inicio;
    }
}
