package paradigmafuncional.aula4;

public class FatorialTaillCall {

    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA(double valor){
        return fatorialComTailCall(valor, 1);
    }
    //Obs.: Java não possue taill call. Gerará  stackoverflow para números muito grandes
    public static double fatorialComTailCall(double valor, double numero){
        if(valor ==0){
            return numero;
        }
        else{
            return fatorialComTailCall(valor - 1, numero*valor);
        }
    }
}
