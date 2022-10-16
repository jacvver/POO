public class Emprestimos {
    String dataEmprestimo;
    String horaEmprestimo;
    Usuario nomeUsuario;
    Livro tituloLivro;

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


    public void setNomeUsuario(Usuario nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public Usuario getNomeUsuario() {
        return nomeUsuario;
    }


    public void setTituloLivro(Livro tituloLivro) {
        this.tituloLivro = tituloLivro;
    }
    public Livro getTituloLivro() {
        return tituloLivro;
    }
}
