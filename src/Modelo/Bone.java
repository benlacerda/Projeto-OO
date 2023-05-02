package Modelo;

// Classe Bone
public class Bone {

    //Atributos
    private String nome_bone;
    private String marca_bone;
    private String preco_bone;
    private String descricao_bone;
    private String foto_bone;
    private String qntd_bone;

    //Métodos
    public Bone(String nm, String mrc, String prc, String des, String img, String q){
        nome_bone=nm;
        marca_bone=mrc;
        preco_bone=prc;
        descricao_bone=des;
        foto_bone=img;
        qntd_bone=q;
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

    public String getPreco_bone(){
        return preco_bone;
    }

    public void setPreco_bone(String preco_bone){
        this.preco_bone=preco_bone;
    }
    public String getDescricao_bone(){
        return descricao_bone;
    }

    public void setDescricao_bone(String descricao_bone){
        this.descricao_bone=descricao_bone;
    }
    public String getFoto_bone(){
        return foto_bone;
    }

    public void setFoto_bone(String foto_bone){
        this.foto_bone=foto_bone;
    }
    public String getQntd_bone(){
        return qntd_bone;
    }

    public void setQntd_bone(String qntd_bone){
        this.qntd_bone=qntd_bone;
    }

    // Representar em String o objeto
    @Override
    public String toString()
    {
        return this.nome_bone + " " + this.marca_bone + " " + this.preco_bone+ " " + this.descricao_bone+ " " + this.foto_bone+ " " + this.qntd_bone;
    }



}
