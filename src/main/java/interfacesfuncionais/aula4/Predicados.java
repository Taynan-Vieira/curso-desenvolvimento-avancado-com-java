package interfacesfuncionais.aula4;

import java.util.function.Predicate;

public class Predicados {
    public static void main(String[] args){
        Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio2 = String::isEmpty; //Método de refêrencia
        System.out.println(estaVazio.test(""));
        System.out.println(estaVazio.test("Taynan"));
    }

}
