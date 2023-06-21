package Controle;

import Modelo.Bone;
import Modelo.Dados;

public class BoneControl {

    private Dados dados;

    public BoneControl(Dados dados) {
        this.dados = dados;
    }

    public Bone[] listarBones() {
        return dados.getdBones();
    }

    public Bone buscarBonePorNome(String nome) {
        for (Bone bone : dados.getdBones()) {
            if (bone != null && bone.getNome_bone().equalsIgnoreCase(nome)) {
                return bone;
            }
        }
        return null;
    }

    public void cadastrarBone(Bone bone) {
        for (int i = 0; i < dados.getdBones().length; i++) {
            if (dados.getdBones()[i] == null) {
                dados.getdBones()[i] = bone;
                break;
            }
        }
    }

    public void editarBone(String nome, Bone boneEditado) {
        for (int i = 0; i < dados.getdBones().length; i++) {
            Bone bone = dados.getdBones()[i];
            if (bone != null && bone.getNome_bone().equalsIgnoreCase(nome)) {
                dados.getdBones()[i] = boneEditado;
                break;
            }
        }
    }

    public void excluirBone(String nome) {
        for (int i = 0; i < dados.getdBones().length; i++) {
            Bone bone = dados.getdBones()[i];
            if (bone != null && bone.getNome_bone().equalsIgnoreCase(nome)) {
                dados.getdBones()[i] = null;
                break;
            }
        }
    }
}
