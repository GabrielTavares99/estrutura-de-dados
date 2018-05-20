package tabelaEspalhamento;

public class TabelaEspalhamento {

    ListaDuplamenteLigada[] lista;

    public TabelaEspalhamento() {
        lista = new ListaDuplamenteLigada[26];
    }

    public void adiciona(String nome, String telefone) {

        int letraInicial = nome.toLowerCase().charAt(0) - 97;

        if (lista[letraInicial] == null)
            lista[letraInicial] = new ListaDuplamenteLigada();

        lista[letraInicial].adiciona(new Contato(nome, telefone));

    }

}
