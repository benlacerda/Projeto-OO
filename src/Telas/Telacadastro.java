package Telas;

import javax.swing.*;
import java.awt.*;
import Modelo.Bone;


public class Telacadastro {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Item");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Define o layout como null

        // Rótulos
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setFont(new Font("Arial", Font.PLAIN, 14));
        labelNome.setBounds(50, 50, 100, 30);
        
        JLabel labelMarca = new JLabel("Marca:");
        labelMarca.setFont(new Font("Arial", Font.PLAIN, 14));
        labelMarca.setBounds(50, 90, 100, 30);
        
        JLabel labelDescricao = new JLabel("Descrição:");
        labelDescricao.setFont(new Font("Arial", Font.PLAIN, 14));
        labelDescricao.setBounds(50, 130, 100, 30);
        
        JLabel labelPreco = new JLabel("Preço:");
        labelPreco.setFont(new Font("Arial", Font.PLAIN, 14));
        labelPreco.setBounds(50, 170, 100, 30);
        
        JLabel labelQuantidade = new JLabel("Quantidade:");
        labelQuantidade.setFont(new Font("Arial", Font.PLAIN, 14));
        labelQuantidade.setBounds(50, 210, 100, 30);

        // Campos de texto
        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(150, 50, 200, 30);

        JTextField textFieldMarca = new JTextField();
        textFieldMarca.setBounds(150, 90, 200, 30);

        JTextField textFieldDescricao = new JTextField();
        textFieldDescricao.setBounds(150, 130, 200, 30);

        JTextField textFieldPreco = new JTextField();
        textFieldPreco.setBounds(150, 170, 200, 30);

        JTextField textFieldQuantidade = new JTextField();
        textFieldQuantidade.setBounds(150, 210, 200, 30);

        // Botão de cadastro
        JButton botaoCadastro = new JButton("Cadastrar");
        botaoCadastro.setBounds(150, 250, 100, 30);

        frame.add(labelNome);
        frame.add(labelMarca);
        frame.add(labelDescricao);
        frame.add(labelPreco);
        frame.add(labelQuantidade);
        frame.add(textFieldNome);
        frame.add(textFieldMarca);
        frame.add(textFieldDescricao);
        frame.add(textFieldPreco);
        frame.add(textFieldQuantidade);
        frame.add(botaoCadastro);
        
        botaoCadastro.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String nome = textFieldNome.getText();
        		String marca = textFieldMarca.getText();
        		String descricao = textFieldDescricao.getText();
        		double preco = Double.parseDouble(textFieldPreco.getText());
        		int quantidade = Integer.parseInt(textFieldQuantidade.getText());
        		
        		Bone bone = new Bone(nome, marca, descricao, preco, quantidade);
        		
        		JOptionPane.showMessageDialog(null,"Bone cadastrado com sucesso!");
        		
        		dispose();
        		new MenuPrincipal();
        	}
        });

        public void setVisible(boolean b) {
        }

        frame.setSize(400, 350); // Define o tamanho da janela
        frame.setVisible(true);
    }
}



