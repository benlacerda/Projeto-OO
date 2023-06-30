package Modelo;

// Classe Bone (classe pai)
public abstract class Bone {

    // Atributos
    protected String nome;
    protected String marca;
    protected double preco;
    protected String descricao;

    // Construtor
    public Bone() {
       super();
    }

    // Métodos

    // Getters e Setters
    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    public double getpreco() {
        return preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    // Representar o objeto como String
    @Override
    public String toString() {
        return nome + " " + marca + " " + preco + " " + descricao;
    }
}
