package tabelaEspalhamento;

public class TabelaEspalhamento {

    private ListaDuplamenteLigada[] lista;

    public TabelaEspalhamento() {
        lista = new ListaDuplamenteLigada[26];
    }


    public int funcaoEspalhamento(String nome){
        return nome.toLowerCase().charAt(0) - 97;
    }

    public void pegaUltimoPorNome(String nome){
        int letraInicial = funcaoEspalhamento(nome);
        System.out.println(lista[letraInicial].ultimo);
    }

    public void adiciona(String nome, String telefone) {

        int letraInicial = funcaoEspalhamento(nome);

        if (lista[letraInicial] == null)
            lista[letraInicial] = new ListaDuplamenteLigada();

        lista[letraInicial].adiciona(new Contato(nome, telefone));

    }

    public void listar(){
        for (int i = 0; i < 25; i++) {
            if (! (lista[i] == null)){
                System.out.println(lista[i]);
            }
        }
    }

    public void remove(String nome) {

        int letraInicial = funcaoEspalhamento(nome);
        if (lista[letraInicial] == null)
            System.out.println("ERRO MALUCO");
        else {
            lista[letraInicial].remove(nome);
        }
    }
}
