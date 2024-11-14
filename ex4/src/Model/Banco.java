package Model;

import java.util.ArrayList;

public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();
    public String nomeDoBanco;

    public ArrayList getContas() {
        return contas;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);

    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    void adicionaConta(Conta c) {
        contas.add(c);
    }

    public Conta recuperaConta(int numeroConta) {
        for (Conta c : contas) {
            if(c.getNumero() == numeroConta){
                return c;
            }
        }
        return null;
    }
}
