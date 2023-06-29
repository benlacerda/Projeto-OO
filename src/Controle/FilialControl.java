package Controle;

import Modelo.Bone;
import Modelo.Filial;

public class FilialControl extends DadosControl{

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


    @Override
    public boolean inserir(String[] dados) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserir'");
    }

    @Override
    public boolean editar(String[] dados) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'editar'");
    }

    @Override
    public boolean remover(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remover'");
    }

    @Override
    public Bone[] getLista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLista'");
    }
}
