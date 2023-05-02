package Modelo;

public class PessoaJuridica extends Pessoa{
    //Atributos

    private String num_cnpj;

    //Métodos

    public PessoaJuridica(String cnpj){
        num_cnpj=cnpj;
    }

    public String getNum_cnpj(){
        return num_cnpj;
    }

    public void setNum_cnpj(String num_cnpj){
        this.num_cnpj=num_cnpj;
    }

    // Representar em String o objeto
    @Override
    public String toString()
    {
        return this.num_cnpj;
    }

}
