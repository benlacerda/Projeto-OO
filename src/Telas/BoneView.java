package Telas;

import Controle.BoneControl;
import Modelo.Bone;
import Modelo.Dados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoneView extends JFrame {

    private BoneControl controle;
    private JTextField textFieldNome;
    private JTextField textFieldMarca;
    private JTextField textFieldPreco;
    private JTextField textFieldDescricao;
    private JTextField textFieldFoto;
    private JTextField textFieldQuantidade;

    public BoneView() {
        Dados dados = Dados.getInstance();
        controle = new BoneControl(dados);

        // Configurações da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        setTitle("Cadastro de Bones");

        // Painel principal
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        // Rótulos
        JLabel lblNome = new JLabel("Nome:");
        panel.add(lblNome);

        textFieldNome = new JTextField();
        panel.add(textFieldNome);
        textFieldNome.setColumns(10);

        JLabel lblMarca = new JLabel("Marca:");
        panel.add(lblMarca);

        textFieldMarca = new JTextField();
        panel.add(textFieldMarca);
        textFieldMarca.setColumns(10);

        JLabel lblPreco = new JLabel("Preço:");
        panel.add(lblPreco);

        textFieldPreco = new JTextField();
        panel.add(textFieldPreco);
        textFieldPreco.setColumns(10);

        JLabel lblDescricao = new JLabel("Descrição:");
        panel.add(lblDescricao);

        textFieldDescricao = new JTextField();
        panel.add(textFieldDescricao);
        textFieldDescricao.setColumns(10);

        JLabel lblFoto = new JLabel("Foto:");
        panel.add(lblFoto);

        textFieldFoto = new JTextField();
        panel.add(textFieldFoto);
        textFieldFoto.setColumns(10);

        JLabel lblQuantidade = new JLabel("Quantidade:");
        panel.add(lblQuantidade);

        textFieldQuantidade = new JTextField();
        panel.add(textFieldQuantidade);
        textFieldQuantidade.setColumns(10);

        // Botão cadastrar
        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarBone();
            }
        });
        panel.add(btnCadastrar);

        // Botão listar
        JButton btnListar = new JButton("Listar");
        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarBones();
            }
        });
        panel.add(btnListar);
    }

    private void cadastrarBone() {
        String nome = textFieldNome.getText();
        String marca = textFieldMarca.getText();
        String preco = textFieldPreco.getText();
        String descricao = textFieldDescricao.getText();
        String foto = textFieldFoto.getText();
        String quantidade = textFieldQuantidade.getText();

        Bone bone = new Bone(nome, marca, preco, descricao, foto, quantidade);
        controle.cadastrarBone(bone);
        JOptionPane.showMessageDialog(this, "Bone cadastrado com sucesso!");
    }

    private void listarBones() {
        Bone[] bones = controle.listarBones();
        if (bones != null) {
            for (Bone bone : bones) {
                if (bone != null) {
                    System.out.println(bone);
                }
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BoneView frame = new BoneView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
