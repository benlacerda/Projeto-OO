package Modelo;

public class Dados {

    private static BoneCasual[] dBonesCasual = new BoneCasual[50];
    private static BoneEsportivo[] dBonesEsportivos = new BoneEsportivo[50];
    private int qntd_boneCasual = 3;
    private int qntd_boneEsportivo = 3;
    private static Filial[] dFiliais = new Filial[50];
    private int qntd_filial = 3;

    static {
        dBonesCasual[0] = new BoneCasual("BoneC1", "Marca1", 10.0, "Descrição1", "Casual", "12");
        dBonesCasual[1] = new BoneCasual("BoneC2", "Marca2", 15.0, "Descrição2", "Casual", "15");
        dBonesCasual[2] = new BoneCasual("BoneC3", "Marca3", 20.0, "Descrição3", "Casual", "89");
        dBonesEsportivos[0] = new BoneEsportivo("BoneE1", "Marca1", 10.0, "Descrição1", "Esportivo", "65");
        dBonesEsportivos[1] = new BoneEsportivo("BoneE2", "Marca2", 15.0, "Descrição2", "Esportivo", "45");
        dBonesEsportivos[2] = new BoneEsportivo("BoneE3", "Marca3", 20.0, "Descrição3", "Esportivo", "96");
        
        dFiliais[0] = new Filial("Filial1", "Cidade1");
        dFiliais[1] = new Filial("Filial2", "Cidade2");
        dFiliais[2] = new Filial("Filial3", "Cidade3");
    }

    public BoneCasual[] getdBonesCasuals() {
        return dBonesCasual;
    }
    public int getQntd_boneCasuals() {
		return qntd_boneCasual;
	}
    public void setQntd_boneCasual(int qntd_boneCasual) {
		this.qntd_boneCasual = qntd_boneCasual;
	}

    public BoneEsportivo[] getdBonesEsportivos() {
        return dBonesEsportivos;
    }
    public int getQntd_boneEsportivo() {
		return qntd_boneEsportivo;
	}
    public void setQntd_boneEsportivo(int qntd_boneEsportivo) {
		this.qntd_boneEsportivo = qntd_boneEsportivo;
	}
    public void inserirEditarBoneCasual(BoneCasual bon_casual, int pos) {
		Dados.dBonesCasual[pos] = bon_casual;
	}
     public void inserirEditarBoneEsportivo(BoneEsportivo bon_esportivo, int pos) {
		Dados.dBonesEsportivos[pos] = bon_esportivo;
	}
    public Filial[] getdFiliais() {
        return dFiliais;
    }
    public int getQntd_filial() {
		return qntd_filial;
	}
    public void setQntd_filial(int qntd_filial) {
		this.qntd_filial = qntd_filial;
	}
    
    public void inserirEditaFilial(Filial f, int pos) {
        Dados.dFiliais[pos] = f;
    }

    public Bone[] getListaBones() {
        return null;
    }
}
