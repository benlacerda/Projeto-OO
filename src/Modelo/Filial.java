package Modelo;
import java.util.List;

public class Filial {
    // Atributos
    private String nome_filial;
    private String cidade_filial;
    private String endereco_filial;
    private String tel_filial;
    private String cnpj_filial;
    private List<Bone> estoque;

    // Construtor
    public Filial(String nm, String cid, String end, String tel, String cnpj) {
        nome_filial = nm;
        cidade_filial = cid;
        endereco_filial = end;
        tel_filial = tel;
        cnpj_filial = cnpj;
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

    public String getEndereco_filial() {
        return endereco_filial;
    }

    public void setEndereco_filial(String endereco_filial) {
        this.endereco_filial = endereco_filial;
    }

    public String getTel_filial() {
        return tel_filial;
    }

    public void setTel_filial(String tel_filial) {
        this.tel_filial = tel_filial;
    }

    public String getCnpj_filial() {
        return cnpj_filial;
    }

    public void setCnpj_filial(String cnpj_filial) {
        this.cnpj_filial = cnpj_filial;
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
        return nome_filial + " " + cidade_filial + " " + endereco_filial + " " + tel_filial
                + " " + cnpj_filial + " " + estoque;
    }
}
