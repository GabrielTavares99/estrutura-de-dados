package tabelaEspalhamento;

public class No {

    No proximo, anterior;
    Contato contato;

    public No(Contato contato){
        this.contato = contato;
    }

    @Override
    public String toString() {
        return String.format("[ %s - %s ]", contato.getNome(), contato.getTelefone());
    }
}
