package paradigmafuncional;

import java.util.function.UnaryOperator;

public class ParadigmaFuncional {
    public static void main(String[] args) {
        UnaryOperator<Integer> calcularValorVezesTres = valor -> valor*3;
        System.out.println("O resultado é:: " + calcularValorVezesTres.apply(10));
    }
}
