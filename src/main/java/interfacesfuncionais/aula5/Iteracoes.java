package interfacesfuncionais.aula5;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"João", "Paulo", "Oliveira", "Santos"};
        Integer[] numeros = {1, 2, 3, 4, 5};
        imprimirNomeFiltrados(nomes);
    }

    public static void imprimirNomeFiltrados(String... nomes){
        String nomesParaImprimir="";
        for(int i = 0; i< nomes.length; i++){
            if(nomes[i].equals("João")){
                nomesParaImprimir+=""+nomes[i];
            }
        }
        System.out.println("Nomes do for: "+nomesParaImprimir);

        String nomeParaImprimirDaStream = Stream.of(nomes)
                .filter(nome -> nome.equals("João"))
                .collect(Collectors.joining());

        System.out.println("Nomes do stream: "+nomeParaImprimirDaStream);
    }

    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes){
            System.out.println("Imprimindo pelo for "+nome);
        }

        Stream.of(nomes)
                .forEach(nome -> System.out.println("Imprimindo pelo forEach " +nome));
    }

    public static void imprimirODobroDeCadaItemDaLista(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println(numero*2);
        }
    }
}
