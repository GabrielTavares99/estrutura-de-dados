package listas.URI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {

        // TODO: 31/03/18 DIMINUIR TEMPO URI
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int qtd = scanner.nextInt();
        for (int i = 0; i < qtd; i++) {
            int num;
            num = scanner.nextInt();
            if (num % 2 == 0)
                pares.add(num);
            else
                impares.add(num);
        }

        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        List<Integer> completa = new ArrayList<>();
        completa.addAll(pares);
        completa.addAll(impares);
        for (Integer num : completa) {
            System.out.println(num);
        }


    }
}
