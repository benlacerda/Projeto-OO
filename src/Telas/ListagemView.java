package Telas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controle.*;

public class ListagemView implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JLabel titulo;
    private static DadosControl dados;
    private JList<String> listaBonesCCadastrados;
    private JList<String> listaBonesECadastrados;
    private String[] lista_bones = new String[50];

    public void mostrarDados(DadosControl d, int op) {
        dados = d;

        switch (op) {
            case 1: // Mostrar dados de bonés casuais cadastrados (JList)
                lista_bones = new BoneCasualControl(dados).getNome();
                listaBonesCCadastrados = new JList<String>(lista_bones);
                janela = new JFrame("Boné Casual");
                titulo = new JLabel("Bonés Casuais Cadastrados");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaBonesCCadastrados.setBounds(20, 50, 350, 120);
                listaBonesCCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaBonesCCadastrados.setVisibleRowCount(10);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaBonesCCadastrados);

                janela.setSize(400, 250);
                janela.setVisible(true);

                listaBonesCCadastrados.addListSelectionListener(this);

                break;

            case 2: // Mostrar dados de bonés esportivos cadastrados (JList)
                lista_bones = new BoneEsportivoControl(dados).getNome();
                listaBonesECadastrados = new JList<String>(lista_bones);
                janela = new JFrame("Boné Esportivo");
                titulo = new JLabel("Bonés Esportivos Cadastrados");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaBonesECadastrados.setBounds(20, 50, 350, 120);
                listaBonesECadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaBonesECadastrados.setVisibleRowCount(10);

                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaBonesECadastrados);

                janela.setSize(400, 250);
                janela.setVisible(true);

                listaBonesECadastrados.addListSelectionListener(this);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Lógica para lidar com eventos de botões, se necessário
    }

    public void valueChanged(ListSelectionEvent e) {
        // Lógica para lidar com eventos de seleção na lista, se necessário
    }
}