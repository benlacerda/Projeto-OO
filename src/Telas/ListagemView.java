package Telas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import Controle.*;

public class ListagemView implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JLabel titulo;
    private JButton cadastroBoneC;
	private JButton refreshBoneC;
	private JButton cadastroBoneE;
	private JButton refreshBoneE;
    private static DadosControl dados;
    private JList<String> listaBonesCCadastrados;
    private JList<String> listaBonesECadastrados;
    private String[] lista_bonec = new String[50];
    private String[] lista_bonee = new String[50];


    public void mostrarDados(DadosControl d, int op) {
        dados = d;

        switch (op) {
            case 1: // Mostrar dados de bonés casuais cadastrados (JList)
                lista_bonec = new BoneCasualControl(dados).getNomeBoneCasual();
                listaBonesCCadastrados = new JList<String>(lista_bonec);
                janela = new JFrame("Boné Casual");
                titulo = new JLabel("Bonés Casuais Cadastrados");
                cadastroBoneC = new JButton("Cadastrar");
			    refreshBoneC = new JButton("Refresh");

                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaBonesCCadastrados.setBounds(20, 50, 350, 120);
                listaBonesCCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaBonesCCadastrados.setVisibleRowCount(10);

                cadastroBoneC.setBounds(70, 177, 100, 30);
                refreshBoneC.setBounds(200, 177, 100, 30);


                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaBonesCCadastrados);
    			janela.add(cadastroBoneC);
			    janela.add(refreshBoneC);


                janela.setSize(400, 250);
                janela.setVisible(true);

    			cadastroBoneC.addActionListener(this);
			    refreshBoneC.addActionListener(this);
                listaBonesCCadastrados.addListSelectionListener(this);

                break;

            case 2: // Mostrar dados de bonés esportivos cadastrados (JList)
                lista_bonee = new BoneEsportivoControl(dados).getNomeBoneEsportivo();
                listaBonesECadastrados = new JList<String>(lista_bonee);
                janela = new JFrame("Boné Esportivo");
                titulo = new JLabel("Bonés Esportivos Cadastrados");
    			cadastroBoneE = new JButton("Cadastrar");
			    refreshBoneE = new JButton("Refresh");


                titulo.setFont(new Font("Arial", Font.BOLD, 20));
                titulo.setBounds(90, 10, 250, 30);
                listaBonesECadastrados.setBounds(20, 50, 350, 120);
                listaBonesECadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                listaBonesECadastrados.setVisibleRowCount(10);

                cadastroBoneE.setBounds(70, 177, 100, 30);
			    refreshBoneE.setBounds(200, 177, 100, 30);


                janela.setLayout(null);

                janela.add(titulo);
                janela.add(listaBonesECadastrados);
                janela.add(cadastroBoneE);
			    janela.add(refreshBoneE);


                janela.setSize(400, 250);
                janela.setVisible(true);

                cadastroBoneE.addActionListener(this);
			    refreshBoneE.addActionListener(this);
                listaBonesECadastrados.addListSelectionListener(this);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção não encontrada!", null, JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actionPerformed(ActionEvent e) {
        // Lógica para lidar com eventos de botões, se necessário
        Object src = e.getSource();
		
		//Cadastro de novo aluno
		if(src == cadastroBoneC)
			new TelaDetalheBone().inserirEditar(1, dados, this, 0);

		//Cadastro de novo professor
		if(src == cadastroBoneE)
			new TelaDetalheBone().inserirEditar(2, dados, this, 0);

		// Atualiza a lista de nomes de alunos mostrada no JList
		if(src == refreshBoneC) {
			listaBonesCCadastrados.setListData(new BoneCasualControl(dados).getNomeBoneCasual());			
			listaBonesCCadastrados.updateUI();
		}

		// Atualiza a lista de nomes de professores mostrada no JList
		if(src == refreshBoneE) {
			listaBonesECadastrados.setListData(new BoneEsportivoControl(dados).getNomeBoneEsportivo());
			listaBonesECadastrados.updateUI();
		}

    }

    public void valueChanged(ListSelectionEvent e) {
        // Lógica para lidar com eventos de seleção na lista, se necessário
        Object src = e.getSource();

		if(e.getValueIsAdjusting() && src == listaBonesCCadastrados) {
			new TelaDetalheBone().inserirEditar(3, dados, this, 
					listaBonesCCadastrados.getSelectedIndex());
		}

		if(e.getValueIsAdjusting() && src == listaBonesECadastrados) {
			new TelaDetalheBone().inserirEditar(4, dados, this, 
					listaBonesECadastrados.getSelectedIndex());
		}
    }
}