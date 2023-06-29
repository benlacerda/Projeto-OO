package Telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Estoque de Bone");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Define o layout como null

        // Botão de Cadastro Bone
        JButton botaoCadastroB = new JButton("CadastroBone");
        botaoCadastroB.setBounds(185, 200, 130, 30); // Define a posição e o tamanho do botão de cadastro

        // Botão de Cadastro Filial
        JButton botaoCadastroF = new JButton("CadastroFilial");
        botaoCadastroF.setBounds(50, 200, 130, 30);

        // Botão de Listagem
        JButton botaoListagem = new JButton("Listagem");
        botaoListagem.setBounds(320, 200, 130, 30); // Define a posição e o tamanho do botão de listagem

        // Texto
        JLabel label = new JLabel("Estoque de Bone");
        label.setFont(new Font("Arial", Font.BOLD, 20));
        Dimension labelSize = label.getPreferredSize();
        int labelX = 160;
        int labelY = 100; // Define a posição vertical
        label.setBounds(labelX, labelY, labelSize.width, labelSize.height);

        frame.add(botaoCadastroF);
        frame.add(botaoCadastroB);
        frame.add(botaoListagem);
        frame.add(label);

        // Troca de telas
        botaoCadastroB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Telacadastro telaCadastro = new Telacadastro();
                telaCadastro.setVisible(true);
            }
        });

        botaoCadastroF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Cadastrodefilial telaCadastroFilial = new Cadastrodefilial();
                telaCadastroFilial.setVisible(true);
            }
        });

        botaoListagem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                Telalistagem telaListagem = new Telalistagem();
                telaListagem.setVisible(true);
            }
        });

        frame.setSize(485, 295); // Define o tamanho da janela
        frame.setVisible(true);
    }
}
