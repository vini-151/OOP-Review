package View;

import Model.*;

import java.util.HashMap;

public class Teste {
    public static void main(String[] args) {
        //Instanciando pessoas funcionárias
        Funcionario pessoa1 = new Funcionario();
        pessoa1.setNome("Carlos");
        Funcionario pessoa2 = new Funcionario();
        pessoa2.setNome("Pedro");
        Funcionario pessoa3 = new Funcionario();
        pessoa3.setNome("João");
        Funcionario pessoa4 = new Funcionario();
        pessoa4.setNome("Antonieta");
        Funcionario pessoa5 = new Funcionario();
        pessoa5.setNome("Lucas");

        HashMap map = new HashMap();
        map.put(1, pessoa1);
        map.put(2, pessoa2);
        map.put(3, pessoa3);
        map.put(4, pessoa4);
        map.put(5, pessoa5);

    }
}
