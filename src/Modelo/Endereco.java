package Modelo;

public class Endereco {
    //Atributos

    private String cidade;
    private String estado;
    private String pais;
    private String codigo_postal;
    private String logradouro;
    private String complemento;

    public Endereco(String cid, String est, String ps, String cep, String logra, String comp){
        cidade=cid;
        estado=est;
        pais=ps;
        codigo_postal=cep;
        logradouro=logra;
        complemento=comp;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //overriding the toString() method
    @Override
    public String toString()
    {
        return this.cidade + " " + this.estado + " " + this.pais+ " " + this.codigo_postal+ " "
                + this.logradouro+ " " + this.complemento;
    }
}

