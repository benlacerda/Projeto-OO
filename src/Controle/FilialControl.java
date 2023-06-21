package Controle;

import Modelo.Dados;
import Modelo.Filial;
import Modelo.Bone;

import java.util.ArrayList;
import java.util.List;

public class FilialControl {

    private Dados dados;

    public FilialControl(Dados dados) {
        this.dados = dados;
    }

    public Filial[] listarFiliais() {
        return dados.getdFilial();
    }

    public Filial buscarFilialPorNome(String nome) {
        for (Filial filial : dados.getdFilial()) {
            if (filial != null && filial.getNome_filial().equalsIgnoreCase(nome)) {
                return filial;
            }
        }
        return null;
    }

    public void cadastrarFilial(Filial filial) {
        for (int i = 0; i < dados.getdFilial().length; i++) {
            if (dados.getdFilial()[i] == null) {
                dados.getdFilial()[i] = filial;
                break;
            }
        }
    }

    public void editarFilial(String nome, Filial filialEditada) {
        for (int i = 0; i < dados.getdFilial().length; i++) {
            Filial filial = dados.getdFilial()[i];
            if (filial != null && filial.getNome_filial().equalsIgnoreCase(nome)) {
                dados.getdFilial()[i] = filialEditada;
                break;
            }
        }
    }

    public void excluirFilial(String nome) {
        for (int i = 0; i < dados.getdFilial().length; i++) {
            Filial filial = dados.getdFilial()[i];
            if (filial != null && filial.getNome_filial().equalsIgnoreCase(nome)) {
                dados.getdFilial()[i] = null;
                break;
            }
        }
    }

    public List<Bone> filtrarItensEstoquePorFilial(String nomeFilial) {
        List<Bone> itensFiltrados = new ArrayList<>();

        for (Filial filial : dados.getdFilial()) {
            if (filial != null && filial.getNome_filial().equalsIgnoreCase(nomeFilial)) {
                List<Bone> estoque = filial.getEstoque();
                if (estoque != null) {
                    itensFiltrados.addAll(estoque);
                }
                break;
            }
        }

        return itensFiltrados;
    }
}
