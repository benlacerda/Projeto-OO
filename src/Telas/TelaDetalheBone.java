package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Controle.DadosControl;

public class TelaDetalheBone implements ActionListener {
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPreco = new JLabel("Preço: ");
	private JTextField valorPreco;
	private JLabel labelDescricao = new JLabel("Descrição: ");
	private JTextField valorDescricao;
	private JLabel labelTipo = new JLabel("Tipo Bone: ");
	private JTextField valorTipo;
	private JLabel labelCodigo = new JLabel("Código: ");
	private JTextField valorCodigo;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[7];
	private static DadosControl dados;
	private int posicao;
	private int opcao;
	private String s;

	public void inserirEditar(int op, DadosControl d, ListagemView p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Boné Casual";
		if (op == 2)
			s = "Cadastro de Boné Esportivo";
		if (op == 3)
			s = "Detalhe de Boné Casual";
		if (op == 4)
			s = "Detalhe de Boné Esportivo";

		janela = new JFrame(s);

		// Preenche dados com dados do aluno clicado
		if (op == 3) {
			valorNome = new JTextField(dados.getBoneCasuals()[pos].getnome(), 200);
			valorMarca = new JTextField(dados.getBoneCasuals()[pos].getmarca(), 200);
			valorPreco = new JTextField(String.valueOf(dados.getBoneCasuals()[pos].getpreco()), 200);
			valorDescricao = new JTextField(dados.getBoneCasuals()[pos].getdescricao(), 200);
			valorTipo = new JTextField(String.valueOf(dados.getBoneCasuals()[pos].getTipo_casual()), 200);
			valorCodigo = new JTextField(String.valueOf(dados.getBoneCasuals()[pos].getCodigo_id_casual()), 3);

		} else if (op == 4) { // Preenche dados com dados do professor clicado
			valorNome = new JTextField(dados.getBoneEsportivos()[pos].getnome(), 200);
			valorMarca = new JTextField(String.valueOf(dados.getBoneEsportivos()[pos].getmarca()), 200);
			valorPreco = new JTextField(String.valueOf(dados.getBoneEsportivos()[pos].getpreco()), 200);
			valorDescricao = new JTextField(String.valueOf(dados.getBoneEsportivos()[pos].getdescricao()), 200);
			valorTipo = new JTextField(String.valueOf(dados.getBoneEsportivos()[pos].getTipo_esportivo()), 200);
			valorCodigo = new JTextField(String.valueOf(dados.getBoneEsportivos()[pos].getCodigo_id_esportivo()), 3);

		} else { // Não preenche com dados

			valorNome = new JTextField(200);
			valorMarca = new JTextField(200);
			valorPreco = new JTextField(200);
			valorDescricao = new JTextField(200);
			valorTipo = new JTextField(200);
			valorCodigo = new JTextField(3);

			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelMarca.setBounds(30, 50, 150, 25);
		valorMarca.setBounds(180, 50, 180, 25);
		labelPreco.setBounds(30, 80, 150, 25);
		valorPreco.setBounds(180, 80, 180, 25);
		labelDescricao.setBounds(30, 110, 150, 25);
		valorDescricao.setBounds(180, 110, 180, 25);
		labelTipo.setBounds(30, 140, 150, 25);
		valorTipo.setBounds(180, 140, 180, 25);
		labelCodigo.setBounds(30, 170, 150, 25);
		valorCodigo.setBounds(180, 170, 28, 25);

		// Coloca botões de excluir e salvar
		if (op == 3 || op == 4) {
			botaoSalvar.setBounds(120, 220, 115, 30);
			botaoExcluir.setBounds(245, 220, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelMarca);
		this.janela.add(valorMarca);
		this.janela.add(labelPreco);
		this.janela.add(valorPreco);
		this.janela.add(labelDescricao);
		this.janela.add(valorDescricao);
		this.janela.add(labelTipo);
		this.janela.add(valorTipo);
		this.janela.add(labelCodigo);
		this.janela.add(valorCodigo);
		this.janela.add(botaoSalvar);

		this.janela.setLayout(null);

		this.janela.setSize(400, 300);
		this.janela.setVisible(true);

		botaoSalvar.addActionListener(this);
		botaoExcluir.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src == botaoSalvar) {
			try {
				boolean res;
				res = true;
				if (opcao == 1) // cadastro de boné casual
					novoDado[0] = Integer.toString(dados.getQntd_boneCasuals());
				else if (opcao == 2) // cadastro de boné esportivo
					novoDado[0] = Integer.toString(dados.getQntd_boneEsportivo());
				else // edicao de dado existente
					novoDado[0] = Integer.toString(posicao);

				novoDado[1] = valorNome.getText();
				novoDado[2] = valorMarca.getText();
				novoDado[3] = valorPreco.getText();
				novoDado[4] = valorDescricao.getText();
				novoDado[5] = valorTipo.getText();
				novoDado[6] = valorCodigo.getText();

				if (res) {
					mensagemSucessoCadastro();
				} else
					mensagemErroCadastro();

			} catch (NullPointerException exc1) {
				mensagemErroCadastro();
			} catch (NumberFormatException exc2) {
				mensagemErroCadastro();
			}
		}

		if (src == botaoExcluir) {
			boolean res = false;

			if (opcao == 3) {// exclui aluno
				res = dados.temoverBoneCasual(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoAluno();
			}

			if (opcao == 4) { // exclui professor
				res = dados.removerBoneEsportivo(posicao);
				if (res)
					mensagemSucessoExclusao();
				else
					mensagemErroExclusaoProf();
			}

		}
	}

	public void mensagemSucessoExclusao() {
		JOptionPane.showMessageDialog(null, "Os dados foram excluídos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemSucessoCadastro() {
		JOptionPane.showMessageDialog(null, "Os dados foram salvos com sucesso!", null,
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}

	public void mensagemErroCadastro() {
		JOptionPane.showMessageDialog(null,
				"ERRO AO SALVAR OS DADOS!\n " + "Pode ter ocorrido um dos dois erros a seguir:  \n"
						+ "1. Nem todos os campos foram preenchidos \n"
						+ "2. CPF, identidade, DDD e telefone não contêm apenas números",
				null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoAluno() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o aluno está matriculado\n" + "em alguma disciplina. Se sim, cancele\n "
				+ "a matrícula e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}

	public void mensagemErroExclusaoProf() {
		JOptionPane.showMessageDialog(null, "Ocorreu um erro ao excluir o dado.\n "
				+ "Verifique se o professor está responsável\n" + "por alguma disciplina. Se sim, substitua\n "
				+ "o professor e tente novamente.", null, JOptionPane.ERROR_MESSAGE);
	}
}
