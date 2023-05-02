package Modelo;
import java.util.*;
public class ItensVenda {
    //Atributos

    private Bone item_venda;
    private int qntd_venda;

    //Métodos
    public ItensVenda(Bone bn, int q){
        item_venda=bn;
        qntd_venda=q;
    }

    public Bone getItem_venda() {
        return item_venda;
    }

    public void setItem_venda(Bone item_venda) {
        this.item_venda = item_venda;
    }

    public int getQntd_venda() {
        return qntd_venda;
    }

    public void setQntd_venda(int qntd_venda) {
        this.qntd_venda = qntd_venda;
    }
}
