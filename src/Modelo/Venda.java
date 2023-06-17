package Modelo;
import java.util.List;
import java.util.*;

public class Venda {
    //Atributos
    private int id_venda;
    private List<Bone> bone;

    //Métodos
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



    // Representar em String o objeto
    public String toString()
    {
        return this.id_venda+ " " + this.bone;
    }
}
