package faculdade.livro;

public class Livro {
    private String nome;
    private String autor;
    private String editora;
    private int edicao;
    private int anoPublicacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public Livro () {
        this.nome = "desconhecido";
        this.autor = "desconhecido";
        this.editora = "desconhecido";
        this.edicao = 0;
        this.anoPublicacao = 0;
    }

    public Livro(String nome, String autor, String editora, int edicao, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
    }

    public String toString() {
        return "Nome do livro: " + this.nome + "\n" +
               "Autor do livro: " + this.autor + "\n" +
               "Editora do livro: " + this.editora + "\n" +
               "Edicao do livro: " + this.edicao + "\n" +
               "Ano de publicação do livro: " + this.anoPublicacao;
    }

}
