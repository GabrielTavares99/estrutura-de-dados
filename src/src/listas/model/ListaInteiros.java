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
        }else {
            System.out.println("Error: lista cheia");
        }
    }

    private void puxaElementosEsquerda(int vetor[]) {
        if (!vazia()) {
            for (int i = 0; i < tamanho - 1; i++) {
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
            vetor[tamanho - 1] = num;
        } else {
            System.out.println("Error: lista cheia!");
        }
    }

    public void adiciona(int num, int posicao) {
        if (posicao > tamanho - 1) {
            System.out.println("Erro: posição fora do intervalo");
        } else {
            vetor[posicao] = num;
            tamanho++;
        }
    }

    public int removeInicio() {
        int valoreRemovido = -1;
        if (!vazia()) {
            valoreRemovido = vetor[0];
            puxaElementosEsquerda(vetor);
            tamanho--;
        }else {
            System.out.println("Erro: Lista vazia.");
        }

        return valoreRemovido;
    }

    public int removeFinal() {
        int num = 0;
        if (!vazia()) {
            num = vetor[tamanho - 1];
            tamanho--;
        }
        return num;
    }

    public int remove(int posicao) {
        int numRemovido = 0;
        if (posicao > tamanho-1)
            System.out.println("Erro: posição fora do intervalo");
        else {
            numRemovido = vetor[posicao];
            tamanho--;
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
