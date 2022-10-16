package biblioteca;

public class Usuario {
    String nome;
    String sexo;
    String telefone;
    int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return sexo;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }
    public int getIdade() {
        return idade;
    }

    public Usuario() {

    }
    public Usuario(String nome, String sexo, String telefone, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
    }
}
