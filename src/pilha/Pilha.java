package pilha;

public class Pilha {

    private int topo;
    int[] vetor;

    public Pilha(int qtd) {
        vetor = new int[qtd];
        topo = 0;
    }

    public void adiciona(int num) {
        if (!isCheio()) {
            vetor[topo++] = num;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < topo; i++) {
            stringBuilder.append(vetor[i]+" ");
        }
        return stringBuilder.toString();
    }

    private boolean isCheio() {
        return topo == vetor.length;
    }

    public int remove() {
        int temp = vetor[topo-1];
        topo--;
        return temp;
    }
}
