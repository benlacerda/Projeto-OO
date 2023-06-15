package Modelo;

public class BoneEsportivo extends Bone{

    //Atributos
    private String tipo_esportivo;
    private int codigo_id_esportivo;

    //Metodos

    //Sobrescrita
    public BoneCasual(String nm, String mrc, String prc, String des, String img, String qntde, tp_casu, cod_id){
        super(nm, mrc, prc,des, img, qntde);
        tipo_esportivo = tp_casu;
        codigo_id_esportivo = cod_id;
    }

    public String getTipo_esportivo(){
        return tipo_esportivo;
    }

    public void setTipo_esportivo(String tipo_esportivo){
        this.tipo_esportivo=tipo_esportivo;
    }

    public String getCodigo_id(){
        return codigo_id_esportivo;
    }

    public void setCodigo_id(String codigo_id_esportivo){
        this.codigo_id_esportivo=codigo_id_esportivo;
    }

    //public String toString()
    {
        //return this.num_cnpj;
    }

}