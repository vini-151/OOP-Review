package Model;

public class Array {
    float[] array = new float[10];

    public float media(){
        float somatoria = 0;
        for (int i = 0; i < this.array.length; i++) {
            somatoria += this.array[i];
        }
        System.out.println("Média: "+somatoria / 10);
        return somatoria / 10;
    }

    public void comparaNotas(float media){
        for(int i = 0; i < this.array.length; i++){
            if(this.array[i] > media) System.out.println("Nota: " +this.array[i] + " é maior que a média: "+media);
        }
    }

    public void setArray(int index, float valor) {
        this.array[index] = valor;
    }

    public float[] getArray() {
        return array;
    }


}
