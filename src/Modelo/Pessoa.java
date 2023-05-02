package Modelo;
//Classe Abstrata
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected String email;
    protected String senha;
    protected int telefone;

    //Métodos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha=senha;
    }

    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone=telefone;
    }
}
