package Modelo;

public class BoneCasual extends Bone{

    //Atributos
    private String tipo_casual;
    private int codigo_id_casual;

    //Metodos

    //Sobrescrita
    public BoneCasual(String nm, String mrc, String prc, String des, String img, String qntde, tp_casu, cod_id){
        super(nm, mrc, prc,des, img, qntde);
        tipo_casual = tp_casu;
        codigo_id_casual = cod_id;
    }

    public String getTipo_casual(){
        return tipo_casual;
    }

    public void setTipo_casual(String tipo_casual){
        this.tipo_casual=tipo_casual;
    }

    public String getCodigo_id(){
        return codigo_id_casual;
    }

    public void setCodigo_id(String codigo_id_casual){
        this.codigo_id_casual=codigo_id_casual;
    }

    // Representar em String o objeto
    //public String toString()
    {
        //return this.num_cnpj;
    }
}