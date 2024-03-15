package domain.controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipalController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JComponent button = (JComponent) e.getSource();

        if (button.getName().equals("botao1")) {
            JOptionPane.showMessageDialog(null, "Você clicou no botão 1");
        } else if (button.getName().equals("botao2")) {
            JOptionPane.showMessageDialog(null, "Você clicou no botão 2");
        }
    }
}
