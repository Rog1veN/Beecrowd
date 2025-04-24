package somativa;

public class Livro {

    private String titulo;
    private String autor;
    private String categoria;


    //construtores
    public Livro(String titulo, String autor, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public Livro() {
    }

    //getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getCategoria(){
        return categoria;
    }


    //métodos para o hashmap
    @Override
    public String toString() {
        return titulo + " - " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Livro)) return false;
        Livro outro = (Livro) obj;
        return this.titulo.equalsIgnoreCase(outro.titulo) &&
               this.autor.equalsIgnoreCase(outro.autor);
    }
    
    @Override
    public int hashCode() {
        return titulo.toLowerCase().hashCode() + autor.toLowerCase().hashCode();
    }
}
