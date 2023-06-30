package Modelo;

public class BoneEsportivo extends Bone {

    // Atributos
    private String tipo_esportivo;
    private String codigo_id_esportivo;

    public BoneEsportivo(){
        super();
    }

    // Construtor
    public BoneEsportivo(String nm, String mrc, double prc, String des, String tp_esport, String cod_id) {
        tipo_esportivo = tp_esport;
        codigo_id_esportivo = cod_id;
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

    public String getTipo_esportivo() {
        return tipo_esportivo;
    }

    public void setTipo_esportivo(String tipo_esportivo) {
        this.tipo_esportivo = tipo_esportivo;
    }

    public String getCodigo_id_esportivo() {
        return codigo_id_esportivo;
    }

    public void setCodigo_id_esportivo(String codigo_id_esportivo) {
        this.codigo_id_esportivo = codigo_id_esportivo;
    }
}
