package Modelo;

public final class Dados {

    // Array contendo as classes do projeto.
    private static Bone[] dBones = new Bone[50];
    private static Filial[] dFilial = new Filial[50];
    private static ItemVenda[] dItens = new ItemVenda[150];
    private static Venda[] dVendas = new Venda[50];

    // Dados pré-carregados
    static {
        dBones[0] = new Bone("Nome1", "Marca1", 10.0, "Descrição1", new URL("http://example.com/imagem1.jpg"), 5);
        dBones[1] = new Bone("Nome2", "Marca2", 15.0, "Descrição2", new URL("http://example.com/imagem2.jpg"), 10);
        dBones[2] = new Bone("Nome3", "Marca3", 20.0, "Descrição3", new URL("http://example.com/imagem3.jpg"), 8);
    }

    // Getters e Setters
    public Bone[] getdBones() {
        return dBones;
    }

    public void setdBones(Bone[] dBones) {
        Dados.dBones = dBones;
    }

    public Filial[] getdFilial() {
        return dFilial;
    }

    public void setdFilial(Filial[] dFilial) {
        Dados.dFilial = dFilial;
    }

    public ItemVenda[] getdItens() {
        return dItens;
    }

    public void setdItens(ItemVenda[] dItens) {
        Dados.dItens = dItens;
    }

    public Venda[] getdVendas() {
        return dVendas;
    }

    public void setdVendas(Venda[] dVendas) {
        Dados.dVendas = dVendas;
    }
}
