package novidadesdojava10.aula1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) throws IOException {
        connectedAndPrintUrlJavaOracle();
    }

    private static void connectedAndPrintUrlJavaOracle() throws IOException {
        var url = new URL("https://www.oracle.com/br/java/");
        var urlConnection = url.openConnection();

        try( var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))){
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }catch (Exception e){
            e.printStackTrace();
        }



    }

    public static void printarNomeCompleto(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

}
