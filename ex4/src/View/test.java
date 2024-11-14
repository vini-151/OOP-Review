package View;

import Model.*;

public class test {
    public static void main(String[] args) {
        Banco bancoPoupaMais = new Banco();
        bancoPoupaMais.setNomeDoBanco("Poupa Mais");

        Conta cc = new Conta();
        cc.setNumero(1234);
        cc.setTitular("Carlos");

        bancoPoupaMais.addConta(cc);

        Conta cc2 = new Conta();

        cc2 = bancoPoupaMais.recuperaConta(1234);
        System.out.println(cc2.getTitular());
    }
}
