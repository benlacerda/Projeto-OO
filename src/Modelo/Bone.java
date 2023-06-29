package Modelo;

// Classe Bone (classe pai)
public class Bone {

    // Atributos
    protected String nome_bone;
    protected String marca_bone;
    protected double preco_bone;
    protected String descricao_bone;

    // Construtor
    public Bone(String nm, String mrc, double prc, String des) {
        nome_bone = nm;
        marca_bone = mrc;
        preco_bone = prc;
        descricao_bone = des;
    }

    // Métodos

    // Getters e Setters
    public String getNome_bone() {
        return nome_bone;
    }

    public void setNome_bone(String nome_bone) {
        this.nome_bone = nome_bone;
    }

    public String getMarca_bone() {
        return marca_bone;
    }

    public void setMarca_bone(String marca_bone) {
        this.marca_bone = marca_bone;
    }

    public double getPreco_bone() {
        return preco_bone;
    }

    public void setPreco_bone(double preco_bone) {
        this.preco_bone = preco_bone;
    }

    public String getDescricao_bone() {
        return descricao_bone;
    }

    public void setDescricao_bone(String descricao_bone) {
        this.descricao_bone = descricao_bone;
    }

    // Representar o objeto como String
    @Override
    public String toString() {
        return nome_bone + " " + marca_bone + " " + preco_bone + " " + descricao_bone;
    }
}
