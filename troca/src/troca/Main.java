package troca;

public class Main {
    
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setTipo("ESPORTIVO");
		carro.setCor("AZUL");
		carro.setPlaca("CRZ-1921");
		carro.setNumPortas(6);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("JHULIANO");
		pessoa.setCorDoCabelo("CASTANHO");
		pessoa.setBiotipo("FORTE");
		pessoa.setIdade(20);
		
		carro.setDono(pessoa);
		
		System.out.println("-----CARRO-----");
		System.out.println("Tipo: " + carro.getTipo());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Placa: " + carro.getPlaca());
		System.out.println("Portas: " + carro.getNumPortas());
		System.out.println("Dono: " + carro.getDono().getNome());

	}
}