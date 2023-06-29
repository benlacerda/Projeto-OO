package Telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Cadastrodefilial {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Filial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Define o layout como null

        // Rótulos
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setFont(new Font("Arial", Font.PLAIN, 14));
        labelNome.setBounds(50, 50, 100, 30);
        
        JLabel labelEndereco = new JLabel("Endereço:");
        labelEndereco.setFont(new Font("Arial", Font.PLAIN, 14));
        labelEndereco.setBounds(50, 90, 100, 30);

        // Campos de texto
        JTextField textFieldNome = new JTextField();
        textFieldNome.setBounds(150, 50, 200, 30);

        JTextField textFieldEndereco = new JTextField();
        textFieldEndereco.setBounds(150, 90, 200, 30);

        // Botão de cadastro
        JButton botaoCadastro = new JButton("Cadastrar");
        botaoCadastro.setBounds(150, 130, 100, 30);

        frame.add(labelNome);
        frame.add(labelEndereco);
        frame.add(textFieldNome);
        frame.add(textFieldEndereco);
        frame.add(botaoCadastro);
        
        botaoCadastro.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String nome = textFieldNome.getText();
        		String endereco = textFieldEndereco.getText();
        		
        		Filial filial = new Filial(nome, endereco);
        		
        		JOptionPane.showMessageDialog(null, "Filial cadastrada com sucesso!");
        		dispose();
        		new telaprincipal();
        	}
        });

        frame.setSize(400, 200); // Define o tamanho da janela
        frame.setVisible(true);
    }

    public void setVisible(boolean b) {
    }
}
