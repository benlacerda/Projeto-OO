package Modelo;
import java.util.List;

public class Filial {
    // Atributos
    private String nome_filial;
    private String cidade_filial;
    private List<Bone> estoque;

    // Construtor
    public Filial(String nm, String cid) {
        nome_filial = nm;
        cidade_filial = cid;
    }

    // Getters e Setters
    public String getNome_filial() {
        return nome_filial;
    }

    public void setNome_filial(String nome_filial) {
        this.nome_filial = nome_filial;
    }

    public String getCidade_filial() {
        return cidade_filial;
    }

    public void setCidade_filial(String cidade_filial) {
        this.cidade_filial = cidade_filial;
    }

    // Get e set de estoque
    public List<Bone> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Bone> estoque) {
        this.estoque = estoque;
    }

    // Representar o objeto como String
    @Override
    public String toString() {
        return nome_filial + " " + cidade_filial + " " + " " + estoque;
    }
}
