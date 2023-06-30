package Controle;

import Modelo.BoneEsportivo;

public class BoneEsportivoControl {
    private BoneEsportivo[] be;
    private int qntdbe;

    public BoneEsportivoControl(DadosControl d) {
        be = d.getBoneEsportivos();
        qntdbe = d.getQntd_boneEsportivo();
    }

    public String[] getNomeBoneEsportivo() {
        String[] e = new String[qntdbe];
        for(int j = 0; j < qntdbe; j++) {
            e[j] = be[j].getnome();
        }
        return e;
    }

    public int getQntd_boneEsportivos() {
        return qntdbe;
    }

    public void setQntd_boneEsportivo(int qtd) {
        this.qntdbe = qtd;
    }

    public String getnome(int i) {
        return be[i].getnome();
    }

    public String getmarca(int i) {
        return be[i].getmarca();
    }

    public String getpreco(int i) {
        return String.valueOf(be[i].getpreco());
    }

    public String getdescricao(int i) {
        return be[i].getdescricao();
    }

    public String getTipoEsportivo(int i) {
        return be[i].getTipo_esportivo();
    }

    public String getCodEsportivo(int i) {
        return String.valueOf(be[i].getCodigo_id_esportivo());
    }
}
