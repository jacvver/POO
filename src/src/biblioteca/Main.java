package biblioteca;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Jhuliano", "Masculino", "91234-5678", 20);
        Livro livro = new Livro("As Crônicas de Gelo e Fogo - A Guerra dos Tronos", "George R. R. Martin", "Fantasia", "LeYa", "Brasileira", 2010, 592);
        Emprestimo emprestimo = new Emprestimo("15/10/2022", "22:12", usuario, livro);

        System.out.println("-----USUÁRIO-----");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Sexo: " + usuario.getSexo());
        System.out.println("Telefone: " + usuario.getTelefone());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println(" ");

        System.out.println("-----LIVRO-----");
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor(es): " + livro.getAutores());
        System.out.println("Area: " + livro.getArea());
        System.out.println("Editora: " + livro.getEditora());
        System.out.println("Edição: " + livro.getEdicao());
        System.out.println("Ano: " + livro.getAno());
        System.out.println("Número de Folhas: " + livro.getNumFolhas());
        System.out.println(" ");

        System.out.println("-----EMPRESTIMO-----");
        System.out.println("Data do Emprestimo: " + emprestimo.getDataEmprestimo());
        System.out.println("Hora do Emprestimo: " + emprestimo.getHoraEmprestimo());
        System.out.println("Usuario: " + emprestimo.getUsuario().getNome());
        System.out.println("Livro: " + emprestimo.getLivro().getTitulo());
    }
}
