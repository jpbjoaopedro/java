package livro;

public class UsaLivro {
    public static void main(String[] args) {
        // Criando um livro usando o construtor padrão
        Livro livro1 = new Livro();
        
        // Criando um livro usando o construtor com parâmetros
        Livro livro2 = new Livro("Livro 2", "Autor 2", "Editora 2", 2, 2002);
        
        // Criando um livro usando o construtor padrão e depois modificando com setters
        Livro livro3 = new Livro();
        livro3.setNome("Livro 3");
        livro3.setAutor("Autor 3");
        livro3.setEditora("Editora 3");
        livro3.setEdicao(3);
        livro3.setAnoPublicacao(2003);

        System.out.println("\nLivro 1");
        System.out.println(livro1.toString());
        
        System.out.println("\nLivro 2");
        System.out.println(livro2.toString());
        
        System.out.println("\nLivro 3");
        System.out.println(livro3.toString());
    }
}
