package Controle;

import Modelo.Dados;
import Modelo.Bone;
import Modelo.Filial;

public class DadosControl {

    private Dados dados;

    public DadosControl(Dados dados) {
        this.dados = dados;
    }

    public Bone[] listarBones() {
        return dados.getdBones();
    }

    public void cadastrarBone(Bone bone) {
        for (int i = 0; i < dados.getdBones().length; i++) {
            if (dados.getdBones()[i] == null) {
                dados.getdBones()[i] = bone;
                break;
            }
        }
    }

    public void editarBone(int posicao, Bone boneEditado) {
        if (posicao >= 0 && posicao < dados.getdBones().length) {
            dados.getdBones()[posicao] = boneEditado;
        }
    }

    public void excluirBone(int posicao) {
        if (posicao >= 0 && posicao < dados.getdBones().length) {
            dados.getdBones()[posicao] = null;
        }
    }

    public Filial[] listarFiliais() {
        return dados.getdFilial();
    }

    public void cadastrarFilial(Filial filial) {
        for (int i = 0; i < dados.getdFilial().length; i++) {
            if (dados.getdFilial()[i] == null) {
                dados.getdFilial()[i] = filial;
                break;
            }
        }
    }

    public void editarFilial(int posicao, Filial filialEditada) {
        if (posicao >= 0 && posicao < dados.getdFilial().length) {
            dados.getdFilial()[posicao] = filialEditada;
        }
    }

    public void excluirFilial(int posicao) {
        if (posicao >= 0 && posicao < dados.getdFilial().length) {
            dados.getdFilial()[posicao] = null;
        }
    }
}
