import java.time.LocalDate;

public class Livro {
    private final int id;
    private final String titulo;
    private final Autor autor;
    private boolean disponivel;
    private final LocalDate dataCadastro;
    private LocalDate dataAtualizacao;

    public Livro(int id, String titulo, Autor autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        this.dataCadastro = LocalDate.now();
        this.dataAtualizacao = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        this.dataAtualizacao = LocalDate.now();
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + titulo + " - " + autor.getNome() +
                (disponivel ? " (Disponível)" : " (Emprestado)");
    }
}
