package recursividade;

public class Main {

    public static void main(String[] args) {

        AlgoritmosRecursivos algoritmosRecursivos = new AlgoritmosRecursivos();
        System.out.println("Fatorial " + algoritmosRecursivos.fatorial(5));
        for (int i = 0; i < 5; i++) {
            System.out.print(algoritmosRecursivos.fibonacci(i) + " ");
        }

        System.out.println("\nAlgoritmo B: "+algoritmosRecursivos.metodoB(5,1 ));

        System.out.println("MDC: "+ algoritmosRecursivos.mdc(250, 150));
    }
}
