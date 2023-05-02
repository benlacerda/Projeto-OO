package Modelo;

public class Pagamento {
    //Atributos
    private String metodo_pag;
    private String bandeira;
    private String numero;
    private String cvv;
    private String validade;

    //Métodos
    public Pagamento(String met, String band, String num, String cod, String val){
        metodo_pag=met;
        bandeira=band;
        numero=num;
        cvv=cod;
        validade=val;
    }
    public String getMetodo_pag(){
        return metodo_pag;
    }
    public void setMetodo_pag(String metodo){
        this.metodo_pag=metodo;
    }

    public String getBandeira(){
        return bandeira;
    }

    public void setBandeira(String bandeira){
        this.bandeira=bandeira;
    }

    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero=numero;
    }
    public String getCvv(){
        return cvv;
    }
    public void setCvv(String cvv){
        this.cvv=cvv;
    }

    public String getValidade(){
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    // Representar em String o objeto
    @Override
    public String toString()
    {
        return this.metodo_pag+ " " + this.bandeira + " " + this.numero+ " " + this.cvv+ " " + this.validade;
    }
}
