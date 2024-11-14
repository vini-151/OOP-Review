package view;

import model.Divisao;
import model.DivisaoPorZeroException;

public class teste {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        double resultado;
        try{
            resultado = divisao.calcula(10, 0);
        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " +e.getMessage());
        }
    }
}
