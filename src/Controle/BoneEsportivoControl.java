package Controle;

import Modelo.Bone;
import Modelo.BoneEsportivo;
import Modelo.Dados;

public class BoneEsportivoControl extends DadosControl {

    private BoneEsportivo[] be;
    private int qntdbe;

    public BoneEsportivoControl(DadosControl d) {
		be = d.getBoneEsportivos();
		qntdbe = d.getQntd_boneEsportivo();
	}

    public String[] getNome() {
		String[] s = new String[qntdbe];
		for(int i = 0; i < qntdbe; i++) {
			s[i] = be[i].getNome_bone();
		}
		
		return s;
	}
	
	public int getQntd_boneEsportivos() {
		return qntdbe;
	}

	public void setQntd_boneEsportivo(int qtd) {
		this.qntdbe = qtd;
	}
	
	public String getNome(int i) {		
		return be[i].getNome_bone();
	}
	
	public String getMarca(int i) {
		String mrc = String.valueOf(be[i].getMarca_bone());
		return mrc;
	}

    public String getPreco(int i){
        String prc = String.valueOf(be[i].getPreco_bone());
        return prc;
    }

    public String getDescricao(int i) {
		String des = String.valueOf(be[i].getDescricao_bone());
		return des;
	}
    public String getTipoEsportivo(int i) {
		String tpEsportivo = String.valueOf(be[i].getTipo_esportivo());
		return tpEsportivo;
	}
    public String getCodEsportivo(int i) {
		String codEsportivo = String.valueOf(be[i].getCodigo_id_esportivo());
		return codEsportivo;
	}

    @Override
    public Bone[] getLista() {
        // Obtenha a lista de Bones do objeto Dados
        Dados dados = getDados();
        Bone[] listaBones = dados.getListaBones();

        // Retorne a lista de Bones
        return listaBones;
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

   
}
