package Telas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controle.*;

public class ListagemFilial implements ActionListener, ListSelectionListener {
     private JFrame janela;
    private JLabel titulo;
    private JButton cadastroFilial;
	private JButton refreshFilial;
    private static DadosControl dados;
    private JList<String> listaFiliaisCadastradas;
    private String[] lista_filial = new String[50];


    public void mostrarDados(DadosControl d, int op) {
        dados = d;

        switch (op) {
            case 3: // Mostrar dados de Filiais cadastradas (JList)
                lista_filial = new FilialControl(dados).getNomeFilial();
                listaFiliaisCadastradas = new JList<String>(lista_filial);
                janela = new JFrame("Filial");
                titulo = new JLabel("Filiais Cadastradas");
                cadastroFilial = new JButton("Cadastrar");
			    refreshFilial = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaFiliaisCadastradas.setBounds(20, 50, 350, 120);
                listaFiliaisCadastradas.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaFiliaisCadastradas.setVisibleRowCount(10);

                cadastroFilial.setBounds(70, 177, 100, 30);
                refreshFilial.setBounds(200, 177, 100, 30);


                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaFiliaisCadastradas);
    			janela.add(cadastroFilial);
			    janela.add(refreshFilial);


                janela.setSize(400, 250);
                janela.setVisible(true);

    			cadastroFilial.addActionListener(this);
			    refreshFilial.addActionListener(this);
                listaFiliaisCadastradas.addListSelectionListener(this);

                break;

                default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Lógica para lidar com eventos de botões, se necessário
        Object src = e.getSource();
		
		//Cadastro de nova filial
		if(src == cadastroFilial)
			new TelaDetalheFilial().inserirEditarFilials(1, dados, null, 0);


		// Atualiza a lista de nomes das filiais mostrada no JList
		if(src == refreshFilial) {
			listaFiliaisCadastradas.setListData(new FilialControl(dados).getNomeFilial());			
			listaFiliaisCadastradas.updateUI();
		}

    }

    public void valueChanged(ListSelectionEvent e) {
        // Lógica para lidar com eventos de seleção na lista, se necessário
        Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaFiliaisCadastradas) {
			new TelaDetalheFilial().inserirEditarFilials(2, dados, this, listaFiliaisCadastradas.getSelectedIndex());
		}
    }
}
