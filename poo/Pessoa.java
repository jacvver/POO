public class Pessoa {
    String nome;
    String corDoCabelo;
    String biotipo;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCorDoCabelo(String corDoCabelo) {
        this.corDoCabelo = corDoCabelo;
    }
    public String getCorDoCabelo() {
        return corDoCabelo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }
    public String getBiotipo() {
        return biotipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public Pessoa() {

    }

    public Pessoa(String nome, String corDoCabelo, String biotipo, int idade) {
        this.nome = nome;
        this.corDoCabelo = corDoCabelo;
        this.biotipo = biotipo;
        this.idade = idade;
    }
}