package interfacesfuncionais.aula4;

import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args){
        Function<String, String> retornaNomeAoContratio = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornaNomeAoContratio.apply("Taynan"));

        Function<String, Integer> converteStringParaInteiroECalculaODobro = string -> Integer.valueOf(string) * 2;
        System.out.println(converteStringParaInteiroECalculaODobro.apply("20"));
    }
}
