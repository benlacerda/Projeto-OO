package Modelo;

import java.net.URL;

public final class Dados {

    private static Bone[] dBones = new Bone[50];
    private static Filial[] dFiliais = new Filial[50];

    static {
        dBones[0] = new Bone("Nome1", "Marca1", 10.0, "Descrição1", "http://example.com/imagem1.jpg", 5);
        dBones[1] = new Bone("Nome2", "Marca2", 15.0, "Descrição2", "http://example.com/imagem2.jpg", 10);
        dBones[2] = new Bone("Nome3", "Marca3", 20.0, "Descrição3", "http://example.com/imagem3.jpg", 8);

        dFiliais[0] = new Filial("Filial1", "Cidade1", "Endereço1", "Telefone1", "CNPJ1");
        dFiliais[1] = new Filial("Filial2", "Cidade2", "Endereço2", "Telefone2", "CNPJ2");
        dFiliais[2] = new Filial("Filial3", "Cidade3", "Endereço3", "Telefone3", "CNPJ3");
    }

    public Bone[] getdBones() {
        return dBones;
    }

    public void setdBones(Bone[] dBones) {
        Dados.dBones = dBones;
    }

    public Filial[] getdFilial() {
        return dFiliais;
    }

    public void setdFiliais(Filial[] dFiliais) {
        Dados.dFiliais = dFiliais;
    }
}
