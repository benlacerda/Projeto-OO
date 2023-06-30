package Controle;

import java.util.ArrayList;
import java.util.List;

import Modelo.*;

/**
 * Classe de controle da classe Dados.
 * Possui os métodos responsáveis pelo CRUD das classes.
 */
public class DadosControl {

    private Dados d = new Dados();

    /**
     * Método que retorna os dados.
     * 
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

    public Bone[] busca_nome(String nome_bone) {
        BoneCasual[] bonesCasual = getBoneCasuals();
        BoneEsportivo[] bonesEsportivos = getBoneEsportivos();

        List<Bone> resultados = new ArrayList<>();

        // Buscar nos bones casuais
        for (BoneCasual boneCasual : bonesCasual) {
            if (boneCasual != null && boneCasual.getnome().equalsIgnoreCase(nome_bone)) {
                resultados.add(boneCasual);
            }
        }

        // Buscar nos bones esportivos
        for (BoneEsportivo boneEsportivo : bonesEsportivos) {
            if (boneEsportivo != null && boneEsportivo.getnome().equalsIgnoreCase(nome_bone)) {
                resultados.add(boneEsportivo);
            }
        }

        // Converter a lista de resultados em um array
        Bone[] resultadoArray = new Bone[resultados.size()];
        resultadoArray = resultados.toArray(resultadoArray);

        return resultadoArray;
    }

    public boolean inserirEditarBoneCasual(String[] dadosBoneCasual) {
	    try {
	        BoneCasual bc = new BoneCasual(dadosBoneCasual[1], dadosBoneCasual[2],
	                Double.parseDouble(dadosBoneCasual[3]), dadosBoneCasual[4], dadosBoneCasual[5], dadosBoneCasual[6]);
	        d.inserirEditarBoneCasual(bc, Integer.parseInt(dadosBoneCasual[0]));
	        return true; // Inserção bem-sucedida
	    } catch (Exception e) {
	        return false; // Ocorreu uma exceção durante a inserção
	    }
	}

    public boolean inserirEditarBoneEsportivo(String[] dadosBoneEsportivo) {
	    try {
	        BoneEsportivo be = new BoneEsportivo(dadosBoneEsportivo[1], dadosBoneEsportivo[2],
	                Double.parseDouble(dadosBoneEsportivo[3]), dadosBoneEsportivo[4], dadosBoneEsportivo[5], dadosBoneEsportivo[6]);
	        d.inserirEditarBoneEsportivo(be, Integer.parseInt(dadosBoneEsportivo[0]));
	        return true; // Inserção bem-sucedida
	    } catch (Exception e) {
	        return false; // Ocorreu uma exceção durante a inserção
	    }
	}


    public boolean temoverBoneCasual(int posicao) {
        try{
            BoneCasual[] dBonesCasuais = this.d.getdBonesCasuals();
            int qntdBonesCasuais = this.d.getQntd_boneCasuals();

            if (posicao >= 0 && posicao < qntdBonesCasuais) {
                for (int i = posicao; i < qntdBonesCasuais - 1; i++) {
                    dBonesCasuais[i] = dBonesCasuais[i + 1];
                }

                dBonesCasuais[qntdBonesCasuais - 1] = null;
                this.d.setQntd_boneCasual(qntdBonesCasuais - 1);
            }
            return true;
        }catch (Exception e) {
	        return false; // Ocorreu uma exceção durante a inserção
        }
    }

    /**
     * @param posicao
     */
    public boolean removerBoneEsportivo(int posicao) {
        try{
            BoneEsportivo[] dBonesEsportivos = this.d.getdBonesEsportivos();
            int qntdBonesEsportivos = this.d.getQntd_boneEsportivo();
            
            if (posicao >= 0 && posicao < qntdBonesEsportivos) {
                for (int i = posicao; i < qntdBonesEsportivos - 1; i++) {
                    dBonesEsportivos[i] = dBonesEsportivos[i + 1];
                }
                
                dBonesEsportivos[qntdBonesEsportivos - 1] = null;
                this.d.setQntd_boneEsportivo(qntdBonesEsportivos - 1);
            }
            return true;
        }catch (Exception e) {
	        return false; // Ocorreu uma exceção durante a inserção
        }
    }

}
