package Controle;

import Modelo.*;

public class BoneCasualControl {
    private BoneCasual[] bc;
    private int qntdbc;

    public BoneCasualControl(DadosControl d) {
		bc = d.getBoneCasuals();
		qntdbc = d.getQntd_boneCasuals();
	}

    public String[] getNomeBoneCasual() {
		String[] s = new String[qntdbc];
		for(int i = 0; i < qntdbc; i++) {
			s[i] = bc[i].getnome();
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
		return bc[i].getnome();
	}
	
	public String getMarca(int i) {
		String mrc = String.valueOf(bc[i].getmarca());
		return mrc;
	}

    public String getPreco(int i){
        String prc = String.valueOf(bc[i].getpreco());
        return prc;
    }

    public String getDescricao(int i) {
		String des = String.valueOf(bc[i].getdescricao());
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
   
}
