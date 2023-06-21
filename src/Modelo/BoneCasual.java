package Modelo;

public class BoneCasual extends Bone {

    // Atributos
    private String tipo_casual;
    private int codigo_id_casual;

    // Construtor
    public BoneCasual(String nm, String mrc, double prc, String des, String img, int qntde, String tp_casu, int cod_id) {
        super(nm, mrc, prc, des, img, qntde);
        tipo_casual = tp_casu;
        codigo_id_casual = cod_id;
    }

    // Getters e Setters
    public String getTipo_casual() {
        return tipo_casual;
    }

    public void setTipo_casual(String tipo_casual) {
        this.tipo_casual = tipo_casual;
    }

    public int getCodigo_id() {
        return codigo_id_casual;
    }

    public void setCodigo_id(int codigo_id_casual) {
        this.codigo_id_casual = codigo_id_casual;
    }

    // Representar o objeto como String
    @Override
    public String toString() {
        return super.toString() + " " + tipo_casual + " " + codigo_id_casual;
    }
}
