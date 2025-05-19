package com.estudos.modelos;

import javax.swing.JOptionPane;

public class Repeater {

    public boolean tryRepeat() {

        int response;

        Object[] options = { "Sim", "Nao" };

        response = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (response != 0) {
            JOptionPane.showMessageDialog(null, "Programa finalizado!", "Conversor", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

        return true;
    }
}
