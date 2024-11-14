package model;

public class Divisao {

    public double calcula(double n1, double n2) {
        if (n1 == 0 || n2 == 0){
            throw new DivisaoPorZeroException("Divisao por zero impossível");
        }else{
            return n1 / n2;
        }
    }
}
