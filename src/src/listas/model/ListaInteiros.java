package listas.model;

public class ListaInteiros {

    private int tamanho;
    private int[] vetor;

    public ListaInteiros(int tamanho) {
        vetor = new int[tamanho];
    }

    public void adicionaInicio(int num) {
        if (!cheia()) {
            puxaElementosDireita(vetor);
            vetor[0] = num;
            tamanho++;
        }
    }

    public void puxaElementosEsquerda(int vetor[]) {
        if (!vazia()) {
            for (int i = 0; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
        }
    }

    public void puxaElementosDireita(int vetor[]) {
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

    public void adiciona(int num, int posicao) {

    }

    public int removeInicio() {
        int valoreRemovido = 0;
        if (!vazia()) {
            puxaElementosEsquerda(vetor);
            valoreRemovido = vetor[0];
            tamanho--;
        }

        return valoreRemovido;
    }

    public int removeFinal() {
        return 0;
    }

    public int remove(int posicao) {
        return 0;
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
