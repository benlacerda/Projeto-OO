package Telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Controle.DadosControl;


public class TelaDetalheFilial implements ActionListener {
    private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelCidade = new JLabel("Cidade: ");
	private JTextField valorCidade;
	private JButton botaoExcluir = new JButton("Excluir");
	private JButton botaoSalvar = new JButton("Salvar");
	private String[] novoDado = new String[7];
	private static DadosControl dados;
	private int posicao;
	private int opcao;
	private String s;


    public void inserirEditarFilial (int op, DadosControl d, ListagemView p, int pos) {

		opcao = op;
		posicao = pos;
		dados = d;

		if (op == 1)
			s = "Cadastro de Filial";
		if (op == 2)
			s = "Detalhe de Filial";

		janela = new JFrame(s);

		// Preenche dados com dados do aluno clicado
		if (op == 2) {
			valorNome = new JTextField(dados.getFiliais()[pos].getNome_filial(), 200);
			valorCidade = new JTextField(dados.getFiliais()[pos].getCidade_filial(), 200);

		} else { // Não preenche com dados

			valorNome = new JTextField(200);
			valorCidade= new JTextField(200);
			botaoSalvar.setBounds(245, 175, 115, 30);
		}

		labelNome.setBounds(30, 20, 150, 25);
		valorNome.setBounds(180, 20, 180, 25);
		labelCidade.setBounds(30, 50, 150, 25);
		valorCidade.setBounds(180, 50, 180, 25);
		// Coloca botões de excluir e salvar
		if (op == 2) {
			botaoSalvar.setBounds(120, 220, 115, 30);
			botaoExcluir.setBounds(245, 220, 115, 30);
			this.janela.add(botaoExcluir);
		}

		this.janela.add(labelNome);
		this.janela.add(valorNome);
		this.janela.add(labelCidade);
		this.janela.add(valorCidade);

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
                    if (opcao == 1) // cadastro de Filial
                        novoDado[0] = Integer.toString(dados.getQntd_filial());
                    else // edicao de dado existente
                        novoDado[0] = Integer.toString(posicao);

                    novoDado[1] = valorNome.getText();
                    novoDado[2] = valorCidade.getText();
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

                if (opcao == 2) {// exclui aluno
                    res = dados.removerFilial(posicao);
                    if (res)
                        mensagemSucessoExclusao();
                    else
                        mensagemErroExclusaoAluno();
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
