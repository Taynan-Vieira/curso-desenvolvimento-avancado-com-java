package processamentoassincroneparalelo.aula4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(num -> fatorial(num));//Serial
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução serial :: " +(fim-inicio));

        inicio = System.currentTimeMillis();
        IntStream.range(1, 10000).parallel().forEach(num -> fatorial(num));//parallel
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução parallel:: " +(fim-inicio));

        List<String> nomes = Arrays.asList("Taynan", "Vieira", "Lima");
        nomes.parallelStream().forEach(System.out::println);
    }

    private static long fatorial(long num) {
        long fat = 1;

        for(long i = 2; i <= num; i++){
            fat*=i;
        }
        return fat;
    }
}