package Controle;

import Modelo.Bone;
import Modelo.Dados;

public class BoneControl extends DadosControl {

    @Override
    public Bone[] getLista() {
        // Obtenha a lista de Bones do objeto Dados
        Dados dados = getDados();
        Bone[] listaBones = dados.getListaBones();

        // Retorne a lista de Bones
        return listaBones;
    }

    @Override
    public boolean inserir(String[] dados) {
        // Lógica para inserir um novo Bone na lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a inserção for bem-sucedida, caso contrário, false
    }

    @Override
    public boolean editar(String[] dados) {
        // Lógica para editar um Bone na lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a edição for bem-sucedida, caso contrário, false
    }

    @Override
    public boolean remover(int i) {
        // Lógica para remover um Bone da lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a remoção for bem-sucedida, caso contrário, false
    }
}
