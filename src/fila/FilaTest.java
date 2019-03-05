package fila;

public class FilaTest {
    public static void main(String[] args) {

        System.out.println("TESTE DE FILA");
        Fila fila = new Fila(3);
        fila.adiciona(5);
        fila.adiciona(7);
        fila.adiciona(99);
        System.out.println(fila+" Fila Completa");
        System.out.println(fila.remove()+" Removido");
        System.out.println(fila.remove()+" Removido");
        System.out.println(fila+" Fila Completa");

    }
}
