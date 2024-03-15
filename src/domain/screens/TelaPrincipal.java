package domain.screens;

import domain.controller.TelaPrincipalController;

import javax.swing.*;

public class TelaPrincipal extends JFrame {
    private TelaPrincipalController telaPrincipalController = new TelaPrincipalController();

    public TelaPrincipal() {
        JButton botao = new JButton("Clique aqui");
        botao.setName("botao1");
        botao.addActionListener(telaPrincipalController);
        getContentPane().add(botao);

        JButton botao2 = new JButton("Clique aqui too");
        botao2.setName("botao2");
        botao2.addActionListener(telaPrincipalController);
        getContentPane().add(botao2,"South");

        setTitle("Tela Principal");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TelaPrincipal();
    }
}
