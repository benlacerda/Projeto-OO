package Modelo;

public class BoneEsportivo extends Bone {

    // Atributos
    private String tipo_esportivo;
    private int codigo_id_esportivo;

    // Construtor
    public BoneEsportivo(String nm, String mrc, double prc, String des, String img, int qntde, String tp_esport, int cod_id) {
        super(nm, mrc, prc, des, img, qntde);
        tipo_esportivo = tp_esport;
        codigo_id_esportivo = cod_id;
    }

    // Getters e Setters
    public String getTipo_esportivo() {
        return tipo_esportivo;
    }

    public void setTipo_esportivo(String tipo_esportivo) {
        this.tipo_esportivo = tipo_esportivo;
    }

    public int getCodigo_id() {
        return codigo_id_esportivo;
    }

    public void setCodigo_id(int codigo_id_esportivo) {
        this.codigo_id_esportivo = codigo_id_esportivo;
    }

    // Representar o objeto como String
    @Override
    public String toString() {
        return super.toString() + " " + tipo_esportivo + " " + codigo_id_esportivo;
    }
}
