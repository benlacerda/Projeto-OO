package Controle;

import Modelo.Filial;
import Modelo.Dados;

public class FilialControl extends DadosControl<Filial> {

    public FilialControl(Dados<Filial> dados) {
        super(dados);
    }

    @Override
    public boolean inserir(String[] dados) {
        // Lógica para inserir uma nova Filial na lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a inserção for bem-sucedida, caso contrário, false
    }

    @Override
    public boolean editar(String[] dados) {
        // Lógica para editar uma Filial na lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a edição for bem-sucedida, caso contrário, false
    }

    @Override
    public boolean remover(int i) {
        // Lógica para remover uma Filial da lista
        // Implemente de acordo com seus requisitos

        return false; // Retorne true se a remoção for bem-sucedida, caso contrário, false
    }

    @Override
    public Filial[] getLista() {
        // Obtenha a lista de Filiais do objeto Dados
        Dados<Filial> dados = getDados();
        Filial[] listaFiliais = dados.getLista();

        // Retorne a lista de Filiais
        return listaFiliais;
    }
}
