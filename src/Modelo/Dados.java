package Modelo;

// Classe Dados para ser o nosso "Banco de dados"

public final class Dados {

    //Array contendo as classes do projeto.

    private static Bone[] dBones = new Bone[50];
    private static Filial[] dFilial = new Filial[50];
    private static ItemVenda[] dItens = new ItemVenda[150];
    private static Venda[] dVendas = new Venda[50];

    //Dados pre-carregados
    static {

        //dBones[0] = new Bone();
        //dBones[1] = new Bone();
        //dBones[2] = new Bone();
        //dBones[3] = new Bone();

        //dVendas[0] = new Venda('C', 1);
        //dVendas[0].addItem(new ItemVenda(dBones[0], 1));
        //dVendas[1] = new Venda('B', 2);
        //dVendas[1].addItem(new ItemVenda(dBones[0], 2));
        //dVendas[1].addItem(new ItemVenda(dBones[1], 3));
        //dVendas[2] = new Venda('P', 3);
        //dVendas[2].addItem(new ItemVenda(dBones[0], 1));
        //dVendas[2].addItem(new ItemVenda(dBones[1], 3));
        //dVendas[2].addItem(new ItemVenda(dBones[2], 5));
    }

    //gets e sets
    public Bone[] getdBone() {
        return dBones;
    }
    public void inserirEditaBone(Bone bon, int pos) {
        Dados.dBones[pos] = bon;
    }
    public Filial[] getdFilial() {return dFilial;}
    public void inserirEditaFilial(Filial[] e) {
        Dados.dFilial = e;
    }
    public ItemVenda[] getdItens() {
        return dItens;
    }
    public Venda[] getdVendas() {
        return dVendas;
    }
    public void inserirEditaVenda(Venda v, int pos) {
        Dados.dVendas[pos] = v;
    }
}
