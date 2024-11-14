package View;
import Model.*;

import javax.swing.*;


public class initArray {
    public static void main(String[] args) {

        Array media = new Array();

        for(int i = 0; i < media.getArray().length; i++){
            media.setArray(i, Integer.parseInt(JOptionPane.showInputDialog(null, "insira nota " +i, 0)));
        }

        media.comparaNotas(media.media());

    }
}
