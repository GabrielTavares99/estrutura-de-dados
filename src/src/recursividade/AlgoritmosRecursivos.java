package recursividade;

import java.util.ArrayList;
import java.util.List;

public class AlgoritmosRecursivos {
    public int fatorial(int num) {

        if (num == 1) {
            return num;
        }else if (num == 0){
            return 1;
        }

        return num * fatorial((num - 1));
    }

    public int fibonacci(int num) {

        if (num == 0 ){
            return 0;
        }else if (num == 1){
            return 1;
        }

        return fibonacci(num-1)+ fibonacci(num-2);

    }

    public int metodoB(int n, int m){
        if (m>n){
            return 0;
        }
        if (m==n){
            return n;
        }
        return (metodoB(n-1,m+1)+(n+m));
    }

    public int mdc(int num1, int num2 ){
        if (num1 % num2 == 0){
            return num2;
        }
        int divisao;
        divisao = num1 % num2;
        return mdc(num2, divisao);
    }

    // TODO: 05/03/18 CALCULAR FIBONACCI COM VETOR
    public int fibonacci(){
        return 0;
    }           

    public int numEuler(){
        List<String> strings = new ArrayList<>();
        strings.addAll(new ArrayList<>());
        return 0;
    }


}
