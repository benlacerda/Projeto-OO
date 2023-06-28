package Modelo;

// Classe Bone
//Herança
public class Bone {

    //Atributos
    protected String nome_bone;
    protected String marca_bone;
    protected double preco_bone;
    protected String descricao_bone;

    public Bone(String nome1, String marca1, double v, String descrição1, String url, int i){
        super();
    }

    //Métodos
    public Bone(String nm, String mrc, Double prc, String des){
        nome_bone=nm;
        marca_bone=mrc;
        preco_bone=prc;
        descricao_bone=des;
    }

    //Gets e sets
    public String getNome_bone(){
        return nome_bone;
    }

    public void setNome_bone(String nome_bone){
        this.nome_bone=nome_bone;
    }

    public String getMarca_bone(){
        return marca_bone;
    }

    public void setMarca_bone(String marca_bone){
        this.marca_bone=marca_bone;
    }

    public double getPreco_bone(){
        return preco_bone;
    }

    public void setPreco_bone(Double preco_bone){
        this.preco_bone=preco_bone;
    }
    public String getDescricao_bone(){
        return descricao_bone;
    }

    public void setDescricao_bone(String descricao_bone){
        this.descricao_bone=descricao_bone;
    }

    // Representar em String o objeto
    public String toString()
    {
        return this.nome_bone + " " + this.marca_bone + " " + this.preco_bone+ " " + this.descricao_bone;
    }



}
