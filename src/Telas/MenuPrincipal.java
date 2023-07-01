package Telas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controle.*;



public class MenuPrincipal implements ActionListener {
	public static DadosControl dados = new DadosControl();
	private static JFrame j = new JFrame("Estoque de Bone");
	private static JLabel t = new JLabel("Menu Principal");
	private static JButton CadastroB = new JButton("CadastroBone");
	private static JButton Filial = new JButton("Filial");
	private static JButton ListagemBoneC = new JButton("Listagem BCasual");
	private static JButton Busca = new JButton("BuscaFilial");
	private static JButton ListagemBoneE = new JButton("Listagem BEsportivo");
   

	public MenuPrincipal() {
		t.setFont(new Font("Arial", Font.BOLD, 20));
		t.setBounds(160, 100, 150, 30);
		CadastroB.setBounds(110, 200, 130, 30);
		Filial.setBounds(110, 160, 130, 30);
		ListagemBoneC.setBounds(250, 200, 130, 30);
		Busca.setBounds(250, 160, 130, 30);
		ListagemBoneE.setBounds(250, 250, 130, 30);
		
		j.setLayout(null);
		
		j.add(t);
		j.add(CadastroB);
		j.add(Filial);
		j.add(ListagemBoneC);
		j.add(Busca);
		j.add(ListagemBoneE);
		
		j.setSize(485, 295);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	
	 public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		
		CadastroB.addActionListener(menu);
		Filial.addActionListener(menu);
		ListagemBoneC.addActionListener(menu);
		Busca.addActionListener(menu);
		ListagemBoneE.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	    if(src == ListagemBoneC)
	    	new ListagemView().mostrarDados(dados, 1);


		if(src == ListagemBoneE)
	    	new ListagemView().mostrarDados(dados, 2);
		
		if(src == Filial)
	    	new ListagemFilial().mostrarDados(dados, 3);
	}
}