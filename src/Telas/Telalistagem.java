package Telas;

import javax.swing.*;
import java.awt.*;

public class Telalistagem {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Listagem");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Define o layout como null

        // Rótulo de pesquisa
        JLabel labelPesquisa = new JLabel("Pesquisa:");
        labelPesquisa.setFont(new Font("Arial", Font.PLAIN, 14));
        labelPesquisa.setBounds(50, 50, 100, 30);

        // Campo de texto para pesquisa
        JTextField textFieldPesquisa = new JTextField();
        textFieldPesquisa.setBounds(150, 50, 200, 30);

        // Botão de pesquisa
        JButton botaoPesquisa = new JButton("Pesquisar");
        botaoPesquisa.setBounds(370, 50, 100, 30);
         // Área de texto para listagem
        JTextArea textAreaListagem = new JTextArea();
        textAreaListagem.setBounds(50, 90, 420, 200);
        textAreaListagem.setEditable(false); // Impede a edição do conteúdo


        frame.add(labelPesquisa);
        frame.add(textFieldPesquisa);
        frame.add(botaoPesquisa);
        frame.add(textAreaListagem);

        botaoPesquisa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String pesquisa = textFieldPesquisa.getText();
                // Aqui você pode realizar a pesquisa nas filiais e nos bones e exibir os resultados na área de resultado (AreaListagem)

                // Exibição do resultado
                textAreaListagem.setText("Resultado da pesquisa:\n");
                textAreaListagem.append("Filiais\n");
                textAreaListagem.append("- Nome: Filial 1, Endereço: Endereço 1\n");
                textAreaListagem.append("- Nome: Filial 2, Endereço: Endereço 2\n\n");
                textAreaListagem.append("Bones:\n");
                textAreaListagem.append("- Nome: Bone 1, Marca: Marca 1, Descrição: Descrição 1, Preço: R$10.00, Quantidade: 5\n");
                textAreaListagem.append("- Nome: Bone 2, Marca: Marca 2, Descrição: Descrição 2, Preço: R$15.00, Quantidade: 3\n");
            }
        });

        frame.setSize(520, 400); // Define o tamanho da janela
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
    }

}


