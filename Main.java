public class Main {
    
	public static void main(String[] args) {
	    Carro meuCarro = new Carro();
	    Pessoa umaPessoa = new Pessoa();
	    
	    meuCarro.setTipo("ESPORTIVO");
	    meuCarro.setCor("AZUL");
	    meuCarro.setPlaca("CRZ-1921");
	    meuCarro.setNumPortas(6);
	    
	    System.out.println("-----CARRO-----");
		  System.out.println("Tipo: " + meuCarro.getTipo());
		  System.out.println("Cor: " + meuCarro.getCor());
		  System.out.println("Placa: " + meuCarro.getPlaca());
		  System.out.println("Portas: " + meuCarro.getNumPortas());
	    System.out.println(" ");
	    
	    
	    umaPessoa.setNome("JHULIANO");
	    umaPessoa.setCorDoCabelo("CASTANHO");
	    umaPessoa.setBiotipo("FORTE");
	    umaPessoa.setIdade(20);
	    
	    System.out.println("-----PESSOA-----");
		  System.out.println("Nome: " + umaPessoa.getNome());
		  System.out.println("Cor do Cabelo: " + umaPessoa.getCorDoCabelo());
		  System.out.println("Biotipo: " + umaPessoa.getBiotipo());
		  System.out.println("Idade: " + umaPessoa.getIdade());
		
	}
}
