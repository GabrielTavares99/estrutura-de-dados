package Pilha;

public class PilhaTest {

    public static void main(String[] args) {

        Pilha pilha = new Pilha(4);
        pilha.adiciona(5);
        pilha.adiciona(6);
        pilha.adiciona(7);
        pilha.adiciona(8);
        System.out.println(pilha);
        System.out.println(pilha.remove());
        System.out.println(pilha.remove());
        System.out.println(pilha);

    }

}
