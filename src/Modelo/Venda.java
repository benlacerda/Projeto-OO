package Modelo;
import java.util.List;
import java.util.*;

public class Venda {
    //Atributos
    private int id_venda;
    private List<Bone> bone;
    private List<Pagamento> met_pag;

    public Venda(int id){
        id_venda=id;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public List<Bone> getBone() {
        return bone;
    }

    public void setBone(List<Bone> bone) {
        this.bone = bone;
    }

    public List<Pagamento> getMet_pag() {
        return met_pag;
    }

    public void setMet_pag(List<Pagamento> met_pag) {
        this.met_pag = met_pag;
    }
    //overriding the toString() method
    @Override
    public String toString()
    {
        return this.id_venda+ " " + this.bone + " " + this.met_pag;
    }
}
