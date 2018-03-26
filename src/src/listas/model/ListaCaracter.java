package listas.model;

public class ListaCaracter {

    private int tamanho = 0;
    private char[] vetor;

    public ListaCaracter(int tamanho) {
        vetor = new char[tamanho];
    }

    public void adicionaInicio(char palavra) {
        if (!cheia()) {
            puxaElementosDireita(vetor);
            vetor[0] = palavra;
            tamanho++;
        } else {
            System.out.println("Error: lista cheia");
        }
    }

    private void puxaElementosEsquerda(char vetor[]) {
        if (!vazia()) {
            for (int i = 0; i < tamanho - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
        }
    }

    private void puxaElementosDireita(char vetor[]) {
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

    public void adicionaFinal(char caracter) {
        if (!cheia()) {
            vetor[tamanho] = caracter;
            tamanho++;
        } else {
            System.out.println("Error: lista cheia!");
        }
    }

    public void adiciona(char caracter, int posicao) {
        if (posicao < 1 || posicao > tamanho) {
            System.out.println("Erro: posição fora do intervalo");
        } else {
            vetor[posicao-1] = caracter;
        }
    }

    public char removeInicio() {
        char valoreRemovido = 'ñ';
        if (!vazia()) {
            valoreRemovido = vetor[0];
            puxaElementosEsquerda(vetor);
            tamanho--;
        } else {
            System.out.println("Erro: Lista vazia.");
        }

        return valoreRemovido;
    }

    public char removeFinal() {
        char caracter = 'ñ';
        if (!vazia()) {
            caracter = vetor[tamanho - 1];
            tamanho--;
        } else {
            System.out.println("ERRO! Lista Vazia");
        }
        return caracter;
    }

    public int remove(int posicao) {
        int caracterRemovido = 0;
        if (posicao > tamanho)
            System.out.println("Erro: posição fora do intervalo");
        else {
            caracterRemovido = vetor[posicao-1];
            tamanho--;
        }
        return caracterRemovido;
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


    public String concatenarConteudo() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(vetor[i]);
        }
        return stringBuilder.toString();
    }

    public boolean isPalindromo(){
        String horario = concatenarConteudo();
        StringBuilder antiHorario = new StringBuilder();
        for (int i = tamanho-1; i >= 0; i--) {
            antiHorario.append(vetor[i]);
        }
        return horario.equals(antiHorario.toString());
    }
}
