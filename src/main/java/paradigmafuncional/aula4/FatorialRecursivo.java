package paradigmafuncional.aula4;
public class FatorialRecursivo {

    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    private static int fatorial(int i) {
        if(i == 1){
            return i;
        }else{
            return i * fatorial((i -1));
        }
    }
}
