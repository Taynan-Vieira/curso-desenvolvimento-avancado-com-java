package paradigmafuncional;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
//        calcularValorVezesTres();
        deveMultiplicarPorDoisOsNumerosPares();
    }

    private static void calcularValorVezesTres() {
        UnaryOperator<Integer> resultado = valor -> valor*3;
        System.out.println("O resultado é:: " + resultado.apply(10));
    }

    private static void deveMultiplicarPorDoisOsNumerosPares(){
        int[] valores = {1,2,3,4};

        Arrays.stream(valores)
                .filter(numero -> numero % 2 == 0)
                .map(numero -> numero * 2)
                .forEach(numero -> System.out.println(numero));
    }
}
