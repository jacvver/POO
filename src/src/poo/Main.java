package poo;

public class Main {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        Carro meuOutroCarro = new Carro("PASSEIO", "VERMELHO", "CRU-6161", 6);

        Pessoa umaPessoa = new Pessoa();
        Pessoa umaOutraPessoa = new Pessoa("ANA PAULA", "CASTANHO", "MAGRA", 17);

        meuCarro.setTipo("ESPORTIVO");
        meuCarro.setCor("AZUL");
        meuCarro.setPlaca("CRZ-1921");
        meuCarro.setNumPortas(6);

        System.out.println("-----CARRO1-----");
        System.out.println("Tipo: " + meuCarro.getTipo());
        System.out.println("Cor: " + meuCarro.getCor());
        System.out.println("Placa: " + meuCarro.getPlaca());
        System.out.println("Portas: " + meuCarro.getNumPortas());

        System.out.println("-----CARRO2-----");
        System.out.println("Tipo: " + meuOutroCarro.getTipo());
        System.out.println("Cor: " + meuOutroCarro.getCor());
        System.out.println("Placa: " + meuOutroCarro.getPlaca());
        System.out.println("Portas: " + meuOutroCarro.getNumPortas());
        System.out.println(" ");


        umaPessoa.setNome("JHULIANO");
        umaPessoa.setCorDoCabelo("CASTANHO");
        umaPessoa.setBiotipo("FORTE");
        umaPessoa.setIdade(20);

        System.out.println("-----PESSOA1-----");
        System.out.println("Nome: " + umaPessoa.getNome());
        System.out.println("Cor do Cabelo: " + umaPessoa.getCorDoCabelo());
        System.out.println("Biotipo: " + umaPessoa.getBiotipo());
        System.out.println("Idade: " + umaPessoa.getIdade());

        System.out.println("-----PESSOA2-----");
        System.out.println("Nome: " + umaOutraPessoa.getNome());
        System.out.println("Cor do Cabelo: " + umaOutraPessoa.getCorDoCabelo());
        System.out.println("Biotipo: " + umaOutraPessoa.getBiotipo());
        System.out.println("Idade: " + umaOutraPessoa.getIdade());

    }
}