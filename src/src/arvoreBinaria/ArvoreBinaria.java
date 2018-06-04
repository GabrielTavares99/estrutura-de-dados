package arvoreBinaria;

public class ArvoreBinaria {

    public void profundidade(No no) {
        if (no != null) {
            System.out.println(no);
            profundidade(no.esquerda);
            profundidade(no.direita);
        }
    }

    public void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            System.out.println(no.dado);
            emOrdem(no.direita);
        }
    }

    public void posOrdem(No no) {
        if (no != null) {
            emOrdem(no.esquerda);
            emOrdem(no.direita);
            System.out.println(no.dado);
        }
    }

}
