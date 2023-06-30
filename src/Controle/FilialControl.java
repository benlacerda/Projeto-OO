package Controle;

import Modelo.Filial;

public class FilialControl{

    private Filial[] f;
    private int qntdf;

    public FilialControl(DadosControl d) {
        f = d.getFiliais();
		qntdf = d.getQntd_filial();
    }

    public String[] getNomeFilial() {
		String[] s = new String[qntdf];
		for(int i = 0; i < qntdf; i++) {
			s[i] = f[i].getNome_filial();
		}
		return s;
	}
	
	public int getQntd_filial() {
		return qntdf;
	}

    public void setQntd_filial(int qtd) {
		this.qntdf = qtd;
	}

    public String getNome(int i) {		
		return f[i].getNome_filial();
	}
	
	public String getCidade(int i) {
		String cid = String.valueOf(f[i].getCidade_filial());
		return cid;
	}
}
