package Modelo;

public class PessoaFisica extends Pessoa{
    //Atributos

    private String num_cpf;

    //Métodos

    public PessoaFisica(String cpf){
        num_cpf=cpf;
    }

    public String getNum_cpf(){
        return num_cpf;
    }

    public void setNum_cpf(String num_cpf){
        this.num_cpf=num_cpf;
    }
    //overriding the toString() method
    @Override
    public String toString()
    {
        return this.num_cpf;
    }


}
