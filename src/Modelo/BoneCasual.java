package Modelo;

public class BoneCasual extends Bone {

    // Atributos
    private String tipo_casual; // 'E'- esportivo 'C' - casual
    private String codigo_id_casual;// busca por id

    public BoneCasual(){
        super();
    }

    // Sobrecarga
    public BoneCasual(String nm, String mrc, String des, String tp_casu, String cod_id) {
        nome = nm;
        marca = mrc;
        descricao = des;
        tipo_casual = tp_casu;
        codigo_id_casual = cod_id;
    }


    // Construtor
    public BoneCasual(String nm, String mrc, double prc, String des, String tp_casu, String cod_id) {
        nome = nm;
        marca = mrc;
        preco = prc;
        descricao = des;
        tipo_casual = tp_casu;
        codigo_id_casual = cod_id;
    }


    // Getters e Setters

    public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
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

    public String getTipo_casual() {
        return tipo_casual;
    }

    public void setTipo_casual(String tipo_casual) {
        this.tipo_casual = tipo_casual;
    }

    public String getCodigo_id_casual() {
        return codigo_id_casual;
    }

    public void setCodigo_id_casual(String codigo_id_casual) {
        this.codigo_id_casual = codigo_id_casual;
    }

}
