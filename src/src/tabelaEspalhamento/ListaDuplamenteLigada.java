package tabelaEspalhamento;

public class ListaDuplamenteLigada {

    No primeiro, ultimo;

    public void adiciona(Contato contato) {
        No auxiliar = new No(contato);
        if (primeiro == null)
            primeiro = auxiliar;
        while (auxiliar.proximo != null){
            if (auxiliar.proximo.contato.getNome().equals(contato.getNome()))
                auxiliar.proximo = auxiliar;
        }

    }
}
