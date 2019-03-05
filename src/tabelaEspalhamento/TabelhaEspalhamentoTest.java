package tabelaEspalhamento;

public class TabelhaEspalhamentoTest {
    public static void main(String[] args) {

        TabelaEspalhamento tabelaEspalhamento = new TabelaEspalhamento();
        tabelaEspalhamento.adiciona("Gabriel", "2555-6479");
        tabelaEspalhamento.adiciona("Gaby", "2555-6479");
        tabelaEspalhamento.adiciona("Weverson", "2555-6479");
        tabelaEspalhamento.adiciona("Weversa", "2555-6479");
        tabelaEspalhamento.adiciona("Ana", "2555-6479");
        tabelaEspalhamento.remove("Ana");
        tabelaEspalhamento.listar();
        tabelaEspalhamento.pegaUltimoPorNome("a");
    }
}
