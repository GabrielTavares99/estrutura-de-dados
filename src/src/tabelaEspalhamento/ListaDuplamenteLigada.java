package tabelaEspalhamento;

public class ListaDuplamenteLigada {

    No primeiro, ultimo;

    public void adiciona(Contato contato) {
        No auxiliar = new No(contato);
        if (primeiro == null) {
            primeiro = auxiliar;
            ultimo = auxiliar;
        } else {
            No atual = primeiro;
            while (atual != null) {
                if (atual.proximo == null) {
                    auxiliar.anterior = atual;
                    atual.proximo = auxiliar;
                }
                atual = auxiliar.proximo;
                ultimo = auxiliar;
            }
        }
    }

    public void remove(String nome) {
        No auxiliar = new No(new Contato(nome, ""));
//        if (primeiro == null)


    }

    @Override
    public String toString() {
        No auxiliar = primeiro;
        StringBuilder stringBuilder = new StringBuilder();
        if (auxiliar == null)
            return "";
        while (auxiliar != null) {
            stringBuilder.append("[ " + auxiliar.contato.getNome() + " ] ");
            auxiliar = auxiliar.proximo;
        }
        return stringBuilder.toString();
    }
}
