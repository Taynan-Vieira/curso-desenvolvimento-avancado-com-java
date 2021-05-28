package paradigmafuncional;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        dobrarValor();
    }

    private static void calcularValorVezesTres() {
        UnaryOperator<Integer> resultado = valor -> valor*3;
        System.out.println("O resultado é:: " + resultado.apply(10));
    }

    //Aula 2 - Composição de funções
    private static void deveMultiplicarPorDoisOsNumerosPares(){
        int[] valores = {1,2,3,4};

        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }

    //Aula 2- Funções puras
    private static void verificarSeNumeroEhMaior(){
        BiPredicate<Integer, Integer> verificarSeEhMaior = (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(verificarSeEhMaior.test(13, 12));
        System.out.println(verificarSeEhMaior.test(13, 12));
    }

    //Aula 2 - Imutabilidade
    private static void dobrarValor(){
        int valor = 20;
        UnaryOperator<Integer> valorDobrado = v -> v * 2;
        System.out.println(valorDobrado.apply(valor));
        System.out.println(valor);
    }
}
