package interfacesfuncionais.aula4;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[] args){
        Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
        Supplier<Pessoa> instanciaPessoa2 = Pessoa::new;
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "João";
        idade = 23;
    }

    @Override
    public String toString() {
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
