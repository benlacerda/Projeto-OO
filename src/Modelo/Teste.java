package Modelo;

public class Teste {
	public static void main(String[] args) {
		//Populando os objetos

		//Referencia da classe Bone https://www.netshoes.com.br/bone-oakley-aba-curva-fechado-tincan-preto+branco-D63-0821-026
		Bone b1= new Bone("Boné Aba Curva StrapBack Anth Co", "NYC", "68.90","Para completar os looks ao estilo urbano, aposte em acessórios como o Boné Oakley Aba Curva Tincan. Versátil, o modelo traz o logo da marca com estampa camuflada com ajuste em elástico e ilhós para respirabilidade e conforto nas suas combinações.","images/oakley_tincan.png", "5");
		Filial f1 = new Filial("Netshoes", "São Paulo", "40028922");
		Endereco end1 = new Endereco("São Paulo", "SP", "Brasil", "06460908", "Avenida Aruanã 700 , Tamboré Barueri - SP",
				"Sede Netshoes");
		Pagamento pag1 = new Pagamento("Crédito", "Visa", "74548143000179", "1956", "0726");
		PessoaFisica pf = new PessoaFisica("85756785426");
		PessoaJuridica pj = new PessoaJuridica("77513998000152");

		//Print dos dados no console

		System.out.println(b1.toString());
		System.out.println(f1.toString());
		System.out.println(end1);
		System.out.println(pag1.toString());
		System.out.println(pf.toString());
		System.out.println(pj.toString());

	}
}