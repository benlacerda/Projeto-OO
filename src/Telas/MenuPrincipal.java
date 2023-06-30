package Telas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import Controle.*;



public class MenuPrincipal implements ActionListener {
	private static JFrame j = new JFrame("Estoque de Bone");
	private static JLabel t = new JLabel("Menu Principal");
	private static JButton CadastroB = new JButton("CadastroBone");
	private static JButton CadastroF = new JButton("CadastroFilial");
	private static JButton Listagem = new JButton("Listagem");
	private static JButton Busca = new JButton("BuscaFilial");
    private static DadosControl dados = new DadosControl();

	public MenuPrincipal() {
		t.setFont(new Font("Arial", Font.BOLD, 20));
		t.setBounds(160, 100, 150, 30);
		CadastroB.setBounds(110, 200, 130, 30);
		CadastroF.setBounds(110, 160, 130, 30);
		Listagem.setBounds(250, 200, 130, 30);
		Busca.setBounds(250, 160, 130, 30);
		
		j.setLayout(null);
		
		j.add(t);
		j.add(CadastroB);
		j.add(CadastroF);
		j.add(Listagem);
		j.add(Busca);
		
		j.setSize(485, 295);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	
	 public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		
		//CadastroB.addActionListener(menu);
		//CadastroF.addActionListener(menu);
		Listagem.addActionListener(menu);
		//Busca.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	    if(src == Listagem)
	    	new ListagemView().mostrarDados(dados, 1);
	}
}