package domain.screens;

import javax.swing.*;

public class TelaPrincipal extends JFrame {

    public TelaPrincipal() {

        JButton botao = new JButton("Clique aqui");
        botao.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Você clicou no botão");
        });
        getContentPane().add(botao,"South");
        setTitle("Tela Principal");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
