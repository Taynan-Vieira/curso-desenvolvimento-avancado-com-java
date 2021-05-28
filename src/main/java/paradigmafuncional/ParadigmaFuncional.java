package paradigmafuncional;

import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        calcularValorVezesTres();
    }

    private static void calcularValorVezesTres() {
        UnaryOperator<Integer> resultado = valor -> valor*3;
        System.out.println("O resultado é:: " + resultado.apply(10));
    }
}
