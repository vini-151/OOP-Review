package View;

import java.util.ArrayList;

public class ArrayListInit {

    public static void main(String[] args) {
        ArrayList lista= new ArrayList();

        for(int i = 0; i < 30000; i++) lista.add(i);

        for(int i = 0; i < 30000; i++) System.out.println(lista.get(i));

    }
}
