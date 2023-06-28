package Controle;

import Modelo.*;

/**
 * Classe de controle da classe Dados, sendo pai das outras classes de Controle. Possui os métodos abstratos responsáveis pelo CRUD das classes.
 */
public abstract class DadosControl {

    private Dados d = new Dados();

    /**
     * Método que retorna os dados.
     * @return Dados
     */
    public Dados getDados() {
        return d;
    }

    public void setDados(Dados d) {
		this.d = d;
	}

    public BoneCasual[] getBoneCasuals() {
		return this.d.getdBonesCasuals();
	}

    public int getQntd_boneCasuals() {
		return this.d.getQntd_boneCasuals();
	}
    public BoneEsportivo[] getBoneEsportivos() {
		return this.d.getdBonesEsportivos();
	}

    public int getQntd_boneEsportivo() {
		return this.d.getQntd_boneEsportivo();
	}

    public Filial[] getFiliais() {
		return this.d.getdFiliais();
	}

    public int getQntd_filial() {
		return this.d.getQntd_filial();
	}


    public void inserirBoneCasual(String[] dadosBoneCasual) {
        BoneCasual boneCasual = new BoneCasual(dadosBoneCasual[0], dadosBoneCasual[1], Double.parseDouble(dadosBoneCasual[2]), dadosBoneCasual[3], dadosBoneCasual[4], dadosBoneCasual[5]);
        BoneCasual[] dBonesCasuals = this.d.getdBonesCasuals();
        dBonesCasuals[this.d.getQntd_boneCasuals()] = boneCasual;
        this.d.setQntd_boneCasual(this.d.getQntd_boneCasuals() + 1);
    }


    public void inserirBoneEsportivo(String[] dadosBoneEsportivo) {
        BoneEsportivo boneEsportivo = new BoneEsportivo(dadosBoneEsportivo[0], dadosBoneEsportivo[1], Double.parseDouble(dadosBoneEsportivo[2]), dadosBoneEsportivo[3], dadosBoneEsportivo[4], dadosBoneEsportivo[5]);
        BoneEsportivo[] dBonesEsportivos = this.d.getdBonesEsportivos();
        dBonesEsportivos[this.d.getQntd_boneEsportivo()] = boneEsportivo;
        this.d.setQntd_boneEsportivo(this.d.getQntd_boneEsportivo() + 1);
    }

    public void editarBoneEsportivo(int posicao, String[] dadosBoneEsportivo) {
        BoneEsportivo boneEsportivo = new BoneEsportivo(dadosBoneEsportivo[0], dadosBoneEsportivo[1], Double.parseDouble(dadosBoneEsportivo[2]), dadosBoneEsportivo[3], dadosBoneEsportivo[4], dadosBoneEsportivo[5]);
        BoneEsportivo[] dBonesEsportivos = this.d.getdBonesEsportivos();
        dBonesEsportivos[posicao] = boneEsportivo;
    }


    public void editarBoneCasual(int posicao, String[] dadosBoneCasual) {
        BoneCasual boneCasual = new BoneCasual(dadosBoneCasual[0], dadosBoneCasual[1], Double.parseDouble(dadosBoneCasual[2]), dadosBoneCasual[3], dadosBoneCasual[4], dadosBoneCasual[5]);
        BoneCasual[] dBonesCasuais = this.d.getdBonesCasuals();
        dBonesCasuais[posicao] = boneCasual;
    }

    public void deletarBoneCasual(int posicao) {
        BoneCasual[] dBonesCasuais = this.d.getdBonesCasuals();
        int qntdBonesCasuais = this.d.getQntd_boneCasuals();
        
        if (posicao >= 0 && posicao < qntdBonesCasuais) {
            for (int i = posicao; i < qntdBonesCasuais - 1; i++) {
                dBonesCasuais[i] = dBonesCasuais[i + 1];
            }
            
            dBonesCasuais[qntdBonesCasuais - 1] = null;
            this.d.setQntd_boneCasual(qntdBonesCasuais - 1);
        }
    }
    public void deletarBoneEsportivo(int posicao) {
    BoneEsportivo[] dBonesEsportivos = this.d.getdBonesEsportivos();
    int qntdBonesEsportivos = this.d.getQntd_boneEsportivo();
    
    if (posicao >= 0 && posicao < qntdBonesEsportivos) {
        for (int i = posicao; i < qntdBonesEsportivos - 1; i++) {
            dBonesEsportivos[i] = dBonesEsportivos[i + 1];
        }
        
        dBonesEsportivos[qntdBonesEsportivos - 1] = null;
        this.d.setQntd_boneEsportivo(qntdBonesEsportivos - 1);
    }
}

    /**
     * Métodos que serão destrinchados em cada uma das outras classes de Controle:
     * (1) getLista -> Relacionado ao R de CRUD;
     */
    public abstract Bone[] getLista();
    /**
     * (2) inserir  -> Relacionado ao C de CRUD;
     * @param dados -> Dados relacionados à classe.
     * @return boolean
     */
    public abstract boolean inserir(String[] dados);
    /**
     * (3) editar   -> Relacionado ao U de CRUD;
     * @param dados -> Dados relacionados à classe.
     * @return boolean
     */
    public abstract boolean editar(String[] dados);
    /**
     * (4) remover  -> Relacionado ao D de CRUD;
     * @param i -> Posição do elemento.
     * @return boolean
     */
    public abstract boolean remover(int i);

    /**
     * Método que conta a quantidade de elementos de uma classe estão cadastrados.
     * @param lista -> Array contendo os objetos instanciados de uma classe.
     * @return int -> Quantidade.
     */
    protected int getQtdeLista(Bone[] lista) {
        int count = -1;
        for(int i = 0; i < lista.length; i++) {
            if(lista[i] == null) {
                break;
            }
            count = i+1;
        }
        return count;
    }
}
