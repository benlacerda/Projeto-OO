package Controle;

import Modelo.Bone;
import Modelo.BoneCasual;

public class BoneCasualControl extends DadosControl {
    private BoneCasual[] bc;
    private int qntdbc;

    public BoneCasualControl(DadosControl d) {
		bc = d.getBoneCasuals();
		qntdbc = d.getQntd_boneCasuals();
	}

    public String[] getNome() {
		String[] s = new String[qntdbc];
		for(int i = 0; i < qntdbc; i++) {
			s[i] = bc[i].getNome_bone();
		}
		
		return s;
	}
	
	public int getQntd_boneCasuals() {
		return qntdbc;
	}

	public void setQntd_boneCasual(int qtd) {
		this.qntdbc = qtd;
	}
	
	public String getNome(int i) {		
		return bc[i].getNome_bone();
	}
	
	public String getMarca(int i) {
		String mrc = String.valueOf(bc[i].getMarca_bone());
		return mrc;
	}

    public String getPreco(int i){
        String prc = String.valueOf(bc[i].getPreco_bone());
        return prc;
    }

    public String getDescricao(int i) {
		String des = String.valueOf(bc[i].getDescricao_bone());
		return des;
	}
    public String getTipoCasual(int i) {
		String tpCasual = String.valueOf(bc[i].getTipo_casual());
		return tpCasual;
	}
    public String getCodCasual(int i) {
		String codCasual = String.valueOf(bc[i].getCodigo_id_casual());
		return codCasual;
	}

	

	
    @Override
    public Bone[] getLista() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLista'");
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
