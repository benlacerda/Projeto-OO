package Modelo;

//Testar todas classes
public class Teste {
	public static void main(String[] args) {
		//Populando os objetos

		//Referencia da classe Bone https://www.netshoes.com.br/bone-oakley-aba-curva-fechado-tincan-preto+branco-D63-0821-026
		Bone b1= new Bone("Boné Aba Curva StrapBack Anth Co", "NYC", "68.90","Para completar os looks ao estilo urbano, aposte em"
				+ " acessórios como o Boné Oakley Aba Curva Tincan.","images/oakley_tincan.png", "5");
		Filial f1 = new Filial("Filial - Netshoes", "Cid - Sao Paulo","End - Sede netshoes", "Tel - 40028922", "CNPJ - 22.588.465/0001-48");


		//Print dos dados no console
		System.out.println(b1.toString());
		System.out.println(f1.toString());


	}
}