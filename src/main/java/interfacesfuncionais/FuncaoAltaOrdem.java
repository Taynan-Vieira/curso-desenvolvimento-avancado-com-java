package interfacesfuncionais;

public class FuncaoAltaOrdem {

    public static void main(String[] args) {
        Calculo soma = (a, b) -> a+b;
        System.out.println("Soma " + executarOperacao(soma, 1, 3));
        Calculo divisao = (a, b) -> a / b;
        System.out.println("Divisao " + executarOperacao(divisao, 4, 2));
    }

    public static int executarOperacao(Calculo calculo, int a, int b){
        return calculo.calculo(a, b);
    }
}

interface Calculo{
    public int calculo(int a, int b);
}
