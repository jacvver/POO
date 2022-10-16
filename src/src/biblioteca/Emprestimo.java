package biblioteca;

public class Emprestimo {
    String dataEmprestimo;
    String horaEmprestimo;
    Usuario usuario;
    Livro livro;

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }


    public void setHoraEmprestimo(String horaEmprestimo) {
        this.horaEmprestimo = horaEmprestimo;
    }
    public String getHoraEmprestimo() {
        return horaEmprestimo;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }


    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    public Livro getLivro() {
        return livro;
    }

    public Emprestimo() {

    }
    public Emprestimo(String dataEmprestimo, String horaEmprestimo, Usuario nomeUsuario, Livro tituloLivro){
        this.dataEmprestimo = dataEmprestimo;
        this.horaEmprestimo = horaEmprestimo;
        this.usuario = nomeUsuario;
        this.livro = tituloLivro;
    }
}
