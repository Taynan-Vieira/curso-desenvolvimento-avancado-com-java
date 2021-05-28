package paradigmafuncional;

public class ParadigmaImperativo {
    public static void main(String[] args) {
//        calcularValorVezesTres();
        deveMultiplicarPorDoisOsNumerosPares();
    }

    private static void calcularValorVezesTres() {
        int valor = 10;
        int resultado = valor * 3;
        System.out.println("O resultado é ::" +resultado);
    }

    //Aula 2 - Composição de funções
    private static void deveMultiplicarPorDoisOsNumerosPares(){
        int[] valores = {1,2,3,4};

        for(int i = 0; i < valores.length; i++){
            int valor = 0;

            if(valores[i] % 2 == 0){
                valor = valores[i] * 2;

                if(valor != 0){
                    System.out.println(valor);
                }
            }
        }
    }

}
